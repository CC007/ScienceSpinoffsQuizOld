<%-- 
    Document   : question
    Created on : May 25, 2015, 9:09:50 PM
    Author     : Rik Schaaf aka CC007 <http://coolcat007.nl/>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Question</title>
        <link rel="stylesheet" type="text/css" href="${cp}/resources/css/style.css" />
        <script src="${cp}/resources/js/script.js"></script>
    </head>
    <body>
        <div><h1>Science spin-offs: the technology we use</h1></div>
        <div>${text}</div>
        <form>
            <div>
                <input type="radio" name="answer" value="A" />${answerA}
            </div>
            <div>
                <input type="radio" name="answer" value="B" />${answerB}
            </div>
            <div>
                <input type="radio" name="answer" value="C" />${answerC}
            </div>
            <input type="submit" value="QuestionAnswered">
        </form>
            
    </body>
</html>
