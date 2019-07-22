<%-- 
    Document   : search
    Created on : Jul 15, 2019, 4:22:46 PM
    Author     : MemeLord
--%>

<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project List</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="styles/common.css">
        <link rel="stylesheet" href="styles/topnav.css">
        <link rel="stylesheet" href="styles/project.css">
        <link rel="stylesheet" href="styles/left-column.css">
        <link rel="stylesheet" href="styles/search.css">
        <link rel="icon" href="icons/favicon.ico" type="image/gif" sizes="16x16">
    </head>
    <script>

    </script>
    <body>
        <% User u = (User)session.getAttribute("user"); %>
        <div class="main topnav">
            <section class="nav-section">
                <a href="project-list.jsp" class="">
                    <img src="icons/favicon.ico" class="icon">Questions
                </a>
            </section>
            <section class="nav-section">
                <a href="search.jsp" class="">
                    <img src="icons/search-icon.png" class="icon">Search
                </a>
            </section>
            <section class="nav-section account">
                <a href="login.jsp" class="">
                    <%= u.getName() %>(Sign Out)
                </a>
            </section>
        </div>
        <div class="main">
            <form class="search" action="SearchServer" method="POST">
                <input class="searchValue" type="text" name="searchData" id="" placeholder="Search value in here...">
                <input class="searchBtn" type="submit" value="Search">
            </form>
        </div>

    </body>
</html>
