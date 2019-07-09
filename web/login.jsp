<%-- 
    Document   : login
    Created on : Jun 20, 2019, 7:09:51 AM
    Author     : MemeLord
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="styles/login.css?v=1.1">
        <link rel="stylesheet" href="styles/common.css?v=1.1">
        <link rel="icon" href="icons/favicon.ico" type="image/gif" sizes="16x16">
    </head>
    <body>
        <div class="login">
            <form action="LoginServer" method="POST">
                <h1 class="title">Log In</h1>
                <%
                    System.out.println("Return message: "+request.getParameter("message"));
                    if(request.getAttribute("message")!=null){
                %>
                <h4 class="warning shadow-box"><%=request.getAttribute("message")%></h4>
                <%}%>
                <input type="text" name="username" placeholder="User name">
                <input type="password" name="password" placeholder="Password">
                <input type="submit" value="Login" class="border-btn">

                <br><br><br><br><br><br>
                Don't have account ? <a href="signup.jsp">&nbsp;Sign Up</a>
            </form>
        </div>
    </body>
</html>