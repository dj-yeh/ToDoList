package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * This is the controller for the /view/welcome_screen.fxml file.
 * @author DJ Yeh and Sherry Shao
 */
public class WelcomeController implements Initializable
{
	
	@FXML
	private Button nextBtn;
	
	@FXML
	private ImageView yamLogoIV;
	
	/**
	 * This method is always ran when the screen is entered.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		try {
			File file = new File("Resources/Images/Colorized Complete.jpg");
			FileInputStream input = new FileInputStream(file);
			//opens a connection to the actual file provided the path name in the file system
			Image image = new Image(input);
			yamLogoIV.setImage(image);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//need to dynamically show the picture of the logo which is stored locally in the project space
		
	}
	
	/**
	 * Event handler for the nextBtn button when clicked.
	 */
	@FXML
	private void openApp()
	{
		try {
			if(Driver.user == null)
			{
				switchScene("/view/user_setup.fxml", this.nextBtn);
			}
			else
			{
				switchScene("/view/today_screen.fxml", this.nextBtn);
			}
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

