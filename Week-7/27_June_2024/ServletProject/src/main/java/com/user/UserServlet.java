package com.user;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		String a = req.getParameter("username");
		String b = req.getParameter("password");
		System.out.println(a+" "+b);
	}

}
