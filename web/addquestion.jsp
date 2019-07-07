<%-- 
    Document   : addquestion
    Created on : Jul 3, 2019, 5:03:19 PM
    Author     : MemeLord
--%>

<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <%
            User u = (User) session.getAttribute("user");
            
            String id = request.getParameter("id");
        %>
        <title>Question Add</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="styles/common.css?v=1.1">
        <link rel="stylesheet" href="styles/topnav.css?v=1.1">
        <link rel="stylesheet" href="styles/project.css?v=1.1">
        <link rel="stylesheet" href="styles/left-column.css?v=1.1">
        <link rel="stylesheet" href="styles/question.css?v=1.1">
        <link rel="stylesheet" href="styles/checkbox.css?v=1.1">
        <link rel="icon" href="icons/favicon.ico" type="image/gif" sizes="16x16">
    </head>

    <body>

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
                    <%=u.getName()%>(Sign Out)
                </a>
            </section>
        </div>
        <div class="main">
            <aside class="left-col">
                <ul class="aside-menu">
                    <li class="aside-menu__item border-btn">
                        <a href=""><%=u.getName()%></a>
                    </li>
                </ul>

                <h4 class="aside-menu__caption">project</h4>
                <ul class="aside-menu">
                    <li class="aside-menu__item border-btn">
                        <a href="">
                            Application Layer
                        </a>
                    </li>
                </ul>

                <h4 class="aside-menu__caption">action</h4>
                <ul class="aside-menu">
                    <li class="aside-menu__item border-btn">
                        <a href="">
                            Create Question
                        </a>
                    </li>
                </ul>
            </aside>
            <form action ="AddNewQuestionServer" method="POST" class="question-add">
                <div class="question">
                    <h2 class="title rainbow">New Question</h2>
                    <textarea name="description" id="" placeholder="Question..." class="decription-input"></textarea>
                    <input type="hidden" value ="<%=id%>" name="id">
                    <input type="submit" value="Create Question">
                </div>
                
                <div class="answer">
                    <div class="checkbox rounded-22">
                        <div class="checkbox-container">
                            <input id="checkbox-rounded-22" type="checkbox" name="answer-checkbox" value="A" />
                            <div class="checkbox-checkmark"></div>
                        </div>
                        <label for="checkbox-rounded-22">1.</label>
                    </div>
                    <textarea name="answer-content-0" id="" placeholder="Answer..." class="answer-content"></textarea>
                </div>
                
                <div class="answer">
                    <div class="checkbox rounded-22">
                        <div class="checkbox-container">
                            <input id="checkbox-rounded-22" type="checkbox" name="answer-checkbox" value="B"/>
                            <div class="checkbox-checkmark"></div>
                        </div>
                        <label for="checkbox-rounded-22">2.</label>
                    </div>
                    <textarea name="answer-content-1" id="" placeholder="Answer..." class="answer-content"></textarea>
                </div>
                <div class="answer">
                    <div class="checkbox rounded-22">
                        <div class="checkbox-container">
                            <input id="checkbox-rounded-22" type="checkbox" name="answer-checkbox" value="C"/>
                            <div class="checkbox-checkmark"></div>
                        </div>
                        <label for="checkbox-rounded-22">3.</label>
                    </div>
                    <textarea name="answer-content-2" id="" placeholder="Answer..." class="answer-content"></textarea>
                </div>
                <div class="answer">
                    <div class="checkbox rounded-22">
                        <div class="checkbox-container">
                            <input id="checkbox-rounded-22" type="checkbox" name="answer-checkbox" value="D"/>
                            <div class="checkbox-checkmark"></div>
                        </div>
                        <label for="checkbox-rounded-22">4.</label>
                    </div>
                    <textarea name="answer-content-3" id="" placeholder="Answer..." class="answer-content"></textarea>
                </div>
            </form>
        </div>

    </body>
