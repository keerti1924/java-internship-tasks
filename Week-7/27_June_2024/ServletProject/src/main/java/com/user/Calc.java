package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Calc extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a =  Integer.parseInt(req.getParameter("n1"));
		int b =  Integer.parseInt(req.getParameter("n2"));
		int c = a+b;
		System.out.println("Add = " + c); 
		
		PrintWriter out=res.getWriter();
		out.println("Add = "+c);
	}
}
