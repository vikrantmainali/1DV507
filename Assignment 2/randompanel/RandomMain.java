package vm222cv_assign2.randompanel;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RandomMain extends Application
{
	
	 public void start(Stage stage) throws Exception
	 {
	        RandomPanel rp = new RandomPanel(); //calling the RandomPanel object that we have created 
	        
	        Group root = new Group();
	        root.getChildren().addAll(rp); //Grouping the RandomPanel object so we can display it on the scene

	        Scene scene = new Scene(root,400,55); //setting the display of the scene along with its width and height
	        stage.setTitle("Random number generator"); //setting title of the stage
	        stage.setScene(scene);
	        stage.show();

	    }
	 
	   public static void main(String[] args)
	   {
	        launch(args);
	   }
	
}
