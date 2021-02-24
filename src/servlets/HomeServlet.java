package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html><html>");
        out.println("<h1>Welcome to your workout tracker!</h1>");
        out.println("<button type='submit' value='Submit'>Home</button>");
        out.println("<button type='submit' value='Submit'>Upper Body Exercises</button>");
        out.println("<button type='submit' value='Submit'>Lower Body Exercises</button>");
        out.println("<button type='submit' value='Submit'>Cardio</button>");
        out.println("</html>");
        
	}
}
