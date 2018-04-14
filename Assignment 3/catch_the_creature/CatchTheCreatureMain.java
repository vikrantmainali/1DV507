package vm222cv_assign3.catch_the_creature;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CatchTheCreatureMain extends Application
{
	Random rand = new Random();
	private Text text = new Text();
	private int size = 7, caughtCreatures = 0;
	private boolean click = false;
	private boolean gameStatus = false;

	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Creature creature = new Creature();		
		GridPane gp = new GridPane();
		gp.setGridLinesVisible(true);
		gp.add(creature.getCreature(),3,3);
		
		Group g = new Group();
		
		HBox h = new HBox(); 
		//making a hbox to add the text in the middle saying "Creatures caught" whenever a creature is clicked on
		h.setPrefSize(150, 150);
		h.relocate(240, 820);
		text.setText("Creatures caught: " + caughtCreatures);
		text.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		h.getChildren().add(text);
				
		for(int i = 0; i < size; i++) //row constraints / column constraints allow us to view the gridlines
		{
			RowConstraints row = new RowConstraints(100);
			ColumnConstraints column = new ColumnConstraints(100);
			gp.getRowConstraints().add(row);
			gp.getColumnConstraints().add(column);	
		}	
		
		Button startGame = new Button("Start game"); //button to start game
		startGame.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		startGame.setLayoutX(35);
		startGame.setLayoutY(800);
		startGame.setPadding(new Insets(25));
		startGame.setOnAction((ActionEvent event) -> {
	
		if(!gameStatus)
		{
			gameStatus = true;
			
			Thread thread = new Thread(new Runnable() 
			{
			@Override
			public void run()
			{
				try
				{
					while(gameStatus == true)
					{
						GridPane.setColumnIndex(creature.getCreature(), rand.nextInt(5)); //creatures random movements
						GridPane.setRowIndex(creature.getCreature(), rand.nextInt(5));
						click = true;
						Thread.sleep(600); //speed of how fast the create moves
					}
				}
				catch (InterruptedException ie)
				{
					ie.getStackTrace();
				}
			}
		});
			thread.start();
		}
		});
		
		Button endGame = new Button("End game"); //button to close window upon press
		endGame.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		endGame.setLayoutX(550);
		endGame.setLayoutY(800);
		endGame.setPadding(new Insets(25));
		endGame.setOnAction((ActionEvent event) -> {
			
			gameStatus = false;
			primaryStage.close();
		});
		
		
		creature.getCreature().setOnMouseClicked((MouseEvent event) ->
		//whenever creature is clicked, the counter goes up and we cannot click the same creature more than once
		{
			if(click == true)
			{
				caughtCreatures++;
				text.setText("Creatures caught: " + caughtCreatures);
				click = false;
			}
		});
		
		g.getChildren().addAll(gp, startGame, endGame, h);

		Scene scene = new Scene(g, 7*100, 9*100);
		primaryStage.setTitle("Catch the creature!");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}
