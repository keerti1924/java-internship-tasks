<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>
<h2 class='text-center my-4' ><% out.println("Thanks for contacting us 😊"); %></h2>
<div class='container d-flex justify-content-center align-items-center border border-secondary rounded py-4'>

  <div class='signup mt-2'>
	<div class='container mt-2'>
	
	<h5 class='text-secondary text-center'>Thank You !, ${param.fullname} <br> Email :- ${param.email} <br> Phone No. :- ${param.phone} <br> Subject :- ${param.subject} ! <br> Message :- ${param.message}.</h5>
    </div>
    
  </div>
  
</div>
 	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>