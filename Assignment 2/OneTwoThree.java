package vm222cv_assign2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.layout.Pane;
import javafx.scene.Group;
import javafx.scene.Scene;


public class OneTwoThree extends Application
{
	    @Override
	    public void start(Stage stage) 
	    {
	        stage.setTitle("OneTwoThree"); //setting the title of the Stage to OneTwoThree

	        Text oneText = new Text(25, 45, "One"); 
	        //The first text to be displayed (one) along with the horizontal and vertical positioning of the text
	        oneText.setFont(Font.font("Comic Sans MS",20));
	        //setting the font of the text to Comic Sans and the font size to 20

	        Text twoText = new Text(410, 300, "Two");
	        //The second text to be displayed (two) along with the horizontal and vertical positioning of the text
	        twoText.setFont(Font.font("Comic Sans MS",20));

	        Text threeText = new Text(815, 575, "Three");
	        //The third text to be displayed (three) along with the horizontal and vertical positioning of the text
	        threeText.setFont(Font.font("Comic Sans MS",20));

	        Pane one= new Pane(); //making a new pane for the first colour (red)
	        one.setPrefSize(900,600); //setting the size of the first pane
	        one.setStyle("-fx-background-color: #f42a02;"); //setting colour of the first pane

	        Pane two = new Pane(); //making a second pane for the second colour (yellow)
	        two.setPrefSize(900,400); //setting the size of the pane
	        two.setStyle("-fx-background-color: #e9ed02;"); //setting the colour of the pane

	        Pane three = new Pane(); //making a third pane for the third and final colour (green)
	        three.setPrefSize(900,200); //setting the size of the pane
	        three.setStyle("-fx-background-color: #56b22e;"); //setting the colour of the pane

	        Group root = new Group();
	        root.getChildren().addAll(one,two,three,oneText,twoText,threeText); 
	        //grouping all the texts and panes together

	        Scene scene = new Scene(root, 900, 600);
	        
	        stage.setScene(scene);
	        
	        stage.show();
	    }

	    public static void main(String[] args)
	    {
	        launch(args);
	    }
}

