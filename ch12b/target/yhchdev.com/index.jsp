<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>


<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>

<script type="text/javascript">
    function testJson() {
        var pname = $("#pname").val();
        var password = $("#password").val();
        var age = $("#age").val();
        $.ajax({
            url:"${pageContext.request.contextPath }/testJson",
            type:"post",
            data:JSON.stringify({pname:pname,password:password,age:age}),
            contentType:"application/json;charset=utf-8",
            dataType:"json",
            success:function (data) {
                if(data!=null){
                    alert("输入的用户名:"+data.pname+",密码"+data.password+",年龄"+data.age)
                }
            }
        });
    }

</script>
<body>
<form action="">
    用户名:<input type="text" name="pname" id="pname"/><br>
    密  码:<input type="text" name="password" id="password"/><br>
    年  龄:<input type="text" name="age" id="age"/><br>
    <input type="submit" value="测试" onclick="testJson()"/>
</form>
</body>
</html>
