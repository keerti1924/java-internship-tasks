<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index File</title>
</head>
<body>
	<%
	
	int b =1/0; 
	try{
		int a = 89/0;
		out.print(a);
	}catch(Exception e){
		out.print("Error"+e.getLocalizedMessage());
	}
	%>
	
	
</body>
</html>