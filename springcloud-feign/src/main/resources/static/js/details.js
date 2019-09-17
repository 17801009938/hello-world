$(function(){
    initDetails();
})
function initDetails() {
    var url = location.search; //获取上个页面updateOrder事件中url路径"?"符后的字串 ('?id=business&role=1')
    var theRequest = new Object();
    if (url.indexOf("?") != -1) {//先判断该路径中有没有"?"传参
        var str = url.substr(1); //substr()方法返回从参数值开始到结束的字符串；
        var strs = str.split("&");//{id=business,role=1}
        for (var i = 0; i < strs.length; i++) {
            theRequest[strs[i].split("=")[0]] = (strs[i].split("=")[1]);
        }
        //console.log( theRequest ); //此时的theRequest就是我们需要的参数；
        //现在我们想要所有参数直接用theRequest.属性就行了
    }
    $.post("../findReorder", {orderNum: theRequest.orderNum}, function (data) {
        $("#orderNum").val(data.orderNum);
        $("#status").val(data.status);
        $("#commitDate").val(data.commitDate);
        $("#reTime").val(data.reTime);
        var html = "<tr>\n" +
            "                        <td>垃圾类型</td>\n" +
            "                        <td>品名</td>\n" +
            "                        <td>单位</td>\n" +
            "                        <td>数量</td>\n" +
            "                    </tr>"
        var a = "干垃圾";
        var b = "湿垃圾";
        for (var i = 0; i < data.regoods.length; i++) {
            html += "<tr>\n" +
                "                        <td>" + data.regoods[i].retype + "</td>\n" +
                "                        <td>" + data.regoods[i].reName + "</td>\n" +
                "                        <td>" + data.regoods[i].unit + "</td>\n" +
                "                        <td>" + data.regoods[i].count + "</td>\n" +
                "                    </tr>";
        }
        $("#regoods").html(html);
        $("#address").val(data.address);
        $("#person").val(data.person);
        $("#telNumber").val(data.telNumber);

    })
}
    function result(){
        location.href="../page/toMain";
    }
