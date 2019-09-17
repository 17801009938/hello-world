$(function(){
    initOrderTable();
})

function initOrderTable(){
    $('#orderTable').bootstrapTable({
        toolbar:'#toolbar',
        url:'../queryOrder',//获取数据地址
        method:'post',
        contentType:'application/x-www-form-urlencoded',//post请求按照表单方式
        pagination:true, //是否展示分页
        clickToSelect: true, //是否启用点击选中行
        sidePagination:'server',//分页方式：client客户端分页，server服务端分页
        pageList:[3, 6, 9, 12],//分页组件
        pageNumber:1,
        pageSize:3,//默认每页条数
        striped:true,
        queryParams:function(){
            return {
                page: this.pageNumber,
                rows: this.pageSize,
            };
        },
        columns:[
            {checkbox:true},
            {field:'orderNum',title:'编号',align:'center',width:150},
            {field:'person',title:'联系人',align:'center',width:150},
            {field:'telNumber',title:'联系电话',width:150,align:'center'},
            {field:'reTime',title:'预约时间',width:150,formatter:function (value,row,index) {
                var result = "";
                if (value==1){
                    result = "尽快来取";
                }
                if (value==2){
                    result = "周六日取";
                }
                if (value==3){
                    result = "两日后来取";
                }
                return result;
                }},
            {field:'address',title:'收货地址',width:150},
            {field:'status',title:'状态',width:100,formatter:function(value){
                    var result = "";
                    if (value==1){
                        result = "待派单";
                    }
                    if (value==2){
                        result = "领取中";
                    }
                    if (value==3){
                        result = "已领取";
                    }
                    return result;
                }},
            {field:'commitDate',title:'下单时间',width:250},
            {field:'too',title:'操作',width:150,formatter:function(value,row,index){
                return "<a href='javascript:todetails("+row.orderNum+")'>详情</a>"
            }}
        ]
    });
}
function searchOrder(){
    var orderNum = $("#searchorderNum").val();
    var person = $("#searchperson").val();
    var startDate = $("#searchStartTime").val();
    var endDate = $("#searchEndTime").val();
    $("#orderTable").bootstrapTable("refresh", {
        query:{
            orderNum:orderNum,
            person:person,
            startDate:startDate,
            endDate:endDate
        }
    });
}
function todetails(orderNum){
    location.href="../page/todetails?orderNum="+orderNum;
}