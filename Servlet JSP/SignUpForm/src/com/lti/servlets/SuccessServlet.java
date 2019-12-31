package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/success.view")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String employeeCode = request.getParameter("employeeCode");
		String dept = request.getParameter("dept");
		String day = request.getParameter("day");
		String month = request.getParameter("month");
		String year = request.getParameter("year");
		String address = request.getParameter("address");
		String trainingLeft = request.getParameter("trainingLeft");
		String[] trainingPA = request.getParameterValues("trainingPA");



		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		//		out.println("<table><tr> <td>"+name+ "</td></tr> "
		//				+ "<tr> <td>"+employeeCode+ "</td> </tr> "
		//				+ "<tr> <td>"+dept+ "</td></tr> "
		//				+ "<tr><td>"+day+" "+month+" "+year+ "</td></tr> "
		//				+ "<tr> <td>"+address+ "</td></tr> "
		//				+ "<tr><td>"+trainingLeft+ "</td></tr >"
		//				+ "<tr><td>");
		//				for(int i = 0; i < trainingPA.length; i++){
		//					out.println(trainingPA[i]);
		//				}
		//				out.println("</td></tr > "
		//				+ "</table>");

		out.println("<Html>");
		out.println("<Body>");
		out.println("<Table>");
		out.println("<tr>");
		out.println("<td>Employee name: </td>");
		out.println("<td>"+name+"</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>Employee Department: </td>");
		out.println("<td>"+dept+"</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>Employee Code: </td>");
		out.println("<td>"+employeeCode+"</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>Employee DOJ: </td>");
		out.println("<td>"+day+" "+month+" "+year+"</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>Employee Address: </td>");
		out.println("<td>"+address+"</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>Employee Program attended: </td>");
		out.println("<td>");
		for(String i : trainingPA){
			out.println(i+" ");
		}
		out.println("</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>Employee Training Left: </td>");
		out.println("<td>"+trainingLeft+"</td>");
		out.println("</tr>");



		out.println("</Table>");
		out.println("</Body>");		
		out.println("</Html>");

	}	

}
