package NewPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class loginclass extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");

		System.out.println(name + " " + email + " " +password);
		PrintWriter pw = res.getWriter();	
		pw.print("<body style='background-color:pink; text-align:center'>");
		pw.print("<h4> Welcome, "+ name + "</h4>");
		pw.print("<h4 style='color:green'> Login Successfull </h4>");
		pw.print("</body>");
		
		
	}
}
