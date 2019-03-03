<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>从Controller转发过来的request内置对象的数据如下:</h1><br>
    <h2>${requestScope.name[0]}</h2>
    <h2>${requestScope.name[1]}</h2>
    <h2>${requestScope.name[2]}</h2>
    <h2>${requestScope.name[3]}</h2>

<hr>
<h1>从Controller转发过来的Model对象的数据如下:</h1><br>
<h2>${address[0]}</h2>
<h2>${address[1]}</h2>
<h2>${address[2]}</h2>
<h2>${address[3]}</h2>
</body>
</html>
