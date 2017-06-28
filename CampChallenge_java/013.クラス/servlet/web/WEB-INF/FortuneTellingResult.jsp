<%-- 
    Document   : FortuneTellingResult
    Created on : 2017/06/19, 15:53:51
    Author     : 研人
--%>
<%@page import = "mypackage.sample.ResultData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
          ResultData data = (ResultData)request.getAttribute("DATA");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (data != null) {
                out.print("<h1>あなたの"+data.getD() +"の運勢は、"+data.getLuck()+"です！<h1>");
            }
        %>
    </body>
</html>
