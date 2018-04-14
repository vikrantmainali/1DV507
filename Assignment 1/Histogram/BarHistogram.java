package vm222cv_assign1.Histogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler.LegendPosition;

public class BarHistogram 
{
	  public static void main(String[] args) throws FileNotFoundException
	  {
  			Random rand = new Random (); //calling random class so that we can create a file with random integers
	
  			File outFile = new File("C:/Users/vikra/Desktop/java_courses/1DV506/src/vm222cv_assign4/output.txt");
  			//This is the output file alone with the directory of where the file should be created
  			PrintWriter printer = new PrintWriter (outFile);
			//using PrintWriter class allows us to 
			
			
			for (int i = 1; i<=200; i++)
			{
				printer.println(rand.nextInt(300)+1);
			}
		      
			printer.close();
			
		    CategoryChart barchart = new CategoryChartBuilder().width(800).height(600).title("Bar Chart Histogram").xAxisTitle("Range").yAxisTitle("Number of occurance").build();

		   		    
			barchart.getStyler().setLegendPosition(LegendPosition.OutsideE);
			barchart.getStyler().setHasAnnotations(true);
							 			
			File file = new File("C:/Users/vikra/Desktop/java_courses/1DV506/src/vm222cv_assign4/output.txt");
			
			System.out.println("Reading file from: " + file + "\n");
			
			Scanner scan = new Scanner(file); //reading the file that we created with the intergers
			
			ArrayList<Integer> integers = new ArrayList<Integer>(); //creating an integer arraylist
			while(scan.hasNext())
			 {
			   integers.add(scan.nextInt()); //storing the integers inside the created arraylist
			 }
			 		 
			 int count = 0; //initializing the variables 
			 int otherCount = 0;
			 int histogramCount, i;
			 int oneto10 = 0, elevento20 = 0, twentyOneto30 = 0, thirtyOneto40 = 0, 
			 fourtyOneto50 = 0, fiftyOneto60 = 0, sixtyOneto70 = 0,
			 seventyOneto80 = 0, eightyOneto90 = 0, nintyOneto100 = 0;
			 
			 for (i = 0; i<= integers.size()-1;i++)
			 {
			 if (integers.get(i)<=100) //if the number is between 1 and 100, the counter goes up
			 {
				 count++;
			 }	
			 else
			 {
				 otherCount++; //if its not between 1 and 100, then other counter increases
			 }
			 }
			 	
			System.out.println("Number of integers in the interval [1,100]: " +count+ "\n");
			System.out.println("Other integers: " +otherCount+ "\n");
			
			for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
			{
			if (integers.get(i)<=10)  
			//if number is between 1 and 10, counter increases and based on counter, asterix is printed out
			{
				histogramCount++;
				oneto10++;
			}
			}
			System.out.print("1  - 10  | ");
			for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
		    {
		        System.out.print("*");
		    }
	        barchart.addSeries("1-10", new int[] {0},new int[] {oneto10});
	    
			System.out.println("");
			
			
			for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
			{
			if (integers.get(i)>=11 && integers.get(i)<=20)
			//if number is between 11 and 20, counter increases and based on counter, asterix is printed out

			{
				histogramCount++;
				elevento20++;
			}
			}
			System.out.print("11 - 20  | ");
			for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
		    {
		        System.out.print("*");
		    }
	
	        barchart.addSeries("11-20", new int[] {1},new int[] {elevento20});

			System.out.println("");
			
			
			for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
			{
			if (integers.get(i)>=21 && integers.get(i)<=30)
			//if number is between 21 and 30, counter increases and based on counter, asterix is printed out

			{
				histogramCount++;
				twentyOneto30++;
			}
			}
			System.out.print("21 - 30  | ");
			for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
			//and so on...
		    {
		        System.out.print("*");
		    }
			
	        barchart.addSeries("21-30", new int[] {2},new int[] {twentyOneto30});
			
			System.out.println("");
			
			
			for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
			{
			if (integers.get(i)>=31 && integers.get(i)<=40)
			{
				histogramCount++;
				thirtyOneto40++;
				
			}
			}
			System.out.print("31 - 40  | ");
			for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
		    {
		        System.out.print("*");
		    }
			
	        barchart.addSeries("31-40", new int[] {3},new int[] {thirtyOneto40});

			System.out.println("");
			
			
			for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
			{
			if (integers.get(i)>=41 && integers.get(i)<=50)
			{
				histogramCount++;
				fourtyOneto50++;
			}
			}
			System.out.print("41 - 50  | ");
			for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
		    {
		        System.out.print("*");
		    }
			
	        barchart.addSeries("41-50", new int[] {4},new int[] {fourtyOneto50});

			System.out.println("");
			
			
			for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
			{
			if (integers.get(i)>=51 && integers.get(i)<=60)
			{
				histogramCount++;
				fiftyOneto60++;
			}
			}
			System.out.print("51 - 60  | ");
			for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
		    {
		        System.out.print("*");
		    }
	        barchart.addSeries("51-60", new int[] {5},new int[] {fiftyOneto60});
						
			System.out.println("");
			
			
			for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
			{
			if (integers.get(i)>=61 && integers.get(i)<=70)
			{
				histogramCount++;
				sixtyOneto70++;
			}
			}
			System.out.print("61 - 70  | ");
			for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
		    {
		        System.out.print("*");
		    }
	        barchart.addSeries("61-70", new int[] {6},new int[] {sixtyOneto70});
						
			System.out.println("");
			
			
			for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
			{
			if (integers.get(i)>=71 && integers.get(i)<=80)
			{
				histogramCount++;
				seventyOneto80++;
			}
			}
			System.out.print("71 - 80  | ");
			for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
		    {
		        System.out.print("*");
		    }
	        barchart.addSeries("71-80", new int[] {7},new int[] {seventyOneto80});
						
			System.out.println("");
			
			
			for (i = 0,histogramCount = 0; i<= integers.size()-1;i++)
			{
			if (integers.get(i)>=81 && integers.get(i)<=90)
			{
				histogramCount++;
				eightyOneto90++;
			}
			}
			System.out.print("81 - 90  | ");
			for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
		    {
		        System.out.print("*");
		    }
	        barchart.addSeries("81-90", new int[] {8},new int[] {eightyOneto90});
			
			System.out.println("");
			
			
			for (i = 0, histogramCount = 0; i<= integers.size()-1;i++)
			{
			if (integers.get(i)>=91 && integers.get(i)<=100)
			{
				histogramCount++;
				nintyOneto100++;
			}
			}
			System.out.print("91 - 100 | ");
	        for (int asterisk = 1; asterisk <= histogramCount; asterisk++) 
	        {
	            System.out.print("*");
	        }
	        barchart.addSeries("91-100", new int[] {9},new int[] {nintyOneto100});
	        
	        scan.close(); 
	        	       
		    new SwingWrapper<CategoryChart>(barchart).displayChart();
	  } 
}
