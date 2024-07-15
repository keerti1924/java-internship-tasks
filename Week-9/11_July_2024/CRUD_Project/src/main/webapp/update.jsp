<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%
    String id = request.getParameter("id");
    String name = "", email = "", age = "", phone = "", address = "";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "");
        String query = "SELECT * FROM student WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, Integer.parseInt(id));
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            name = rs.getString("name");
            email = rs.getString("email");
            age = rs.getString("age");
            phone = rs.getString("phone");
            address = rs.getString("address");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
<html>
<head>
    <title>Update Student</title>
    <link
  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.3.2/mdb.min.css"
  rel="stylesheet"
/>
</head>
<body>

<div class="container p-5" align="center">

<form style="max-width:500px;" class="shadow p-5" action="register" method="post">
	<h1 class="my-5">Update Student Record</h1>
	<input type="hidden" name="action" value="update">
        <input type="hidden" name="id" value="<%= id %>">
  <div  class="mb-4">
    <input type="text" id="name" class="form-control" name="name" placeholder="Name" value="<%= name %>"/>
  </div>
  
  <div  class="mb-4">
    <input type="email" id="email" class="form-control" name="email" placeholder="Email Address" value="<%= email %>"/>
  </div>

  <div  class="mb-4">
    <input type="text" id="age" class="form-control" name="age" placeholder="Age" value="<%= age %>"/>
  </div>
  
  <div  class="mb-4">
    <input type="text" id="phone" class="form-control" name="phone" placeholder="Phone Number" value="<%= phone %>"/>
  </div>
  
  <div  class="mb-4">
    <input type="text" id="address" class="form-control" name="address" placeholder="Address" value="<%= address %>"/>
  </div>
    
    <!-- Submit button -->
  <button  type="submit" class="btn btn-primary btn-block mb-4">Update</button>
  

</form>
	
</div>
</body>
</html>

