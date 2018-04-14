package vm222cv_assign3.histogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Histogram extends Application
{
	//Strings created for names of each part of the bar chart
	final static String oneToTen = "1 - 10";
	final static String elevenToTwenty = "11 - 20";
	final static String twentyOneToThirty = "21 - 30";
	final static String thirtyOneToFourty = "31 - 40";
	final static String fourtyOneToFifty = "41 - 50";
	final static String fiftyOneToSixty = "51 - 60";
	final static String sixtyOneToSeventy = "61 - 70";
	final static String seventyOneToEighty = "71 - 80";
	final static String eightyOneToNinety = "81 - 90";
	final static String ninetyOneToHundred = "91 - 100";
	private int[] res = new int[10]; //int array to store the numbers
	
	@Override 
	public void start(Stage stage)
	{
		stage.setTitle("Bar Chart for Occurrence of Numbers");
		
		final CategoryAxis xAxis = new CategoryAxis(); //category axis, aka the x axis
	    xAxis.setLabel("Numbers");       
	    final NumberAxis yAxis = new NumberAxis(); //number axis, aka the y axis
	    yAxis.setLabel("Occurence");
	    final BorderPane bp = new BorderPane();
	    FileChooser fc = new FileChooser(); //File chooser to load files from 
	    Button open = new Button("Open");
	    open.relocate(50, 400);
	    Button close = new Button("Close");
	    close.relocate(400, 400);
	    Group group = new Group();
	    final BarChart<String,Number> bc = 
	    new BarChart<String,Number>(xAxis,yAxis);
	    bc.setTitle("Bar Chart");

	    open.setOnAction((ActionEvent e) -> { //setting the action for open button
	    	
	    	File file = fc.showOpenDialog(stage); //file chooser pops up on stage
	    	
	    	try
	    	{
	    		Scanner scan = new Scanner(file); //to scan file and store the integers in the array
	    		
	    		while(scan.hasNextInt())
	    		{
	    			int temporary = scan.nextInt();
	    			int quot = temporary / 10;
	    			
	    			if (temporary % 10 == 0)
	    			{
	    				temporary = res[quot-1]++;
	    			}
	    			else
	    			{
	    				temporary = res[quot]++;
	    			}
	    		}
	    		scan.close();
	    	}
	    	
	    	catch (FileNotFoundException fne)
	    	{
	    		fne.getStackTrace();
	    	}
	    	
	        XYChart.Series<String, Number> series = new XYChart.Series<String, Number>(); 
	        //XYChart to add the datas
		    series.getData().add(new XYChart.Data<String, Number>(oneToTen, res[0]));
		    series.getData().add(new XYChart.Data<String, Number>(elevenToTwenty, res[1]));
		    series.getData().add(new XYChart.Data<String, Number>(twentyOneToThirty, res[2]));
		    series.getData().add(new XYChart.Data<String, Number>(thirtyOneToFourty, res[3]));
		    series.getData().add(new XYChart.Data<String, Number>(fourtyOneToFifty, res[4]));      
		    series.getData().add(new XYChart.Data<String, Number>(fiftyOneToSixty, res[5]));      
		    series.getData().add(new XYChart.Data<String, Number>(sixtyOneToSeventy, res[6]));      
		    series.getData().add(new XYChart.Data<String, Number>(seventyOneToEighty, res[7]));      
		    series.getData().add(new XYChart.Data<String, Number>(eightyOneToNinety, res[8]));      
		    series.getData().add(new XYChart.Data<String, Number>(ninetyOneToHundred, res[9]));   
		    
		    bc.getData().add(series); //adding series to bar chart
		    group.getChildren().add(bc); //adding it to group
		    
		    open.setDisable(true); //not allowed to open another program
	    });
	  	
	    close.setOnAction((ActionEvent e) -> {
	    	
	    	stage.close(); //close program on pressing close
	    });
	    
	    group.getChildren().addAll(bp, open, close);
	    
	    Scene scene  = new Scene(group,500,500);
	    stage.setScene(scene);
	    stage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}