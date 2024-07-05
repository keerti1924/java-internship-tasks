package newPackage;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/model")
public class cmClass extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String name="Keerti";
		int age = 24;
		
		req.setAttribute("key1", name);
		req.setAttribute("key2", age);
		
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		rd.forward(req,res);
	
	
	}
}
