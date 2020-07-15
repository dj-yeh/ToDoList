package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * This is the controller class for the today_screen.fxml file.
 * @author dj_yeh
 */
public class TodayController 
{
	@FXML
	private ImageView bannerImageView;
	
	/**
	 * SHERRY, NEED TO FILL IN THE GENERIC TYPE WITH SOMETHING LIKE A LABEL
	 */
	@FXML
	private ChoiceBox<Label> settingsChoiceBox;
	
	//@FXML
	//private Avatar pfpAvatar;
	
	/**
	 * May need to change the widget being placed into the ListView Widget
	 */
	@FXML
	private ListView<TextField> tasksListView;
	
	@FXML
	private TextField addTaskTF;
	
	@FXML 
	private TextArea memoTextArea;
	
	@FXML
	private Label hellowNameLabel;
	
	@FXML 
	private Label todayDateLabel;

	@FXML
	private Button changePFPBtn;
	
	@FXML
	private Button calendarBtn;
	
	@FXML
	private Button tomorrowBtn;
	
	@FXML
	private Button todayBtn;
	
	@FXML 
	private Button deleteTaskBtn;
	
	@FXML
	private Button setDueDateBtn;
	
	@FXML
	private Button higherPriorityBtn;
	
	@FXML
	private Button lowerPriorityBtn;
	
	/**
	 * Event handler for the settingsChoiceBox variable when clicked.
	 */
	@FXML
	private void showSettings()
	{
		
	}
	
	/**
	 * Event handler for the changePFPBtn button when clicked.
	 */
	@FXML
	private void changePFP()
	{
		
	}
	
	/**
	 * Event handler for the calendarBtn button when clicked.
	 */
	@FXML
	private void showCalendar()
	{
		
	}
	
	/**
	 * Event handler for the tomorrowBtn button when clicked.
	 */
	@FXML
	private void showTomorrow()
	{
		
	}
	
	/**
	 * Event handler for the todayBtn button when clicked.
	 */
	@FXML
	private void showToday()
	{
		
	}
	
	/**
	 * Event handler for the addTaskTF when clicked.
	 * Just need to differentiate between valid and invalid inputs so that unnamed tasks are not allowed when first clicking.
	 * Also needs to clear the text field after adding successfully.
	 */
	@FXML
	private void addTask()
	{
		
	}
	
	/**
	 * Event handler for the memoTextArea when a "button a key is pressed".
	 * may need to change the trigger event for this widget
	 */
	@FXML
	private void addMemo()
	{
		
	}
	
	/**
	 * Event handler for the deleteTaskBtn button when clicked.
	 */
	@FXML
	private void deleteTask()
	{
		
	}
	
	/**
	 * Event handler setDueDateBtn button when clicked.
	 */
	@FXML
	private void setDueDate()
	{
		
	}
	
	/**
	 * Event handler for the higherPriorityBtn button when clicked.
	 */
	@FXML
	private void increasePriority()
	{
		
	}
	
	/**
	 * Event handler for the lowerPriorityBtn button when clicked.
	 */
	@FXML
	private void decreasePriority()
	{
		
	}
}