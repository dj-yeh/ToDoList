package controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * This is the controller for the user_setup.fxml file.
 * @author DJ Yeh
 */
public class SetUpController 
{
	@FXML
	private Button continueBtn;
	
	@FXML
	private TextField nameTF;
	
	@FXML
	private Button darkThemeBtn;
	
	@FXML
	private Button rosyThemeBtn;
	
	@FXML
	private Button lightThemeBtn;
	
	@FXML
	private Button fourthThemeBtn;
	
	@FXML
	private Button fifthThemeBtn;
	
	/**
	 * Event handler for the continueBtn when clicked.
	 */
	@FXML
	private void setUpUser()
	{
		try {
			switchScene("/view/today_screen.fxml", this.continueBtn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Event handler for the darkThemeBtn when clicked.
	 */
	@FXML
	private void changeToDark()
	{
		
	}
	
	/**
	 * Event handler for the rosyThemeBtn when clicked.
	 */
	@FXML
	private void changeToRosy()
	{
		
	}
	
	/**
	 * Event handler for the lightThemeBtn when clicked.
	 */
	@FXML
	private void changeToLight()
	{
		
	}
	
	/**
	 * Event handler for the fourthThemeBtn when clicked.
	 */
	@FXML
	private void changeToFourth()
	{
		
	}
	
	/**
	 * Event handler for the fifthThemeBtn when clicked.
	 */
	@FXML
	private void changeToFifth()
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
