<%-- 
    Document   : java5-4
    Created on : 2017/06/16, 14:41:48
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
            int type = 10;
            switch(type){
                case 10:
            out.print("one");
            break;
                case 20:
            out.print("two");
            break;
                default:
            out.print("計算外です");
            break;
            }
        %>
    </body>
</html>
