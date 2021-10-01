package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		out.println("<h2>Welcome to register servlet</h2>");
		String name = request.getParameter("user_name");
		String pass = request.getParameter("user_pass");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("course");
		String condition = request.getParameter("condition");
		
		if( condition != null)
		{
		if(condition.equals("checked") )
		{
			out.println("<h1>Welcome "+name+"</h1>");
			out.println("<h2>Your Details are: </h2>");
			out.println("<h2>Name: "+name+"</h2>");
			out.println("<h2>Gender: "+gender+"</h2>");
			out.println("<h2>Preferred Course: "+course+"</h2>");
		}
		
		else
		{
			out.println("<h2>You have not accepted TnC</h2>");
		}
		}
		else
		{
			out.println("<h2>You have not accepted TnC</h2>");
		}
	}


	
}
