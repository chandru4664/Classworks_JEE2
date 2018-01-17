package com.htc.servlet.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		//call a dao method here
		if(username.equals("Anish") && pwd.equals("htc")) {
			pw.println("<h2> Login Successful</h2>");
		}
		else {
			pw.println("<h2>Login Failure</h2>");
			pw.println("<a href='login.html'> Login Again </a>");
		}
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("doPost() method");
		doGet(request, response);
	}

}
