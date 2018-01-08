package com.woman;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactInfo
 */
@WebServlet("/ContactInfo")
public class ContactInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String message=request.getParameter("message");
		
		System.out.println("The name is: "+name);
		System.out.println("The name is: "+email);
		System.out.println("The name is: "+message);
		
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("email", email);
		request.getSession().setAttribute("message", message);
		
		response.sendRedirect("jsp/printout.jsp");
	}

}
