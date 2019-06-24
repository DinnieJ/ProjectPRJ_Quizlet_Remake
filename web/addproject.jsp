<%-- 
    Document   : addproject
    Created on : Jun 24, 2019, 1:43:53 PM
    Author     : MemeLord
--%>

<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">

        <title>Project List</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="styles/common.css?v=1.1">
        <link rel="stylesheet" href="styles/topnav.css?v=1.1">
        <link rel="stylesheet" href="styles/project.css?v=1.1">
        <link rel="stylesheet" href="styles/left-column.css?v=1.1">
        <link rel="stylesheet" href="styles/select.css?v=1.1">
        <link rel="icon" href="icons/favicon.ico" type="image/gif" sizes="16x16">
    </head>
    <body>
        <%
            User u = (User) session.getAttribute("user"); //get user from session
        %>
            <div class="main topnav">
                <section class="nav-section">
                    <a href="#" class="">
                        <img src="icons/favicon.ico" class="icon">Questions
                    </a>
                </section>
                <section class="nav-section">
                    <a href="#" class="">
                        <img src="icons/search-icon.png" class="icon">Search
                    </a>
                </section>
                <section class="nav-section account">
                    <a href="login.jsp" class="">
                        <%=u.getName()%>(Sign Out)
                    </a>
                </section>
            </div>
                    
                    
            <div class="main">
                <aside class="left-col shadow-box">
                    <ul class="aside-menu">
                        <li class="aside-menu__item border-btn">
                            <a href="project-list.jsp"><%=u.getName()%></a>
                        </li>
                    </ul>

                    <h4 class="aside-menu__caption">action</h4>

                    <ul class="aside-menu">
                        <li class="aside-menu__item border-btn">
                            <a href="addproject.jsp">
                                Create Project
                            </a>
                        </li>
                    </ul>

                    <h4 class="aside-menu__caption">subjects list</h4>
                </aside>
                <div class="list">
                    <form action="AddNewProjectServer" method="POST" class="add-form">
                        <h3 class="title rainbow">New Project</h3>
                        <%if(request.getAttribute("message")!=null){%>
                        <h4 class="warning shadow-box" align="center" style="color:red"><%=request.getAttribute("message")%></h4>
                        <%}%>
                        <input type="text" name="name" placeholder="Project name">
                        <textarea name="description" id="" cols="30" placeholder="Decription..." class="decription-input"></textarea>
                        <input type="submit" value="Add New">
                    </form>
                </div>
            </div>
    </body>
</html>
