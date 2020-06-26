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
	private String task;
	/**
	 * This instance variable represents the completion status of a task.
	 */
	private Boolean completed;
	/**
	 * This instance variable represents the overdue status of a task.
	 */
	private Boolean overdue;
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
	public Task(String task, boolean completed, boolean overdue, String noteDescription)
	{
		setTask(task);
		setCompleted(completed);
		setOverdue(overdue);
		setNoteDescription(noteDescription);
	}
	
	/**
	 * A less general constructor which can be used when no tasks need to be initialized yet.
	 * @param task will be the name of the task
	 * @param completed indicates if a task has been checked off or not
	 * @param overdue indicates whether or not a task was completed in time
	 * @param noteDescription will be the user's task description
	 */
	public Task(String task)
	{
		this(task, false, false, null);
	}
	
	public Task(boolean completed)
	{
		this(null, completed, false, null);
	}
	
	//--------------------------------Constructors--------------------------------------
	
	public String getTask() 
	{
		return this.task;
	}
	
	public void setTask(String task)
	{
		this.task = task;
	}
	
	public boolean getCompleted()
	{
		return this.getCompleted();
	}
	
	public void setCompleted(boolean completed)
	{
		this.completed = completed;
	}
	
	public boolean getOverdue()
	{
		return this.getOverdue();
	}
	
	public void setOverdue(boolean overdue)
	{
		this.overdue = overdue;
	}
	
	public String getNoteDescription()
	{
		return this.getNoteDescription();
	}
	
	public void setNoteDescription(String noteDescription)
	{
		this.noteDescription = noteDescription;
	}
}
