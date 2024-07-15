package com.keerti;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        PrintWriter out = resp.getWriter();
            
        String myname = req.getParameter("name");
        String myemail = req.getParameter("email");
        String mypass = req.getParameter("password");
        String mygender = req.getParameter("gender");
        String mycity = req.getParameter("city");
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/userdb", "root", "");  // Replace "password" with your MySQL password
            
            
            
            
            
//		    String query = "create table register(name varchar(30), email varchar(20),password varchar(40), gender varchar(12), city varchar(20))";
//			Statement st = con.createStatement();
//			st.executeUpdate(query);
//			out.println("table Created");
            
            
            
            
            ps = con.prepareStatement("INSERT INTO register (name, email, password, gender, city) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, myname);
            ps.setString(2, myemail);
            ps.setString(3, mypass);
            ps.setString(4, mygender);
            ps.setString(5, mycity);
            
            int count = ps.executeUpdate();
            if (count > 0) {
                resp.setContentType("text/html");
                out.print("<script>alert('Registration Successfull!');</script>");              
                RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
                rd.include(req, resp);
            } else {
                resp.setContentType("text/html");
                out.print("<script>alert('User not registered due to an error');</script>");
                
                RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
                rd.include(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.setContentType("text/html");
            out.print("<script>alert('Exception Occurred: " + e.getMessage() + "');</script>");
            
            RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
            rd.include(req, resp);
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}