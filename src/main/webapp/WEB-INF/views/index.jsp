
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>indexPage</title>
</head>
<body>
    <p><%= request.getAttribute("movies") %></p>
    <p><%= request.getAttribute("recommendation")%></p>
</body>
</html>
