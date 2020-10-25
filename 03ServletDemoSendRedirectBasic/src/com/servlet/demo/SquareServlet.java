package com.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
	
 static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		int num= (int) req.getAttribute("sum");// getting passed attribute from first servlet. 
//		PrintWriter writer = res.getWriter();
//		writer.println("sum = "+num+" | sum square = "+num*num);
	
	
	PrintWriter writer = res.getWriter();
    writer.println("sucesfully redirected to square server");
		
	}

}
