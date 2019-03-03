<%--
  Created by IntelliJ IDEA.
  User: Yhch
  Date: 2019/3/3
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${msg}
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名：<input type="text" name="name"/><br>
        密  码：<input type="password" name="password"/><br>
        <input type="submit" value="登陆" />
    </form>

</body>
</html>
