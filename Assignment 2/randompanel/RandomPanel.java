package vm222cv_assign2.randompanel;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import java.util.Random;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class RandomPanel extends BorderPane
{	
	public RandomPanel()
	{
        Button button = new Button("New Random"); //Creating a new button with the name "New Random"
			
	    HBox left= new HBox(); //HBox where the button is held 
        left.setPadding(new Insets(15, 12, 15, 12));
        left.getChildren().addAll(button);

        HBox right = new HBox(); //HBox where the text is held 
        right.setPadding(new Insets(20, 15, 20, 15));

        final Text text = new Text();
        text.setFont(Font.font("Arial", 20));
        button.setOnAction(event -> text.setText(Integer.toString(getRandom()))); 
        //setting the action of the button to display the random integer generated

        right.getChildren().addAll(text);

        setLeft(left); //BorderPane method to set the left side of the BorderPane
        setRight(right); //BorderPane method set the right side of the BorderPane
	}
	
    public static int getRandom() //method to generate random numbers in the interval 1-100
    {
        Random rand = new Random();
        
        return rand.nextInt(100)+1;
    }

}
