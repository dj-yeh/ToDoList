package model;

import java.util.ArrayList;

/**
 * This class represents the tasks a user may put into each of their to-do lists.
 * @author DJ Yeh and Sherry Shao
 *
 */
public class Task 
{
	//------------------------------Instance Variables----------------------------------
	/**
	 * This instance variable represents the name of the task.
	 */
	private String taskName;
	/**
	 * This instance variable represents the completion status of a task.
	 */
	private boolean completed;
	/**
	 * This instance variable represents the overdue status of a task.
	 */
	private boolean overdue;
	/**
	 * This instance variable represents a task description the user can input.
	 */
	private String noteDescription;
	//------------------------------Instance Variables----------------------------------
	
	//--------------------------------Constructors--------------------------------------
	/**
	 * This is the most general constructor which the other constructors use to localize logic.
	 * @param task will be the name of the task
	 * @param completed indicates if a task has been checked off or not
	 * @param overdue indicates whether or not a task was completed in time
	 * @param noteDescription will be the user's task description
	 */
	public Task(String taskName, boolean completed, boolean overdue, String noteDescription)
	{
		setTaskName(taskName);
		setCompleted(completed);
		setOverdue(overdue);
		setNoteDescription(noteDescription);
	}
	
	/**
	 * A less general constructor which only requires the task.
	 * @param task will be the name of the task
	 */
	public Task(String taskName)
	{
		this(taskName, false, false, null);
	}
	
	/**
	 * A less general constructor which only requires the completion status.
	 * @param completed indicates if a task has been checked off or not
	 */
	public Task(boolean completed)
	{
		this(null, completed, false, null);
	}
	
	//--------------------------------Constructors--------------------------------------
	
	public String getTaskName() 
	{
		return this.taskName;
	}
	
	public void setTaskName(String taskName)
	{
		this.taskName = taskName;
	}
	
	public boolean getCompleted()
	{
		return this.completed;
	}
	
	public void setCompleted(boolean completed)
	{
		this.completed = completed;
	}
	
	public boolean getOverdue()
	{
		return this.overdue;
	}
	
	public void setOverdue(boolean overdue)
	{
		this.overdue = overdue;
	}
	
	public String getNoteDescription()
	{
		return this.noteDescription;
	}
	
	public void setNoteDescription(String noteDescription)
	{
		this.noteDescription = noteDescription;
	}
}
