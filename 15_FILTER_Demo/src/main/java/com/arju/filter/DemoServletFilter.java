package com.arju.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class DemoServletFilter
 * 
 */

@WebFilter("/demoServlet")
public class DemoServletFilter implements Filter {

	
	
	 static final Logger logger = Logger.getLogger(DemoServletFilter.class);
    /**
     * Default constructor. 
     */
    public DemoServletFilter() {
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		logger.info("inside filter");
		logger.info("inside filter "+request.getParameter("userName").toString());
		if(request.getParameter("userName").toString().equals("Arjun")) {
			response.getWriter().println("Invalid User Name");
			
			logger.info("inside if "+request.getParameter("userName").toString());
		}else {
			logger.info("inside else "+request.getParameter("userName").toString());
		chain.doFilter(request, response);
		}
	}

	

}
