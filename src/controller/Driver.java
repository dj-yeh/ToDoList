package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This is the main class where the main thread runs through to start the application.
 * @author DJ Yeh and Sherry Shao
 *
 */
public class Driver extends Application
{
	/**
	 * This is the main method where the main thread will thread through to set up the application.
	 * @param args
	 */
	 public static void main(String[] args) 
	 {
		 launch(args);
		 //this line basically sets up another thread that will set up a bunch of behind the scenes
		 //stuff to set up UI which eventually calls the start method which is overridden with our definition below
	 }
	
	/**
	 * This method initially sets up the UI for the program.
	 */
	 @Override
	 public void start(Stage primaryStage) throws Exception
	 {
		 Parent root = FXMLLoader.load(getClass().getResource("/view/sample.fxml"));
		 //the param at the end details where the UI gets its format from when displaying things
	     primaryStage.setTitle("Hello World");
	     primaryStage.setScene(new Scene(root, 300, 275));
	     primaryStage.show();
	 }
}
