package com.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.ldap.StartTlsRequest;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

	static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// OLD way of getting value from param by altering redirect URL
		// int num= Integer.parseInt(req.getParameter("valuePassing"));// get value from
		// parameter

		
		
		//Geeting value from session
		//HttpSession session = req.getSession();
		//int num = (int) session.getAttribute("valuePassingViaSession");// way of getting value from session
		
		
		//Getting value from ccokie
		Cookie[] cookies = req.getCookies(); // getting cookie from request
		int num=0;
		for(Cookie cok:cookies) {
			if("valuePassingCookie".equals(cok.getName())) { // find our cookie from list
				num=Integer.parseInt(cok.getValue());
			}
		}

		ServletContext servletContext = getServletContext();
		String contValue = servletContext.getInitParameter("TestContextParam");
		
		
		ServletConfig servletConfig = getServletConfig();
		String confValue = servletConfig.getInitParameter("TestContextParam");
		
		PrintWriter writer = res.getWriter();
		writer.println("sum = " + num + " | sum square = " + num * num  +"  |  cotext value = "+contValue+"  cofig Value= "+ confValue);

	}

}
