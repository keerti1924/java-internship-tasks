package LoginPackage;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class logoutClass extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse  res) throws IOException {
		HttpSession session = req.getSession();
		session.removeAttribute("username");
		session.invalidate();
		res.sendRedirect("login.jsp");
	}
}
