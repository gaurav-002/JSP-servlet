package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GreetingServlet implements Servlet {  
	private int count=0;
    public GreetingServlet() {
    	System.out.println("constructor GreetingServlet");
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method");
	}
	public void destroy() {
		System.out.println("destroy method");
	}	
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig method");
		return null;
	}
	public String getServletInfo() {
		System.out.println("getServletInfo method");
		return null; 
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		count++;
		PrintWriter out = response.getWriter(); 
		response.setContentType("text/html");
		out.println("<h1>you are accessed the page for " +count+ " times.</h1>");
		
	}

}
