<%-- 
    Document   : java5-4-2
    Created on : 2017/06/16, 14:59:04
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
            String type = "あ";
            switch(type){
                case "あ":
                    out.print("日本語");
                    break;
                case "A":
                    out.print("英語");
                    break;
            }
        %>
    </body>
</html>
