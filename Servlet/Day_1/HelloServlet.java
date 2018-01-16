package university;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		pw.println("<h2> Welcome to servlet</h2>");
		pw.println("<p>Servlet are server side java objects. Servlet are multithreaded.Servlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreadedServlet are server side java objects. Servlet are multithreaded</p>");
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doGet(request, response);
	}
}
