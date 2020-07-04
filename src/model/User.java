package model;

import java.util.ArrayList;

/**
 * This class represents the single user using this app on their laptop.
 * @author DJ Yeh and Sherry Shao
 *
 */
public class User 
{
	//------------------------------Instance Variables----------------------------------
	/**
	 * This instance variable represents the name of the user.
	 */
	private String name;
	
	/**
	 * This instance variable represents all the to-do lists a user may create.
	 * may need to change the data structure used here
	 */
	private ArrayList<ToDoList> lists;
	
	
	//TENTATIVE
	/**
	 * This instance variable represents the path to the photo stored on the user's system for their profile picture
	 */
	private String propic;
	
	/**
	 * This instance variable holds onto what theme the user wants
	 */
	private String theme;
	//------------------------------Instance Variables----------------------------------
	
	
	//--------------------------------Constructors--------------------------------------
	/**
	 * This is the most general constructor which the other constructors use to localize logic.
	 * @param name will be the name of the user that may be passed to it
	 * @param lists possibly at the time of creation of a user, they may have ToDoLists already,
	 * 		  but may not be necessary
	 */
	public User(String name, ArrayList<ToDoList> lists)
	{
		setName(name);
		setLists(lists);
	}
	
	/**
	 * A less general constructor which only requires the name.
	 * @param name will be the name of the user that may be passed to it
	 */
	public User(String name)
	{
		this(name, null);
	}
	
	/**
	 * A less general constructor which only requires a list
	 * @param lists possibly at the time of creation of a user, they may have ToDoLists already,
	 * 		  but may not be necessary
	 */
	public User(ArrayList<ToDoList> lists)
	{
		this(null, lists);
	}
	
	/**
	 * Least general in that it requires no-args.
	 */
	public User()
	{
		this(null, null);
	}
	//--------------------------------Constructors--------------------------------------
	
	/**
	 * Getter method for the name of the user.
	 * @return a string which represents the name of the user.
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Setter method for the name of the user.
	 * @param name is just the name the user object will be set to.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Getter method for the list of to-do lists.
	 * @return a list of all the to-do lists
	 */
	public ArrayList<ToDoList> getLists()
	{
		return this.lists;
	}
	
	/**
	 * Setter method for the list of to-do lists.
	 * @param lists a list of to-do lists that may be imported
	 */
	public void setLists(ArrayList<ToDoList> lists)
	{
		this.lists = lists;
	}
}
