package com.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
	
 static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int num= Integer.parseInt(req.getParameter("valuePassing"));// get value from parameter
		PrintWriter writer = res.getWriter();
		writer.println("sum = "+num+" | sum square = "+num*num);
	
		
	}

}
