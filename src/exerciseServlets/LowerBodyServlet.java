package exerciseServlets;

import java.util.HashMap;

public class LowerBodyServlet {
	
	private String name;
	private String muscleGroup;
	private double weightLifted;
	private HashMap<String, Double> exerciseStore;
	
	public LowerBodyServlet(String name, String muscleGroup, double weightLifted) 
	{
		this.name = name;
		this.muscleGroup = muscleGroup;
		this.weightLifted = weightLifted;
	}
	
	public void storeLowerExercise() 
	{
		exerciseStore.put(name, weightLifted);
	}
	
	public String getExercise() 
	{
		return name;
	}
	
	public double getWeight() 
	{
		return weightLifted;
	}
	
	public String getMuscleGroup() 
	{
		return muscleGroup;
	}
}
