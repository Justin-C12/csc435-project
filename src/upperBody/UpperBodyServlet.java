package upperBody;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import com.google.gson.Gson;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpperBodyServlet extends HttpServlet{

	private String jsonData;
	private HashMap<String, String> map = new HashMap<String, String>();
	private Gson gson = new Gson();
	
	
	
	public UpperBodyServlet(){
		//Dummy data to start
		map.put("Bicep curls", "20");
		map.put("Shoulder press", "35");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		
		//Get parameters
		String name = request.getParameter("name");
		String weight = request.getParameter("weight");
		map.put(name, weight);
		
		//Create json and format the map as json
		jsonData = gson.toJson(map);
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		//Send json data as the response
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		out.println(jsonData);
		
	}
	
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
	{
		//Removes requested parameter
		String name = request.getParameter("name");
		map.remove(name);
		jsonData = gson.toJson(map);
		
	}
	
	public void doPut(HttpServletRequest request, HttpServletResponse response) 
	{
		//Gets parameters to be updated
		String exerciseKey = request.getParameter("name");
		String weight = request.getParameter("weight");
	
		//Updates weight
		if(exerciseKey.equals(map.get(exerciseKey)) != true && map.get(exerciseKey) != null) {
			map.put(exerciseKey, weight);
		}
	
		jsonData = gson.toJson(map);
	}

}
