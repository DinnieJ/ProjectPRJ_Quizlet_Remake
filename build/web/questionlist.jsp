<%@page import="model.QuestionDatabase"%>
<%@page import="java.util.List"%>
<%@page import="entity.Question"%>
<%@page import="entity.User"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Question List</title>
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
        <%
            User      u = (User)session.getAttribute("user");
            String    setId = request.getParameter("id");
            QuestionDatabase qdb = new QuestionDatabase();
            List<Question> questionSet = qdb.getAllQuestion(setId);
        %>
        <div class="main topnav">
            <section class="nav-section">
                <a href="project-list.jsp" class="">
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

                <h4 class="aside-menu__caption">Practice</h4>
                <ul class="aside-menu">
                    <li class="aside-menu__item border-btn">
                        <a href="">
                            Learn
                        </a>
                    </li>
                    <li class="aside-menu__item border-btn">
                        <a href="">
                            Test
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

            <div class="question-list">
                
                <%--Question post for the question from the database--%>
                <%for(Question q: questionSet){
                    String[] answer = q.getAnswer();
                %>
                <div class="question-post">
                    <h1 class="question-content ">
                        <%=q.getContent()%>
                    </h1>
                    <hr style="width: 90%">
                    <div class="checkbox rounded-22">
                        <div class="checkbox-container">
                            <input id="checkbox-rounded-22" type="checkbox" <%if(q.getCorrectAns().equals("A")){%> checked <%}%> disabled/>
                            <div class="checkbox-checkmark"></div>
                        </div>
                        <label for="checkbox-rounded-22"><%=answer[0]%></label>
                    </div>
                    <div class="checkbox rounded-22" <%if(!q.getCorrectAns().equals("B")){%> disabled<%}%>>
                        <div class="checkbox-container">
                            <input id="checkbox-rounded-22" type="checkbox" <%if(q.getCorrectAns().equals("B")){%> checked <%}%> disabled/>
                            <div class="checkbox-checkmark"></div>
                        </div>
                        <label for="checkbox-rounded-22"><%=answer[1]%></label>
                    </div>
                    <div class="checkbox rounded-22" <%if(!q.getCorrectAns().equals("C")){%> disabled <%}%>>
                        <div class="checkbox-container">
                            <input id="checkbox-rounded-22" type="checkbox" <%if(q.getCorrectAns().equals("C")){%> checked <%}%> disabled />
                            <div class="checkbox-checkmark"></div>
                        </div>
                        <label for="checkbox-rounded-22"><%=answer[2]%></label>
                    </div>
                    <div class="checkbox rounded-22" <%if(!q.getCorrectAns().equals("D")){%> disabled <%}%>>
                        <div class="checkbox-container">
                            <input id="checkbox-rounded-22" type="checkbox" <%if(q.getCorrectAns().equals("D")){%> checked <%}%> disabled/>
                            <div class="checkbox-checkmark"></div>
                        </div>
                        <label for="checkbox-rounded-22"><%=answer[3]%></label>
                    </div>
                    <footer class="post__footer question-footer">
                        <a class="post__footer-button" href="DeleteQuestionServer?id=<%=q.getQuestionID()%>&setID=<%=setId%>">
                            Delete
                        </a>
                    </footer>
                </div>
                <%}%>
                
            </div>
        </div>

    </body>