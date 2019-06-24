<%-- 
    Document   : project-list
    Created on : Jun 20, 2019, 7:32:28 AM
    Author     : MemeLord
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.ProjectSet"%>
<%@page import="model.ProjectDatabase"%>
<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>Project List</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="styles/common.css?v=1.1">
    <link rel="stylesheet" href="styles/topnav.css?v=1.1">
    <link rel="stylesheet" href="styles/project.css?v=1.1">
    <link rel="stylesheet" href="styles/left-column.css?v=1.1">
    <link rel="icon" href="icons/favicon.ico" type="image/gif" sizes="16x16">
    </head>
    <body>
     <%
         User u = (User)session.getAttribute("user");
         ProjectDatabase pdb = new ProjectDatabase();
         List<ProjectSet> listProject = pdb.getAllProject(u.getUsername());
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
            <a href=""><%=u.getName()%></a>
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

        <h4 class="aside-menu__caption">Saved Project</h4>

        <ul class="aside-menu">
          <li class="aside-menu__item border-btn">
            <a href="">
              subjects 1
            </a>
          </li>
          <li class="aside-menu__item border-btn">
            <a href="">
              subjects 2
            </a>
          </li>
          <li class="aside-menu__item border-btn">
            <a href="">
              subjects 3
            </a>
          </li>
          <li class="aside-menu__item border-btn">
            <a href="">
              subjects 4
            </a>
          </li>
          <li class="aside-menu__item border-btn">
            <a href="">
              subjects 5
            </a>
          </li>
        </ul>
      </aside>
      <div class="list">
        <%if(listProject.size()==0){%>
        <article class="post">
          <header class="post__header">
            <a class="post__header-name" href="">You haven't create any project</a>
          </header>
        </article>
        <%}%>
        <%for(int i = 0;i<listProject.size();i++){%>
        <article class="post">
          <header class="post__header">
            <a class="post__header-name" href=""><%=listProject.get(i).getSetName()%></a>
            <time class="post__header-time">
              <%=listProject.get(i).getCreator()%>
            </time>
          </header>
          <div class="post__text">
            <p><%=listProject.get(i).getDescription()%></p>
          </div>
          <footer class="post__footer">
            <span class="post__footer-button">
              Learn
            </span>
            <span class="post__footer-button">
              Like
            </span>
            <span class="post__footer-button">
              Delete
            </span>
          </footer>
        </article>
          <%}%>
    </body>
</html>
