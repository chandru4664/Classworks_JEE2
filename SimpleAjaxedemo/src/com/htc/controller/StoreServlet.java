package com.htc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.htc.dao.Employee;
import com.htc.dao.EmployeeDAOImpl;
import com.htc.delegate.Employeedelegate;

/**
 * Servlet implementation class StoreServlet
 */
@WebServlet("/Store")
public class StoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		/*
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int salary=Integer.parseInt(request.getParameter("salary"));
		int commission=Integer.parseInt(request.getParameter("comm"));
		int did=Integer.parseInt(request.getParameter("did"));
		
		Employee e=new Employee(id,name,salary,commission,did);
		Employeedelegate ed=new Employeedelegate();
		if(ed.storeEmp(e))
		{
			pw.println("EMployee registration completed successfully");
		}*/
	pw.close();
	
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
