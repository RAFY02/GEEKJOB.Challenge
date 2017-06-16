<%-- 
    Document   : java6-4-1
    Created on : 2017/06/16, 15:44:55
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
            int[] suuji = {10,100,-20,118};
            String[] moji = {"soeda","hayashi","END"};
            out.print(suuji[0]);
            out.print(suuji[1]);
            out.print(moji[0] + moji[1]);
            out.print(suuji[2]);
            out.print(suuji[3]);
            out.print(moji[2]);
        %>
    </body>
</html>