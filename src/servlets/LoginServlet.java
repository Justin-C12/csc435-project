package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Get user info from webpage
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(userName.equals("java") & password.equals("123")) {
			//forwards the request to HomeServlet
			RequestDispatcher rd = request.getRequestDispatcher("home");
			rd.forward(request, response);
		} else {
			out.println("User Name or Password incorrect");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		
		}
		
		
		
	
		
	}
}
