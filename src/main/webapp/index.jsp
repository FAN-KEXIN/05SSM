<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<!-- CSS goes in the document HEAD or added to your external stylesheet -->
<style type="text/css">
    table.gridtable {
        font-family: verdana, arial, sans-serif;
        font-size: 11px;
        color: #333333;
        border-width: 1px;
        border-color: #666666;
        border-collapse: collapse;
    }

    table.gridtable th {
        border-width: 1px;
        padding: 8px;
        border-style: solid;
        border-color: #666666;
        background-color: #dedede;
    }

    table.gridtable td {
        border-width: 1px;
        padding: 8px;
        border-style: solid;
        border-color: #666666;
        background-color: #ffffff;
    }
</style>

<!-- Table goes in the document BODY -->
<table class="gridtable">
    <tr><th>书名</th><th>书的作者</th><th>书的价钱</th></tr>
    <c:forEach items="${message.list}" var="item">
        <tr>
            <td>${item.bookName}</td>
            <td>${item.bookAuthor}</td>
            <td>${item.bookPrice}</td>
            <td><a href="/ssm/dodelete?id=${item.bookID}">删除</a></td>
            <td><a href="/ssm/selectbook?id=${item.bookID}">修改</a></td>
        </tr>
    </c:forEach>
</table>
<button onclick="next(${message.pageindex+1})">下一页</button>
<script type="text/javascript">
    function next(pageindex) {

       location.href="/ssm/pagelimit?pageindex="+pageindex
    }
</script>
</body>
</html>
