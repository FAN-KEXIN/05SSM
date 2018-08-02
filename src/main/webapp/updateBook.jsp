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
    <script type="text/javascript">
        // window.onload=function(){
        // }
        // function submit() {
        //     location.href="/ssm/update"
        // }
    </script>
    <form  method="post" action="/ssm/update">
        书名 <input type="text" name="bookName" value="${book.bookName}"/>
        书的作者 <input type="text" name="bookAuthor" value="${book.bookAuthor}"/>
        书的价钱 <input type="text"  name="bookPrice" value="${book.bookPrice}"/>
        <input name="bookID" value="${book.bookID}" type="hidden">
        <input type="submit" value="提交">
    </form>

    <%--<button onclick="submit()">提交</button>--%>
    </body>
    </html>
