package vm222cv_assign3.up_down_pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UpDownMain extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		UpDownPane upDownPane = new UpDownPane(); //making a new object of updownpane
		Scene scene = new Scene(upDownPane, 7*100, 7*100); //making a scene with the updownpane object and the sizes 700*700
        scene.setOnKeyPressed(event -> upDownPane.moveOnKey(event)); 
        //when the key is pressed inside the scene then we call the moveOnKey method for the updownpane object
        
		primaryStage.setTitle("Up & Down & Left & Right"); //setting title of the window
        primaryStage.setScene(scene); //setting the scene for the window
        primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}