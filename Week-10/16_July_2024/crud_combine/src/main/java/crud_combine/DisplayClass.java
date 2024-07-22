package crud_combine;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/display")
public class DisplayClass extends HttpServlet {
 
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "");
            String query = "select * from users";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
 
            // Start HTML output with CSS styles
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>Display Data</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f0f0f0; margin: 0; padding: 20px; }");
            out.println("table { width: 100%; border-collapse: collapse; margin-top: 20px; }");
            out.println("table, th, td { border: 1px solid #ddd; }");
            out.println("th, td { padding: 12px; text-align: left; }");
            out.println("th { background-color: #4CAF50; color: white; }");
            out.println("tr:nth-child(even) { background-color: #f2f2f2; }");
            out.println("a { text-decoration: none; color: #007bff; }");
            out.println("a:hover { text-decoration: underline; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
 
            // Table header
            out.println("<h2 style='text-align: center;'>Student Information</h2>");
            out.println("<a href='index.html' style='background-color:#4CAF50; color:#fff; padding:10px;'>Add New Student</a>");
            out.println("<table>");
            out.println("<tr><th>Name</th><th>Mail</th><th>Mobile</th><th>Age</th><th>Actions</th></tr>");
 
            // Table rows from database
            while (rs.next()) {
                String name = rs.getString("name");
                String mail = rs.getString("mail");
                String phone = rs.getString("phone");
                String age = rs.getString("age");
                out.println("<tr>");
                out.println("<td>" + name + "</td>");
                out.println("<td>" + mail + "</td>");
                out.println("<td>" + phone + "</td>");
                out.println("<td>" + age + "</td>");
                out.println("<td><a href='crud?action=update&mail=" + mail + "'>Update</a> | <a href='crud?action=delete&mail=" + mail + "'>Delete</a></td>");
                out.println("</tr>");
            }
 
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
 
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("<p>Error retrieving data: " + e.getMessage() + "</p>");
        }
    }
}