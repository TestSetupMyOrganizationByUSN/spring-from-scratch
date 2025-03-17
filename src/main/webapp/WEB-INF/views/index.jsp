
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>indexPage</title>
</head>
<body>
    <p><%= request.getAttribute("movies") %></p>
    <a href="${pageContext.request.contextPath}/hello">영화1</a>
    <a href="${pageContext.request.contextPath}/hello2">영화2</a>
</body>
</html>
