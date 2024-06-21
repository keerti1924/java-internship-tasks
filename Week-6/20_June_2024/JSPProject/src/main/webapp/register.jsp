<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>
<h1 class='text-center mt-5' ><% out.println("Form submitted successfully !!"); %></h1>
<div class='container d-flex justify-content-center align-items-center'>

  <div class='signup mt-5'>

	<div class='container mt-5'>
      <h5 class='text-secondary text-center'> Welcome, ${param.name} ! <br> Your Email is ${param.email} and your Gender is ${param.gender}.</h5>
     </div>
  </div>
  </div>
 	
 

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
</body>
</html>