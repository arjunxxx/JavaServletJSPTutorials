package com.servlet.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int result = num1 + num2;
		
		
		/*
		 * how we did it with forward
		 * 
		 * 
		 * req.setAttribute("sum", result); // set result in req object for passing to next servlet
		 * RequestDispatcher rd = req.getRequestDispatcher("square");//asking request dispatcher to forward to url /square servlet // servlet
		 * rd.forward(req, res);// forward method
		 * 
		 * 
		 */
		
		
		res.sendRedirect("square");// asking client/broswer to redirect and go to square servlet. 
		
		
	}

}
