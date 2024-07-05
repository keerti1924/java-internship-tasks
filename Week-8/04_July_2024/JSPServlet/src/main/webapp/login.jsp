<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>
<% String name = request.getAttribute("key1").toString();
out.print(name);
%>
</h1>

<!-- EL(Expression Language) -->

${key1}<br>
${key2}
</body>
</html>