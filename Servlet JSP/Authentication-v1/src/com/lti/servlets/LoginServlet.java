package com.lti.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		if(user.equals("admin") && pass.equals("admin")){
//			response.sendRedirect("success.view");
			RequestDispatcher rd = request.getRequestDispatcher("success.view");
			rd.forward(request, response);
		}else{
			response.sendRedirect("error.view");
		}
	}

}
