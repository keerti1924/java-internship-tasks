<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<!-- MDB -->
<link rel="stylesheet" href="https://unpkg.com/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>

<section class="bg-light p-3 p-md-4 p-xl-5">
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-12 col-xxl-11">
        <div class="card border-light-subtle shadow-sm">
          <div class="row g-0">
            <div class="col-12 col-md-6">
              <img class="img-fluid rounded-start w-100 h-100 object-fit-cover" loading="lazy" src="https://bootstrapbrain.com/demo/components/registrations/registration-8/assets/img/logo-img-1.webp" alt="Welcome back you've been missed!">
            </div>
            <div class="col-12 col-md-6 d-flex align-items-center justify-content-center">
              <div class="col-12 col-lg-11 col-xl-10">
                <div class="card-body p-3 p-md-4 p-xl-5">
                  <div class="row">
                    <div class="col-12">
                      <div class="mb-5">
                        
                        <h2 class="h4 text-center">Registration Form </h2>
                      </div>
                    </div>
                  </div>
                  
                  <form action="regForm" method="post">
                    <div class="row gy-3 overflow-hidden">
                      <div class="col-12">
                        <div class="form-floating mb-3">
                          <input type="text" class="form-control" name="name" id="name" placeholder="Name" required>
                          <label for="name" class="form-label">Name</label>
                        </div>
                      </div>

                      <div class="col-12">
                        <div class="form-floating mb-3">
                          <input type="email" class="form-control" name="email" id="email" placeholder="Email" required>
                          <label for="email" class="form-label">Email</label>
                        </div>
                      </div>
                      <div class="col-12">
                        <div class="form-floating mb-3">
                          <input type="password" class="form-control" name="password" id="password" value="" placeholder="Password" required>
                          <label for="password" class="form-label">Password</label>
                        </div>
                      </div>
                      <div class="col-12">
                        <div class="form-floating mb-3">
                        <select class="form-control" name="gender" id="gender" required>
                        	<option value="">--Select Gender--</option>
                        	<option value="male">Male</option>
                        	<option value="female">Female</option>
                        </select>
                        <label for="gender" class="form-label">Gender</label>
                        </div>
                      </div>
                      
                      <div class="col-12">
                        <div class="form-floating mb-3">
                        <select class="form-control" name="city" id="city" required>
                        	<option value="">--Select City--</option>
			                <option value="Delhi">Delhi</option>
			                <option value="Mumbai">Mumbai</option>
			                <option value="Lucknow">Lucknow</option>
			                <option value=Allahabad>Allahabad</option>
			                <option value="Bangalore">Bangalore</option>
                        </select>
                        <label for="city" class="form-label">City</label>
                        </div>
                      </div>
                      
                      
                      <div class="col-12">
                        <div class="d-grid">
                          <button class="btn btn-dark btn-lg" type="submit">Register</button>
                        </div>
                      </div>
                    </div>
                  </form>
                  <div class="row">
                    <div class="col-12">
                      <p class="mb-0 mt-5 text-secondary text-center">Already have an account? <a href="login.jsp" class="link-primary text-decoration-none">Log in</a></p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

</body>
</html>



