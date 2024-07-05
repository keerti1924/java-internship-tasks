<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body class="bg-light">
<% if(session.getAttribute("username") == null){
	response.sendRedirect("login.jsp");

	}
%>

<div class="d-flex justify-content-center align-items-center">
	<div class="container border rounded shadow bg-white my-5 p-4 text-center">
		<h3>Hello, <span style="color:blue">${username}</span></h3>
		<h4>Welcome, to our Application</h4>
		
		<p>We're thrilled to have you here. This platform is designed to provide you with the best user experience, offering a wide range of features tailored to meet your needs. Whether you're here to explore new opportunities, manage your tasks, or simply browse through our offerings, we're committed to making your experience seamless and enjoyable. Our team is constantly working to improve and bring you the latest updates. If you have any questions or need assistance, don't hesitate to reach out to our support team. Thank you for joining us, and we hope you have a wonderful time!</p>
		
		<a href="logout" class="btn btn-md btn-primary my-2">Logout</a>
	</div>
</div>

</body>
</html>