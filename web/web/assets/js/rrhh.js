$(document).on('ready', function () {

    $('#methodGet').on('submit', function () {
       $.get("/rrhh", {"inputGetName": $("#inputGetName").val()}, function (data) {
           $("#userViaGet").show().find("span").text(data.name);
       });
        return false;
    });

    $("#methodPost").on('submit', function () {
        $.post("/rrhh", {"inputPostName": $("#inputPostName").val()}, function (data) {
            if (data.status == "success"){
                $("#postMessage").show().text(data.message).addClass("alert-success");
            }else{
                $("#postMessage").show().text(data.message).addClass("alert-danger");
            }
        });
       return false;
    });

    $("#methodDelete").on('submit', function () {
        $.ajax({
            url: "/rrhh?inputDeleteName=" + $("#inputDeleteName").val(),
            type: "delete",
            dataType: "json",
            success: function (data) {
                console.debug(data);
                if (data.status == "success"){
                    $("#deleteMessage").show().text(data.message).addClass("alert-success");
                }else{
                    $("#deleteMessage").show().text(data.message).addClass("alert-danger");
                }
            }
        });
        return false;
    });

    $("#methodPut").on('submit', function () {
        $.ajax({
            url: "/rrhh?inputPutOriginalName="+ $("#inputPutOriginalName").val() +"&inputPutNewName=" + $("#inputPutNewName").val(),
            type: "put",
            dataType: "json",
            success: function (data) {
                console.debug(data);
                if (data.status == "success"){
                    $("#putMessage").show().text(data.message).addClass("alert-success");
                }else{
                    $("#putMessage").show().text(data.message).addClass("alert-danger");
                }
            }
        });
        return false;
    });

});