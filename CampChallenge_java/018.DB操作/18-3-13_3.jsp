<%-- 
    Document   : main
    Created on : 2017/07/19, 16:43:15
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
        <form action="register" method="post">
            <p>ログインしました。</p><br><br>
            <p>商品情報登録フォーム</p>
            <p>商品ID</p><input type="number" maxlength="2" name="productID"><br>
            <p>商品名</p><input type="text" name="productName"><br>
            <p>単価</p><input type="number" maxlength="2" name="price"><br><br>
            <input type="submit" name="ok"><br><br>
            
            <A HREF="indicate">商品の一覧表を見る</A>
        </form>
    </body>
</html>
