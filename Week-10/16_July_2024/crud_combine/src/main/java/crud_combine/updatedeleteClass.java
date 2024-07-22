package crud_combine;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/crud")
public class updatedeleteClass extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String action = req.getParameter("action");
		String mail = req.getParameter("mail");
		
		if("update".equals(action)) {
			UpdateData(res,mail);
		}else if ("delete".equals(action)) {
			try {
				DeleteData(res,mail);
			} catch (ClassNotFoundException | IOException | SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String action = req.getParameter("action");
		String mail = req.getParameter("mail");
		
		if("update".equals(action)) {
			UpdateData(res,mail);
		}else if ("delete".equals(action)) {
			try {
				DeleteData(res,mail);
			} catch (ClassNotFoundException | IOException | SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void UpdateData(HttpServletResponse res,String mail) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<style>");
        pw.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background: linear-gradient(to right, #74ebd5, #ACB6E5); margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; }");
        pw.println(".container { display: flex; justify-content: center; align-items: center; width: 100%; height: 100%; }");
        pw.println(".form-container { background-color: #ffffff; padding: 30px 40px; border-radius: 10px; box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2); max-width: 500px; width: 100%; animation: fadeIn 1s ease-in-out; }");
        pw.println("@keyframes fadeIn { from { opacity: 0; } to { opacity: 1; } }");
        pw.println("h3 { margin-bottom: 30px; text-align: center; color: #343a40; font-size: 1.8em; }");
        pw.println("table { width: 100%; }");
        pw.println("td { padding: 10px 0; }");
        pw.println("input[type='text'], input[type='submit'], button { width: 100%; padding: 10px; margin: 5px 0; box-sizing: border-box; border-radius: 5px; border: 1px solid #ced4da; transition: all 0.3s ease-in-out; }");
        pw.println("input[type='text']:focus { border-color: #80bdff; box-shadow: 0 0 5px rgba(0, 123, 255, 0.5); }");
        pw.println("input[type='submit'], button { background-color: #007bff; color: white; border: none; cursor: pointer; transition: background-color 0.3s ease; }");
        pw.println("input[type='submit']:hover, button:hover { background-color: #0056b3; }");
        pw.println(".button-container { text-align: center; margin-top: 20px; }");
        pw.println(".button-container form { display: inline-block; margin: 0 10px; }");
        pw.println("</style>");
 
        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<meta charset='UTF-8'>");
        pw.println("<title>Update Form</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<div class='container'>");
        pw.println("<div class='form-container'>");
        pw.println("<h3>Update Form</h3>");
        pw.println("<form action='crud' method='post'>");
        pw.println("<input type='hidden' name='action' value='update'>");
        pw.println("<input type='hidden' name='mail' value='" + mail + "'>");
        pw.println("New Username: <input type='text' name='user'><br>");
        pw.println("New Age: <input type='text' name='age'><br>");
        pw.println("New Phone: <input type='text' name='phone'><br>");
        pw.println("<input type='submit' value='Update'>");
        pw.println("</form>");
        pw.println("</div>");
        pw.println("</div>");
        pw.println("</body>");
        pw.println("</html>");
	}

	private void DeleteData(HttpServletResponse res,String mail) throws IOException, ClassNotFoundException, SQLException {
		
		Connection conn = null;
		PreparedStatement st = null;
		PrintWriter pw = res.getWriter();
		
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
	         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "");
	         String deleteQuery = "DELETE FROM users WHERE mail = ?";
	         st = conn.prepareStatement(deleteQuery);
	         st.setString(1, mail);
	         
	         int deleted = st.executeUpdate();
	         res.setContentType("text/html");
	         if (deleted > 0) {
	             pw.print("<script>alert('Record deleted successfully!');</script>");
	         } else {
	             pw.print("<script>alert('Record not found');</script>");
	         }
		 }finally {
			try{
				if(st!=null) {
					st.close();
				}if(conn!=null) {
					conn.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
		}
		}
         
         
	}
}
