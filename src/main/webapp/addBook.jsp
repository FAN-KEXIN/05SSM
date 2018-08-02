<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/12
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书页面</title>
</head>
<body>
<form method="post" action="/ssm/dologin">
    书名：<input type="text" name="bookName">
    作者：<input type="text" name="bookAuthor">
    价格：<input type="text" name="bookPrice">
    <input type="submit" value="添加图书">
</form>
</body>
</html>
