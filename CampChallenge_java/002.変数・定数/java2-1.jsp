<%-- 
    Document   : java2-1
    Created on : 2017/06/15, 18:07:13
    Author     : 研人
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = "山内研人です。<br>";
            String name2 = "よろしくお願いします。";
            out.print(name + name2);
        %>
    </body>
</html>
