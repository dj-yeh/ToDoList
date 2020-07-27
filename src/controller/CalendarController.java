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
import javafx.scene.control.DatePicker;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * This is the controller class for the calendar_screen.fxml file.
 * @author DJ Yeh and Sherry Shao
 */
public class CalendarController implements Initializable{
	@FXML
	private ImageView bannerImageView;
	@FXML
	private ChoiceBox<Label> settingsChoiceBox;
	@FXML
	private Label helloNameLabel;
	@FXML
	private ListView<TextField> tasksListView;
	@FXML
	private Button changePFPBtn;
	@FXML
	private Button calendarBtn;
	@FXML
	private Button tomorrowBtn;
	@FXML
	private Button todayBtn;
	@FXML
	private Label selectedDateLabel;
	@FXML
	private TextField addTaskTF;
	@FXML
	private DatePicker calendarDatePicker;
	@FXML
	private Button confirmDateBtn;
	@FXML 
	private TextArea memoTextArea;
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
	
	}
	
	/**
	 * Event handler for settingsChoiceBox variable when clicked.
	 */
	@FXML
	private void showSettings() {

	}

	/**
	 * Event handler for changePFPBtN button when clicked.
	 */
	@FXML
	private void changePFP() {

	}

	/**
	 * Event handler for calendarBtN button when clicked.
	 */
	@FXML
	private void showCalendar() {

	}

	/**
	 * Event handler for tomorrowBtN button when clicked.
	 */
	@FXML
	private void showTomorrow() {
		try {
			this.switchScene("/view/tomorrow_screen.fxml", this.tomorrowBtn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Event handler for the todayBtN button when clicked.
	 */
	@FXML
	private void showToday() {
		try {
			this.switchScene("/view/today_screen.fxml", this.todayBtn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Event handler for addTaskTF text field when clicked. Need to differentiate
	 * between valid and invalid inputs so that unnamed tasks are not created. Also
	 * needs to clear the text field after successfully creating a task.
	 */
	@FXML
	private void addTask() {

	}

	/**
	 * Event handler for confirmDateBtN button when clicked.
	 */
	@FXML
	private void confirmDate() {

	}

	/**
	 * Event handler for the memoTextArea when text area is clicked on. may need to
	 * change the trigger event for this widget
	 */
	@FXML
	private void addMemo() {

	}

	/**
	 * Event handler for deleteTaskBtN button when clicked.
	 */
	@FXML
	private void deleteTask() {

	}

	/**
	 * Event handler for setDueDateBtN button when clicked.
	 */
	@FXML
	private void setDueDate() {

	}

	/**
	 * Event handler for higherPriorityBtN button when clicked.
	 */
	@FXML
	private void increasePriority() {

	}

	/**
	 * Event handler for lowerPriorityBtN button when clicked.
	 */
	@FXML
	private void decreasePriority() {

	}
	
	/**
	 * Event handler for the calendarDatePicker widget
	 */
	@FXML
	private void selectDate()
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

