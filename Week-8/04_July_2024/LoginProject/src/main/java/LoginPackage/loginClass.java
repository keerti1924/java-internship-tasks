package LoginPackage;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class loginClass extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse  res) throws IOException, ServletException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		String uname = "Keerti";
		String pass = "1234";
		if(username.equals(uname) && password.equals(pass)) {
			HttpSession session = req.getSession();
			session.setAttribute("username",username);
			res.sendRedirect("welcome.jsp");
		}else {
			req.setAttribute("errorMessage", "Invalid username or password");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
            rd.forward(req, res);
		}
	}
}
