package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println(
		         "<html>\n" +
		            "<head><title> WelCome Page</title></head>\n" +
		           "<body>"+
						"<div class=\"container\">\r\n"
						+ "<form action=\"RegisterServlet\" method=\"POST\">\r\n"
						+ "	<table>\r\n"
						+ "		<tr>\r\n"
						+ "			<td>Name:</td>\r\n"
						+ "			<td><input type = \"text\" name = \"user_name\"></td>\r\n"
						+ "		</tr>\r\n"
						+ "		\r\n"
						+ "		<tr>\r\n"
						+ "			<td>Password:</td>\r\n"
						+ "			<td><input type = \"password\" name = \"user_pass\"></td>\r\n"
						+ "		</tr>\r\n"
						+ "		\r\n"
						+ "		<tr>\r\n"
						+ "			<td>Gender:</td>\r\n"
						+ "			<td><input type = \"radio\" name = \"user_gender\" value=\"male\">Male &nbsp; &nbsp;\r\n"
						+ "				<input type = \"radio\" name = \"user_gender\" value=\"female\">Female\r\n"
						+ "			</td>\r\n"
						+ "		</tr>\r\n"
						+ "		<tr>\r\n"
						+ "			<td>Prefered Course:</td>\r\n"
						+ "			<td><select name= \"course\">\r\n"
						+ "					<option value= \"java\">Java</option>\r\n"
						+ "					<option value= \"python\">Python</option>\r\n"
						+ "					<option value= \"sql\">SQl</option>\r\n"
						+ "					<option value= \"c\">C</option>\r\n"
						+ "				</select>\r\n"
						+ "			</td>\r\n"
						+ "		</tr>\r\n"
						+ "		<tr>\r\n"
						+ "			<td style =\"text-align: right;\">\r\n"
						+ "				<input type = \"checkbox\" value = \"checked\" name = \"condition\">\r\n"
						+ "			</td>\r\n"
						+ "			<td>Terms ans Conditions</td>\r\n"
						+ "		</tr>\r\n"
						+ "		<tr>\r\n"
						+ "			<td></td>\r\n"
						+ "			<td>\r\n"
						+ "				<button type= \"submit\" >Register </button>\r\n"
						+ "				<button type= \"reset\" >Reset </button>\r\n"
						+ "			</td>\r\n"
						+ "		</tr>\r\n"
						+ "	</table>\r\n"
						+ "</form>\r\n"
						+ "</div>"+
		            "</body>"+
		         "</html>"
		      );
	}

}
