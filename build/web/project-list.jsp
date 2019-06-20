<%-- 
    Document   : project-list
    Created on : Jun 20, 2019, 7:32:28 AM
    Author     : MemeLord
--%>

<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>Project List</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="styles/common.css">
    <link rel="stylesheet" href="styles/topnav.css">
    <link rel="stylesheet" href="styles/project.css">
    <link rel="stylesheet" href="styles/left-column.css">
    <link rel="icon" href="icons/favicon.ico" type="image/gif" sizes="16x16">
    </head>
    <body>
     <%
         User u = (User)session.getAttribute("user");
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
        <a href="#" class="">
          <%=u.getName()%>
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
            <a href="">
              Create Project
            </a>
          </li>
        </ul>

        <h4 class="aside-menu__caption">Your Question Set</h4>

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
        <article class="post">
          <header class="post__header">
            <a class="post__header-name" href="">Application Layer</a>
            <time class="post__header-time">
              Đỗ Đức Duy
            </time>
          </header>
          <div class="post__text">
            <p>Practive chapter 2</p>
            <p>Number of questions : 10</p>
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
    </body>
</html>
