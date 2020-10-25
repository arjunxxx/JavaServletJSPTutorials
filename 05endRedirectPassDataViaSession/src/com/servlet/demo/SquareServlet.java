package com.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.ldap.StartTlsRequest;
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

		HttpSession session = req.getSession();
		int num = (int) session.getAttribute("valuePassingViaSession");// way of getting value from session
		
		
		PrintWriter writer = res.getWriter();
		writer.println("sum = " + num + " | sum square = " + num * num);

	}

}
