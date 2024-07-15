package crudP;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class registerC extends  HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        String action = req.getParameter("action");
        pw.print("<div style='margin:10px; padding:10px;>");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "");

            if ("deleteAll".equals(action)) {
                // Delete all records from the student table
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
                // Handle the normal registration and displaying data
                String name = req.getParameter("name");
                String age = req.getParameter("age");
                String email = req.getParameter("email");
                String phone = req.getParameter("phone");
                String address = req.getParameter("address");

                // Insert new student
                String insertQuery = "INSERT INTO student VALUES (?, ?, ?, ?, ?)";
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

                // Read and display data
                String query1 = "SELECT * FROM student";
                PreparedStatement ps1 = conn.prepareStatement(query1);
                ResultSet rs = ps1.executeQuery();
                
                pw.println("<center><table border='1' style='margin:10px; width:50%;'>");
                pw.println("<tr><th>Name</th><th>Email</th><th>Age</th><th>Phone</th><th>Address</th></tr>");
                while (rs.next()) {
                    pw.println("<tr>" +
                        "<td>" + rs.getString(1) + "</td>" +
                        "<td>" + rs.getString(2) + "</td>" +
                        "<td>" + rs.getString(3) + "</td>" +
                        "<td>" + rs.getString(4) + "</td>" +
                        "<td>" + rs.getString(5) + "</td>" +
                        "</tr>");
                }
                pw.println("</table>"
                		+ "<form action='register' method='post'><input type='hidden' name='action' value='deleteAll'><button type='submit' style='background-color: red; color: white; border:none; padding:10px;'>Delete All</button></form></center>");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            pw.print("<div style='color:#dc3545; padding:10px;'>Error: " + e.getMessage() + "</div>");
        }
        pw.println("</div>");
    }

}
