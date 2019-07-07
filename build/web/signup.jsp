
<%-- 
    Document   : sign
    Created on : Jun 20, 2019, 8:45:50 AM
    Author     : MemeLord
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta charset="utf-8">

        <title>Sign Up</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="styles/login.css?v=1.1">
        <link rel="stylesheet" href="styles/common.css?v=1.1">
        <link rel="icon" href="icons/favicon.ico" type="image/gif" sizes="16x16">
    </head>
    <body>
        <div class="login">
            <form action="SignUpServer" method="post">
                <h1 class="title">Sign Up</h1>
                <%
                    if(request.getAttribute("message")!=null){
                %>
                <h4 class="warning shadow-box"><%=request.getAttribute("message")%></h4>
                <%}%>
                <input type="text" name="username" placeholder="User name">
                <input type="password" name="password" placeholder="Password">
                <input type="email" name="email" placeholder="Email">
                <input type="text" name="name" placeholder="Your name">
                <input type="submit" value="Sign Up" class="border-btn">
            </form>
        </div>
    </body>
</html>
