<%@page import="entity.TestQuestion"%>
<%@page import="module.TestModule"%>
<%@page import="entity.User"%>
r<%-- 
    Document   : testquestion
    Created on : Jul 14, 2019, 9:06:17 PM
    Author     : MemeLord
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project List</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="styles/common.css?v=1.1">
        <link rel="stylesheet" href="styles/topnav.css?v=1.1">
        <link rel="stylesheet" href="styles/project.css?v=1.1">
        <link rel="stylesheet" href="styles/left-column.css?v=1.1">
        <link rel="stylesheet" href="styles/question.css?v=1.1">
        <link rel="stylesheet" href="styles/checkbox.css?v=1.1">
        <link rel="stylesheet" href="styles/progress.css?v=1.1">
        <link rel="icon" href="icons/favicon.ico" type="image/gif" sizes="16x16">
    </head>
    <%
        User u = (User)session.getAttribute("user");
        TestModule test = (TestModule)session.getAttribute("test");
    %>
    <script src="scripts/question.js"></script>

    <body>

        <div class="main topnav">
            <section class="nav-section">
                <a href="questionlist.jsp" class="">
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

                <h4 class="aside-menu__caption">Project</h4>

                <ul class="aside-menu">
                    <li class="aside-menu__item border-btn">
                        <a href="project-list.jsp">
                            Application Layout
                        </a>
                    </li>
                </ul>
            </aside>
                <form class="question-add" action="SubmitTestServer" method="POST">
                <input type="submit" value="Submit test">
                <%  int current = 0;
                    for(TestQuestion tq: test.getTestQuestionList()){ 
                        String[] answer = tq.getAnswer();
                %>
                
                <div class="question">
                    <div class="question-content"><%=tq.getContent()%></div>
                    <hr width="90%">
                    <div class="answer">
                        <div class="checkbox rounded-22">
                            <div class="checkbox-container">
                                <input id="checkbox-rounded-22" type="checkbox" name="answer-checkbox" value="<%=current%>A" />
                                <div class="checkbox-checkmark"></div>
                            </div>
                            <label for="checkbox-rounded-22">1.</label>
                        </div>
                        <div name="answer-content-a" id="" class="answer-content"><%=answer[0]%></div>
                    </div>
                    
                    <div class="answer">
                        <div class="checkbox rounded-22">
                            <div class="checkbox-container">
                                <input id="checkbox-rounded-22" type="checkbox" name="answer-checkbox" value="<%=current%>B" />
                                <div class="checkbox-checkmark"></div>
                            </div>
                            <label for="checkbox-rounded-22">2.</label>
                        </div>
                        <div name="answer-content-b" id="" class="answer-content"><%= answer[1] %></div>
                    </div>
                    
                    <div class="answer">
                        <div class="checkbox rounded-22">
                            <div class="checkbox-container">
                                <input id="checkbox-rounded-22" type="checkbox" name="answer-checkbox" value ="<%=current%>C" />
                                <div class="checkbox-checkmark"></div>
                            </div>
                            <label for="checkbox-rounded-22">3.</label>
                        </div>
                        <div name="answer-content-c" id="" class="answer-content"><%= answer[2] %></div>
                    </div>
                    
                    <div class="answer">
                        <div class="checkbox rounded-22">
                            <div class="checkbox-container">
                                <input id="checkbox-rounded-22" type="checkbox" name="answer-checkbox" value="<%=current%>D" />
                                <div class="checkbox-checkmark"></div>
                            </div>
                            <label for="checkbox-rounded-22">4.</label>
                        </div>
                        <div name="answer-content-d" id="" class="answer-content"><%= answer[3] %></div>
                    </div>
                </div>
                <%current++;}%>
            </form>

        </div>

    </body>
</html>
