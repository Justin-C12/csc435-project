package servlets;

import java.io.IOException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
	
		
		
		//Get user info from webpage
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		
		System.out.println(firstName + lastName);
		
		RequestDispatcher rd = request.getRequestDispatcher("home");
		rd.forward(request, response);
		
	}
}
