package model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import controller.Driver;

/**
 * This class represents the single user using this app on their laptop.
 * @author DJ Yeh and Sherry Shao
 *
 */
public class User implements Serializable
{
	/**
	 * This is used to serialize this class of objects
	 */
	private static final long serialVersionUID = 1L;

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
	 * This instance variable holds onto what theme the user wants and holds the path to the banner.
	 */
	private int themeBanner;
	//------------------------------Instance Variables----------------------------------
	
	
	//--------------------------------Constructors--------------------------------------
	/**
	 * This is the most general constructor which the other constructors use to localize logic.
	 * @param name is the name of the user
	 * @param lists an ArrayList of ToDoLits
	 * @param propic the path to the propic stored in the user's system
	 * @param themeBanner the path to the banner associated with the theme selected by the user at the beginning
	 */
	public User(String name, ArrayList<ToDoList> lists, String propic, int themeBanner)
	{
		setName(name);
		setLists(lists);
		setPropic(propic);
		setThemeBanner(themeBanner);
	}
	
	
	/**
	 * A less general constructor which only instantiates some of the instance variables.
	 * @param name is the name of the user
	 * @param propic the path to the propic stored in the user's system
	 * @param themeBanner the path to the banner associated with the theme selected by the user at the beginning
	 */
	public User(String name, String propic, int themeBanner)
	{
		this(name, null, propic, themeBanner);
	}
	
	/**
	 * A less general constructor which only instantiates some of the instance variables.
	 * @param lists an ArrayList of ToDoLits
	 * @param themeBanner the path to the banner associated with the theme selected by the user at the beginning
	 */
	public User(ArrayList<ToDoList> lists, int themeBanner)
	{
		this(null, lists, null, themeBanner);
	}
	
	/**
	 * A less general constructor which only instantiates some of the instance variables.
	 * @param themeBanner the path to the banner associated with the theme selected by the user at the beginning
	 */
	public User(int themeBanner)
	{
		this(null, null, null, themeBanner);
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
	
	/**
	 * Getter method for the path to the user's profile picture.
	 * @return the path to the propic
	 */
	public String getPropic()
	{
		return this.propic;
	}
	
	/**
	 * Setter method for the path to the user's profile picture and may be used if the user wants to change
	 * their profile picture.
	 * @param propic the path to the propic on the user's system
	 */
	public void setPropic(String propic)
	{
		this.propic = propic;
	}
	
	/**
	 * Getter method for the path to the banner associated with the theme chosen by the user.
	 * @return the path to the themeBanner
	 */
	public int getThemeBanner()
	{
		return this.themeBanner;
	}
	
	/**
	 * Setter method for the path to the theme banner.
	 * @param themeBanner the path to the theme banner which will be stored in the project space.
	 */
	public void setThemeBanner(int themeBanner)
	{
		this.themeBanner = themeBanner;
	}
	
	//---------------------------------FOR SERIALIZATION-------------------------------------
	/**
	 * This method just serializes an ArrayList of all user instances created by the application
	 * @param user is an ArrayList of all the user instances created by the application
	 * @throws IOException which could occur when inputting into the file
	 */
	
	
	public static void writeToFile(User user) throws IOException, FileNotFoundException 
	{
		//this is the file name which appears when you go through folders but not in project space
		String fileName = "user_info.bin";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));


		oos.writeObject(user);

		// closes the stream
		oos.close();
	}
	
	/**
	 * This method deserializes an ArrayList of all user instances formed by an
	 * earlier use of the app.
	 * 
	 * @return an ArrayList of all users that have been created by an earlier use of
	 *         the app
	 * @throws IOException            which could occur when reading from the file,
	 *                                specifically a type mismatch
	 * @throws ClassNotFoundException there are no objects to deserialize
	 */
	
	public static User readFromFile() throws IOException, ClassNotFoundException {
		String fileName = "user_info.bin";
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
		User user = null;
		try {
			user = (User) ois.readObject();
		} catch (EOFException e) {
			ois.close();
		}
		
		ois.close();
		return user;
	}
	
}