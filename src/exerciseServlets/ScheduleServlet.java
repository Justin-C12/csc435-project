package exerciseServlets;

import java.util.HashMap;

public class ScheduleServlet {
	
	private String day;
	private String[] exercises;
	private HashMap<String, String[]> scheduleStore;

	//Constructor
	public ScheduleServlet(String day, String[] exercises)
	{
		this.day = day;
		this.exercises = exercises;
	}
	
	//Stores schedule in a hash map
	public void storeSchedule()
	{
		scheduleStore.put(day, exercises);
	}
	
	//returns the hash map of the schedule
	public HashMap<String, String[]> getSchedule() {
		return scheduleStore;
	}
}
