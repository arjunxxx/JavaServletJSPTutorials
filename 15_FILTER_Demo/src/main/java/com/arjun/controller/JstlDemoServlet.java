package com.arjun.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JstlDemoServlet
 *
 */

@WebServlet("/demoServlet")
public class JstlDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("userName").toString();
		
		
		String car1 = request.getParameter("car1").toString();
		String car2 = request.getParameter("car2").toString();
		String car3 = request.getParameter("car3").toString();
		
		List<String> carList= new ArrayList<String>();
		carList.addAll(Arrays.asList(car1,car2,car3));
		
		
		request.setAttribute("welcomeTag", "Welcome back "+name);
		request.setAttribute("carList", carList);
		RequestDispatcher rd= request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
	}


}
