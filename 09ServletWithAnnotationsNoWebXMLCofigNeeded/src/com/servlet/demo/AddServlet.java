package com.servlet.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		 * req.setAttribute("sum", result); // set result in req object for passing to
		 * next servlet RequestDispatcher rd =
		 * req.getRequestDispatcher("square");//asking request dispatcher to forward to
		 * url /square servlet // servlet rd.forward(req, res);// forward method
		 * 
		 * 
		 */
		
		
		

		// BASIC REDIRECTION
		// res.sendRedirect("square");// asking client/broswer to redirect and go to
		// square servlet.

		
		
		
		// REDIRECTION WITH VALUE PASSING BY ALTERING URL
		// res.sendRedirect("square?valuePassing="+result);
		
		
		

		// Redirection and passing value via session
		//	HttpSession session = req.getSession();	
		//	session.setAttribute("valuePassingViaSession", result);
		
		
		
		//Data passing using Cookie
		Cookie cookie= new Cookie("valuePassingCookie", result+""); // creating a new cookie for passing value
		res.addCookie(cookie);// adding cookie to response 
		
		
		res.sendRedirect("square");

	}

}
