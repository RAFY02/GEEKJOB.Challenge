<%-- 
    Document   : List
    Created on : 2017/07/20, 15:53:02
    Author     : 研人
--%>

<%@page import="Inventory_control.requestscorp"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
         ArrayList<requestscorp> test = (ArrayList<requestscorp>)request.getAttribute("search");
%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.print("商品の一覧を表示します。<br><br>");
                for(requestscorp test2 : test){
                    out.print("商品ID："+test2.getproductID()+"\t");
                    out.print("商品名："+test2.getproductName()+"\t");
                    out.print("単価："+test2.getprice()+"円"+"<br>");
                }
        %>
    </body>
</html>
