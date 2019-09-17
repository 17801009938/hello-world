function tijiao(){

    $("#addFormre").form("submit",{

        url:'../saveReorderAll',

        type:"post",

        success:function(data){
            var data = JSON.parse(data);
            if (data.status){
                alert(data.msg)
            }
            if (!data.status){
                alert(data.msg)
            }

        }


    })




}