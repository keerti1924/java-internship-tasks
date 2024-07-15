package crudP;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class registerC extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        String action = req.getParameter("action");
        pw.print("<h1 style='text-align:center; padding:10px;'>All Student Records</h1>");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "");

            if ("delete".equals(action)) {
                // Delete a specific record
                int id = Integer.parseInt(req.getParameter("id"));
                String deleteQuery = "DELETE FROM student WHERE id = ?";
                PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
                deleteStatement.setInt(1, id);
                int rowsAffected = deleteStatement.executeUpdate();
                if (rowsAffected > 0) {
                    pw.print("<script>alert('Record deleted successfully!');</script>");
                } else {
                    pw.print("<script>alert('Record not found');</script>");
                }
            } else if ("update".equals(action)) {
                // Update a specific record
                int id = Integer.parseInt(req.getParameter("id"));
                String name = req.getParameter("name");
                String age = req.getParameter("age");
                String email = req.getParameter("email");
                String phone = req.getParameter("phone");
                String address = req.getParameter("address");

                String updateQuery = "UPDATE student SET name = ?, email = ?, age = ?, phone = ?, address = ? WHERE id = ?";
                PreparedStatement ps = conn.prepareStatement(updateQuery);
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, age);
                ps.setString(4, phone);
                ps.setString(5, address);
                ps.setInt(6, id);

                int updated = ps.executeUpdate();
                if (updated > 0) {
                    pw.print("<script>alert('Record updated successfully!');</script>");
                } else {
                    pw.print("<script>alert('Record not found');</script>");
                }
            } else if ("deleteAll".equals(action)) {
                // Delete all records
                String deleteQuery = "DELETE FROM student";
                PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);
                int rowsAffected = deleteStatement.executeUpdate();
                if (rowsAffected > 0) {
                    pw.print("<script>alert('All records deleted successfully!');</script>");
                } else {
                    pw.print("<script>alert('No records found to delete');</script>");
                    pw.print("<div style='color:#dc3545; padding:10px; text-align:center;'>No records found</div>");
                }
            } else {
                // Handle the normal registration
                String name = req.getParameter("name");
                String age = req.getParameter("age");
                String email = req.getParameter("email");
                String phone = req.getParameter("phone");
                String address = req.getParameter("address");

                String insertQuery = "INSERT INTO student (name, email, age, phone, address) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(insertQuery);
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, age);
                ps.setString(4, phone);
                ps.setString(5, address);

                int inserted = ps.executeUpdate();
                if (inserted > 0) {
                    pw.print("<script>alert('Registration Successful!');</script>");
                } else {
                    pw.print("<script>alert('Some Error Occurred');</script>");
                }
            }

            // Read and display data
            String query1 = "SELECT * FROM student";
            PreparedStatement ps1 = conn.prepareStatement(query1);
            ResultSet rs = ps1.executeQuery();

            pw.println("<center><table border='1' style='margin:10px; width:50%;'>");
            pw.println("<tr><th>ID</th><th>Name</th><th>Email</th><th>Age</th><th>Phone</th><th>Address</th><th colspan='2'>Actions</th></tr>");
            while (rs.next()) {
                int id = rs.getInt("id");
                pw.println("<tr>" +
                    "<td>" + id + "</td>" +
                    "<td>" + rs.getString("name") + "</td>" +
                    "<td>" + rs.getString("email") + "</td>" +
                    "<td>" + rs.getString("age") + "</td>" +
                    "<td>" + rs.getString("phone") + "</td>" +
                    "<td>" + rs.getString("address") + "</td>" +
                    "<td style='text-align:center;'>" +
	                    "<form action='update.jsp' method='post' style='display:inline;'>" +
	                    "<input type='hidden' name='id' value='" + id + "'>" +
	                    "<input type='submit' value='Update'>" +
	                    "</form>" +
                       
                    "</td>"+
                    "<td style='text-align:center;'>"+
	                    "<form action='register' method='post' style='display:inline;'>" +
	                    "<input type='hidden' name='action' value='delete'>" +
	                    "<input type='hidden' name='id' value='" + id + "'>" +
	                    "<input type='submit' value='Delete'>" +
	                    "</form>" +
                    "</td>" +
                    "</tr>");
            }
            pw.println("</table>"
                + "<form action='register' method='post'><input type='hidden' name='action' value='deleteAll'><button type='submit' style='background-color: red; color: white; border:none; padding:10px;'>Delete All</button></form>");
            pw.println("<button style='background-color: blue; border:none; padding:10px;'><a href='index.jsp' style='text-decoration:none; color: white;'>Add New Student</a></button></center>");
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            pw.print("<div style='color:#dc3545; padding:10px;'>Error: " + e.getMessage() + "</div>");
        }
    }
}
