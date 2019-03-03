<%--
  Created by IntelliJ IDEA.
  User: Yhch
  Date: 2019/3/3
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    当前用户:${user.name}<br>
    <a href="${pageContext.request.contextPath}/logout">注销</a>

</body>
</html>
