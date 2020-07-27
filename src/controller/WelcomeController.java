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
	private Button nextBtn;
	
	@FXML
	private ImageView yamLogoIV;
	
	/**
	 * Event handler for the nextBtn button when clicked.
	 */
	@FXML
	private void openApp()
	{
		try {
			switchScene("/view/user_setup.fxml", this.nextBtn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    private void switchScene(String file, Button button) throws IOException
    {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource(file));
        Stage stage = (Stage) button.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }

}

