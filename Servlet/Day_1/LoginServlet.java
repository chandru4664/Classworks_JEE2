package university;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String uname = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		if(uname.equals("newuser") && password.equals("123Welcome")) {
			
			pw.println("<h2> Successful Login</h2>");
		}else {
			pw.println("Invalid user<br/>");
			pw.println("Login Again: <a href='login.html'> Login </a>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
