package com.woman;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.womanDao.ContactDao;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String message=request.getParameter("message");

		
		ContactDao dao=new ContactDao();
		dao.insert(name, email, message);
		//response.sendRedirect("Contact.html");
		/*if(dao.check(name, email, message))
		{
			request.getSession().setAttribute("name", name);
			request.getSession().setAttribute("email", email);
			request.getSession().setAttribute("message", message);
			response.sendRedirect("jsp/printout.jsp");
		}
		else
		{
			response.sendRedirect("Home.html");
		}*/
		
	}


}
