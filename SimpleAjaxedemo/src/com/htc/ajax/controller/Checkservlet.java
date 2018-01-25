package com.htc.ajax.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Checkservlet
 */
@WebServlet("/Checkservlet")
public class Checkservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checkservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	java.io.PrintWriter out=response.getWriter();
		 String sn=request.getParameter("ver");
		 
		 try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				Connection con = null;
				 Statement st = null;
				 ResultSet rs = null;
				try {
					con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123Welcome");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
	        
			try {
				st = con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         //ResultSet rs = st.executeQuery("select * from emp where empno="+sn);
	         
			try {
				rs = st.executeQuery("select * from users where username='"+sn+"'");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  // this is for name
	         try {
				if(rs.next())
				 {    
				     out.println("<font color=red>");
				     out.println("Name already taken");
				     out.println("</font>");

				 }else {

				     out.println("<font color=green>");
				     out.println("Available");
				     out.println("</font>");
	}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         
	         
	}

}
