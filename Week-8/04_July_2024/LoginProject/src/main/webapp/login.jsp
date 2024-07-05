<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="style.css">
<link rel="icon" href="https://th.bing.com/th/id/OIP.QPFpt9qyii0col5DGN2HSgHaHa?w=195&h=195&c=7&r=0&o=5&pid=1.7">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body class="bg-light">

<div class="wrapper fadeInDown">
  <div id="formContent">

    <!-- Icon -->
    <div class="fadeIn first">
    	<img src="https://th.bing.com/th/id/OIP.QPFpt9qyii0col5DGN2HSgHaHa?w=195&h=195&c=7&r=0&o=5&pid=1.7" class="img-fluid">
    </div>
	
	<span class="text-danger">${errorMessage}</span>

    <!-- Login Form -->
    <form action="loginServlet">
      <input type="text" id="login" class="fadeIn second" name="username" placeholder="Username">
      <input type="password" id="password" class="fadeIn third" name="password" placeholder="Password">
      <input type="submit" class="fadeIn fourth" value="Log In">
    </form>



    
  </div>
</div>

</body>
</html>