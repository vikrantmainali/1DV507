package vm222cv_assign2;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorDisplay extends Application
{
	
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		stage.setTitle("Colour Display"); //setting the title of the stage
		  
		GridPane titleGrid = new GridPane(); //making a title grid so we can give it a title
		Text title = new Text("Colour Display");
		GridPane.setHalignment(titleGrid, HPos.CENTER);   //positioning the title in the middle
		title.setFont(Font.font("Arial Black", FontWeight.BOLD, 22)); //setting the font name, type and size
	    titleGrid.setPadding(new Insets(0, 0, 0, 218)); //setting padding for the title GridPane
		titleGrid.add(title, 0, 0); //adding title at column index and row index 0
		
		GridPane display = new GridPane(); //making a display grid where the colour is displayed
		GridPane.setHalignment(display, HPos.CENTER); //centring the display
		Rectangle rect = new Rectangle(200, 10, 570, 120); 
		//display will be shown as a rectangle on the screen with the given horizontal position, vertical position, width and height
        display.add(rect, 0, 0);
		
		GridPane colourNames = new GridPane(); //making a grid with the colour name fields and the button
		GridPane.setHalignment(colourNames, HPos.CENTER);   
		display.setPadding(new Insets(30,15,15,15));
		colourNames.setHgap(10); //setting the gap between the columns and rows
		colourNames.setVgap(10);
		
		final TextField redField = new TextField();	//text field where the value of the red will be written
		colourNames.add(new Label("Red:"), 1, 16); //labling and positioning the Red: label
		redField.setAlignment(Pos.CENTER);
		colourNames.add(redField, 1, 17); //adding the field to the GridPane
		
		final TextField greenField = new TextField();
		colourNames.add(new Label("Green:"), 2, 16);
		greenField.setAlignment(Pos.CENTER);
		colourNames.add(greenField, 2, 17);
		
		final TextField blueField = new TextField();
		colourNames.add(new Label("Blue:"), 3, 16);
		blueField.setAlignment(Pos.CENTER);
		colourNames.add(blueField, 3, 17);
		
		
		Button button = new Button("Display color"); //Creating a new button titled "Display color"
		colourNames.add(button, 2, 20); //adding the button at the given points on the grid
		
		button.setOnAction(event -> 
	        { 	
	        	if(Integer.valueOf(redField.getText()) > 255 || Integer.valueOf(redField.getText()) < 0 
	        		|| Integer.valueOf(greenField.getText()) > 255 || Integer.valueOf(greenField.getText()) < 0
	        		|| Integer.valueOf(blueField.getText()) > 255 || Integer.valueOf(blueField.getText()) < 0)
	        		//if statement matching the condition mentioned in the comment below
	        	{
	        		System.out.println("One or more of the RGB value you have given is not between 0 and 255!");
	        		//error to be printed if RGB value is greater than 255 or less than 0.
	        	}
	        	else
	        	{
	        		rect.setFill(Color.rgb(Integer.valueOf(redField.getText()), 
	        					Integer.valueOf(greenField.getText()), 
	        					Integer.valueOf(blueField.getText())));
	        		//filling the rectangle so it displays the RBG colours specified by the user of the program
	        	}
	        }
	        );

		GridPane.setHalignment(button, HPos.CENTER); //centring the position of the button 
        
		Group root = new Group();
		root.getChildren().addAll(titleGrid, display, colourNames); 
		//grouping all the components together so it can be put in the scene
		
		Scene scene = new Scene(root, 600, 300);
		stage.setScene(scene);
		stage.show();
		
	}
}
