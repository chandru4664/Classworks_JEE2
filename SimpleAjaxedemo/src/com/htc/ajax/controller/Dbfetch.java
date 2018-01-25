package com.htc.ajax.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dbfetch
 */
@WebServlet("/Dbfetch")
public class Dbfetch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dbfetch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		 response.setContentType("text/xml");        
		 PrintWriter out=response.getWriter();
         
		 try
		 {
			 Class.forName("org.postgresql.Driver");
			 con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123Welcome");
			 System.out.println("DB connected");
		//Class.forName("oracle.jdbc.driver.OracleDriver");
        //con =DriverManager.getConnection("jdbc:oracle:thin:@www.java4s.com:1521:XE","system","admin");
       st=con.createStatement();
          rs = st.executeQuery("select username from users");

         out.println("<user>");
         while(rs.next())
         {                            
             out.println("<username>"+rs.getString(1)+"</username>");

         }
         out.println("</user>");
         
		 } 
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }



	
	}

}
