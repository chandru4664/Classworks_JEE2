package com.htc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.htc.dao.Employee;
import com.htc.delegate.Employeedelegate;

@WebServlet("/Search")
public class SearchServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/json");
		PrintWriter pw=response.getWriter();
		
		int eid=Integer.parseInt(request.getParameter("empno"));
		Employeedelegate ed=new Employeedelegate();
		Employee e=ed.getEmpByID(eid);
		System.out.println("Search servlet");
		JsonObjectBuilder empBuilder = Json.createObjectBuilder();
		empBuilder.add("empname",e.getEmployeename()).add("salary", e.getSalary()).add("job", e.getJob());
		JsonObject json = empBuilder.build();
		pw.println(json.toString());
		System.out.println(json.toString());
		pw.flush();
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
