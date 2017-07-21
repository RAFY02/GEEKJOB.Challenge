<%-- 
    Document   : register_
    Created on : 2017/07/21, 14:43:52
    Author     : 研人
--%>
<%@page import="Inventory_control.register"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            HttpSession hs = request.getSession();
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.print(hs.getAttribute("update") + "行更新しました。");
        %>
    </body>
</html>
