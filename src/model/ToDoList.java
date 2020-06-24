package model;

import java.util.ArrayList;

/**
 * 
 * @author DJ Yeh and Sherry Shao
 *
 */
public class ToDoList 
{
	//------------------------------------------Instance Variables----------------------------------------------
	/**
	 * This instance variable represents the name of the to-do list.
	 */
	private String name;
	/**
	 * This instance variable represents the day of the month the list is associated with.
	 */
	private int day;
	/**
	 * This instance variable represents the month the list is associated with.
	 */
	private int month;
	/**
	 * This instance variable represents the year the list is associated with.
	 */
	private int year;
	/**
	 * This instance variable represents all the Task objects contained within the to-do list.
	 */
	private ArrayList<Task> tasks;
	//------------------------------------------Instance Variables----------------------------------------------
	
	//------------------------------------------Constructors----------------------------------------------
	/**
	 * This is the most general constructor for this class as it initializes all the instance variables.
	 * @param name is the name of the list
	 * @param day represents the day of the month the list is associated with
	 * @param month represents the month of the year the list is associated with
	 * @param year represents the year the list is associated with
	 * @param tasks represents the list of tasks associated with the list
	 */
	public ToDoList(String name, int day, int month, int year, ArrayList<Task> tasks)
	{
		
	}
	
	/**
	 * A less general constructor which can be used when no list of tasks needs to be initialized yet.
	 * @param name is the name of the list
	 * @param day represents the day of the month the list is associated with
	 * @param month represents the month of the year the list is associated with
	 * @param year represents the year the list is associated with
	 */
	public ToDoList(String name, int day, int month, int year)
	{
		
	}
	//NO NO-ARG CONSTRUCTOR BECAUSE EVERY TO-DO LIST MUST BE CREATED WITH A NAME AND TIME
	//------------------------------------------Constructors----------------------------------------------
	
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getDay()
	{
		return this.day;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public int getMonth()
	{
		return this.month;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public ArrayList<Task> getTasks()
	{
		return this.tasks;
	}
	
	public void setTasks(ArrayList<Task> tasks)
	{
		this.tasks = tasks;
	}
	
	/**
	 * This method will possibly be called to order the tasks instance variable.
	 * may not need this since the order of the tasks can be changed by the user.
	 */
	public void sortTasks()
	{
		
	}
	
}
