<%--
  Created by IntelliJ IDEA.
  User: jing
  Date: 2017/10/9
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/one" method="post">
<input type="text" name="username">
<input type="submit" value="提交">
</form>
</body>
</html>
