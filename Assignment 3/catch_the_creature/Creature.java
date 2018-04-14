package vm222cv_assign3.catch_the_creature;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class Creature extends GridPane
{
	private Image img;
	private ImageView imgV;
	private int size = 7;
	private Group g;

	public Creature()
	{
		img = new Image("http://img02.deviantart.net/9a9b/i/2015/223/3/c/cartoon_network_collab___jerry_mouse_by_whatifgirl-d957s5j.png");
		//getting image from website
		imgV = new ImageView(img); //using imageviewer to view the image
		imgV.setFitHeight(100);
		imgV.setFitWidth(100);
		g = new Group(imgV); //grouping the image so we can addchildren to it
		this.setGridLinesVisible(true);
		
		for(int i = 0; i < size; i++)
		{
			RowConstraints row = new RowConstraints(100);
			ColumnConstraints column = new ColumnConstraints(100);
			this.getRowConstraints().add(row);
			this.getColumnConstraints().add(column);	
		}
		this.add(g,3,3);
	}
	
	public ImageView getCreature() //getting the creature method
	{
		return this.imgV;
	}
}
