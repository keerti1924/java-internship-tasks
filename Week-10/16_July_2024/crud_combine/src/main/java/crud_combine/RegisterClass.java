package crud_combine;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/regc")
public class RegisterClass extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "");
			String name = req.getParameter("user");
			String mail = req.getParameter("mail");
			String phone = req.getParameter("phone");
			int age = Integer.parseInt(req.getParameter("age"));
			String query = "insert into users values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, mail);
			ps.setString(3, phone);
			ps.setInt(4,  age);
			int inserted = ps.executeUpdate();
			if(inserted>0) {
				pw.println("<script>alert('Data Inserted Successfully!');</script>");
				RequestDispatcher rd = req.getRequestDispatcher("index.html");
                rd.include(req, res);
			}
			else {
				pw.print("<script>alert('Data Not Inserted!');</script>");
				RequestDispatcher rd = req.getRequestDispatcher("index.html");
                rd.include(req, res);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			pw.print(e);
		}
 
		
	}
 
}