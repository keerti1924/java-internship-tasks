package com.keerti;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class Logout extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException { 
  
        
        PrintWriter out = res.getWriter(); 
  
       
        res.setContentType("text/html"); 
  
        
        System.out.println("Session before invalidate: "+ req.getSession(false)); 
  
        
        req.getSession(false).invalidate(); 
  
        
        System.out.println("Session after invalidate: "+ req.getSession(false)); 
  
        
        out.println("<script>alert('Thank you! You are successfully logged out.');</script>"); 
        RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
		rd.include(req, res);
        out.close(); 
    } 
}
