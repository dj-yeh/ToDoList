package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.User;

/**
 * This is the controller for the user_setup.fxml file.
 * @author DJ Yeh
 */
public class SetUpController implements Initializable
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
	 * This method is always called whenever the screen is entered.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		//this screen can only be entered if the variable being changed is null
		//also the 0 denotes that there is no theme selected by the user yet
		Driver.user = new User(0);
		
	}
	
	/**
	 * Event handler for the continueBtn when clicked.
	 */
	@FXML
	private void setUpUser()
	{
		//this sets up the name for the user
		String name = nameTF.getText().trim().replace("  ", "");
		if(name.equals(""))
		{
			Driver.displayErrorMessage("Please enter a name.");
			return;
		}
		
		Driver.user.setName(name);
		
		//if there is no theme chosen by the user, it will not allow the user to move onto the next screen
		if(Driver.user.getThemeBanner() == 0)
		{
			Driver.displayErrorMessage("Please select a theme, no theme has been selected yet.");
			return;
		}
		
		try {
			switchScene("/view/today_screen.fxml", this.continueBtn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Event handler for the darkThemeBtn when clicked.
	 * Theme Number = 1
	 */
	@FXML
	private void changeToDark()
	{
		Driver.user.setThemeBanner(1);
	}
	
	/**
	 * Event handler for the rosyThemeBtn when clicked.
	 * Theme Number = 2
	 */
	@FXML
	private void changeToRosy()
	{
		Driver.user.setThemeBanner(2);
	}
	
	/**
	 * Event handler for the lightThemeBtn when clicked.
	 * Theme Number = 3
	 */
	@FXML
	private void changeToLight()
	{
		Driver.user.setThemeBanner(3);
	}
	
	/**
	 * Event handler for the fourthThemeBtn when clicked.
	 * Theme Number = 4
	 */
	@FXML
	private void changeToFourth()
	{
		Driver.user.setThemeBanner(4);
	}
	
	/**
	 * Event handler for the fifthThemeBtn when clicked.
	 * Theme Number = 5
	 */
	@FXML
	private void changeToFifth()
	{
		Driver.user.setThemeBanner(5);
	}
	
    private void switchScene(String file, Button button) throws IOException
    {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource(file));
        Stage stage = (Stage) button.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }
}
