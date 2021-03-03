package exerciseServlets;

import java.util.HashMap;

public class CardioServlet {
	
	private String name;
	private String length;
	private HashMap<String, String> exerciseStore;

	public CardioServlet(String name, String length)
	{
		this.name = name;
		this.length = length;
	}
	
	public void storeExercise()
	{
		exerciseStore.put(name, length);
	}
	
	public String getExercise() {
		return name;
	}
	
	public String getTime()
	{
		return length;
	}
}
