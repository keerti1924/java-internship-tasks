package NewPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/pass")
public class pass extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		int math=Integer.parseInt(req.getParameter("math"));
		int english=Integer.parseInt(req.getParameter("english"));
		int science=Integer.parseInt(req.getParameter("science"));
		int computer=Integer.parseInt(req.getParameter("computer"));
		
		double total=math+science+english+computer;
		double percentage = total/4;
		PrintWriter pw = res.getWriter();
		
		if(percentage<=30) {
			pw.print("<h1>" + name + ", You have Failed </h1>");
		}else {
			pw.print("<h1>" + name + ", You have Passed </h1>");
		}
		
		
		
		pw.print("<h1>Scored "+percentage+"% </h1>");
	}
}
