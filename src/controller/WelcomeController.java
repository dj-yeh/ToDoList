package controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * This is the controller for the /view/welcome_screen.fxml file.
 * @author DJ Yeh and Sherry Shao
 */
public class WelcomeController 
{
	
	@FXML
	private Button continueBtN;
	
	@FXML
	private Button darkThemeBtN;
	
	@FXML
	private Button rosyThemeBtN;
	
	@FXML
	private Button lightThemeBtN;
	
	@FXML
	private Button fourthThemeBtN;
	
	@FXML
	private Button fifthThemeBtN;
	
	@FXML
	private ImageView yamLogoIV;
	
	@FXML
	private TextField nameTF;
	
	/**
	 * Event handler for the continueBtn button when clicked upon.
	 * Should set up the user with his/her name, the theme, and other things.
	 * @throws IOException 
	 */
	@FXML
	private void setUpUser() throws IOException
	{
		this.switchScene("/view/today_screen.fxml", this.continueBtN);
	}
	
	/**
	 * Event handler for the darkThemeBtn button when clicked upon.
	 */
	@FXML
	private void changeToDark()
	{
		
	}
	
	/**
	 * Event handler for the rosyThemeBtn button when clicked upon.
	 */
	@FXML
	private void changeToRosy()
	{
		
	}
	
	/**
	 * Event handler for the lightThemeBtn button when clicked upon.
	 */
	@FXML
	private void changeToLight()
	{
		
	}
	
	/**
	 * Event handler for the fourthThemeBtn button when clicked upon.
	 */
	@FXML
	private void changeToFourth()
	{
		
	}
	
	/**
	 * Event handler for the fifthThemeBtn button when clicked upon.
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
