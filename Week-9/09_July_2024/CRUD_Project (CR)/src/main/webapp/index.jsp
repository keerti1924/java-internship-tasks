<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<!-- MDB -->
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.3.2/mdb.min.css"
  rel="stylesheet"
/>
</head>
<body>

<div class="container p-5" align="center">

<form style="max-width:500px;" class="shadow p-5" action="register" method="post">
	<h1 class="my-5">Registration Form</h1>
  <div  class="mb-4">
    <input type="text" id="name" class="form-control" name="name" placeholder="Name" />
  </div>
  
  <div  class="mb-4">
    <input type="email" id="email" class="form-control" name="email" placeholder="Email Address" />
  </div>

  <div  class="mb-4">
    <input type="text" id="age" class="form-control" name="age" placeholder="Age"/>
  </div>
  
  <div  class="mb-4">
    <input type="text" id="phone" class="form-control" name="phone" placeholder="Phone Number"/>
  </div>
  
  <div  class="mb-4">
    <input type="text" id="address" class="form-control" name="address" placeholder="Address" />
  </div>
    
    <!-- Submit button -->
  <button  type="submit" class="btn btn-primary btn-block mb-4">Register</button>
  

</form>
	
</div>
</body>
</html>