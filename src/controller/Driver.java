package controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.User;

/**
 * This is the main class where the main thread runs through to start the application.
 * @author DJ Yeh and Sherry Shao
 *
 */
public class Driver extends Application
{
	//----------------------------------------Global Point of Reference-----------------------------------------
	/**
	 * Gives the entire application a global point of access to the stage 
	 * in which all the UI scenes will be switched in and out of.
	 */
	public static Stage mainStage;
	
	/**
	 * Gives the entire application a global point of access to the user
	 * containing all the info to display throughout the application.
	 */
	public static User user;
	//----------------------------------------Global Point of Reference-----------------------------------------
	
	/**
	 * This is the main method where the main thread will thread through to set up the application.
	 * @param args
	 */
	 public static void main(String[] args) 
	 {
		 //**************************************************************************
		 // DESERIALIZATION SHOULD OCCUR HERE
		 // NEED TO JUST DESERIALIZE THE USER TO GRAB BACK ALL THE INFO FROM THE 
		 // LAST SESSION.
		 // |
		 // |
		 // \/
		 
		 
		 
		 //**************************************************************************
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
		 mainStage = primaryStage;
		 
		 //if-else, if there is a user object already, just show the today's tdl, else show the welcome screen
		 Parent root = FXMLLoader.load(getClass().getResource("/view/welcome_screen.fxml"));
		 //the param at the end details where the UI gets its format from when displaying things
	     primaryStage.setTitle("YAM To Do List");
	     primaryStage.setScene(new Scene(root));
	     primaryStage.setResizable(false);
	     primaryStage.show();
	     
		 // --------------------------------------EVENT HANDLER----------------------------------------------
		 // this serializes all objects
		 // this sets an event handler for the primary stage when it's closed
		 mainStage.setOnCloseRequest(e -> {
			 try 
			 {
			 	 //User.writeToFile();
			 } 
			 catch (Exception err) 
			 {
				 System.out.println("Error serializing objects.");
			 }

		 });
		// -------------------------------------------------------------------------------------------------
	 }
}
