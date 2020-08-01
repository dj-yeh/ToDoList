package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * This is the controller class for the today_screen.fxml file.
 * @author DJ Yeh and Sherry Shao
 */
public class TodayController implements Initializable
{
	@FXML
	private ImageView bannerImageView;
	
	/**
	 * SHERRY, NEED TO FILL IN THE GENERIC TYPE WITH SOMETHING LIKE A LABEL
	 */
	@FXML
	private ChoiceBox<Label> settingsChoiceBox;
	
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
	private Label helloNameLabel;
	
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
	 * This method is called/ran every time the screen is entered that this controller is associated with.
	 */
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		//personalizes the name label by setting it to the user's entered name
		helloNameLabel.setText("Hello, " + Driver.user.getName() + "!");
		//System.out.println(Driver.user.getThemeBanner());
	}
	
	/**
	 * Event handler for the settingsChoiceBox variable when clicked.
	 */
	@FXML
	private void showSettings()
	{
		//need to look up how to do this part
	}
	
	/**
	 * Event handler for the changePFPBtn button when clicked.
	 */
	@FXML
	private void changePFP()
	{
		//should be a file chooser here to display the photo/choose the photo
	}
	
	/**
	 * Event handler for the calendarBtn button when clicked.
	 */
	@FXML
	private void showCalendar()
	{
		try {
			this.switchScene("/view/calendar_screen.fxml", this.calendarBtn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Event handler for the tomorrowBtn button when clicked.
	 */
	@FXML
	private void showTomorrow()
	{
		try {
			this.switchScene("/view/tomorrow_screen.fxml", this.tomorrowBtn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Event handler for the todayBtn button when clicked.
	 */
	@FXML
	private void showToday()
	{
		//shouldn't do anything since it's being clicked from the TodayController
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
	
	private void switchScene(String file, Button button) throws IOException
    {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource(file));
        Stage stage = (Stage) button.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }
}

