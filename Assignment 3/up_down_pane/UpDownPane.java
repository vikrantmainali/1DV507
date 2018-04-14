package vm222cv_assign3.up_down_pane;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class UpDownPane extends GridPane
{
	private int  size = 7; //since it should be a 7x7 field
	private int currentX = size/2; 
	private int currentY = size/2;
	
	private Image image = new Image("http://futureflowmedia.com/wp-content/uploads/2010/10/twitter-logo-transparent-small-150x150.png");
	//getting the image to use from a website
	private ImageView img = new ImageView(image);
	//using imageview so that we can see the image that we have added
	private Group group = new Group(img);
	//group allows us to addchildren to the imageviewer and therefore the imagev
	

	public UpDownPane() 
	{
		upDownPane();
	}
	
	public GridPane upDownPane()
	{	
		img.setFitHeight(95); //setting height and width of the image to fit inside each grid
		img.setFitWidth(95);
  
		for( int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if (currentX == i && currentY == j) //if the currentX and currentY are the same as i and j variables
				{
					this.add(group, i, j); //add the grouping at i and j
				}
				else //this gives us the rectangles
				{
					Rectangle rect = new Rectangle(100,100); //rectangles give us the lines between grids
					rect.setFill(null);
					rect.setStroke(Color.BLACK);
					this.add(rect, i, j);
				}
			}
		}
		return this;
	}
	
	  public void moveOnKey(KeyEvent event) //setting up events for each key press
	  {
	        if (event.getCode().equals(KeyCode.RIGHT))
	        {
	            currentX+=1;
	            currentX = checkCurrent(currentX);
	        }
	        else if (event.getCode().equals(KeyCode.LEFT))
	        {
	            currentX -= 1;
	            currentX = checkCurrent(currentX);
	        }
	    
	        else if (event.getCode().equals(KeyCode.UP))
	        {
	            currentY -= 1;
	            currentY = checkCurrent(currentY);
	        }
	        else if (event.getCode().equals(KeyCode.DOWN))
	        {
	            currentY += 1;
	            currentY = checkCurrent(currentY);
	        }

	        this.getChildren().removeAll(this.getChildren());
	        upDownPane();

	    }

	    public int checkCurrent(int currentPosition) 
	    //checking position of each so that we can make the image return from top if we take it to bottom
	    {
	        if (currentPosition < 0)
	        {
	            return size-1;
	        }
	        else if (currentPosition == size)
	        {
	            return 0;
	        }
	        return currentPosition;
	    }
}