package vm222cv_assign3.count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IdentyfyWordsMain 
{
	public static void main (String[] args) throws IOException, FileNotFoundException
	{
		File file = new File("C:/Users/vikra/Desktop/java_courses/1DV507/src/vm222cv_assign3/count_words/HistoryOfProgramming.txt");
		//reading from the file at this location (original history of programming file)
		
		Scanner scan = new Scanner(file);
		//scanner used to scan through the file
		
		scan.useDelimiter("[^A-Za-z\\s]+");
		//useDelimiter allows us to use regex patterns in order to remove numbers, letters, whitespace, etc from strings
		
		FileWriter fw = new FileWriter("C:/Users/vikra/Desktop/java_courses/1DV507/src/vm222cv_assign3/count_words/words.txt");
		//using file writer to write a new file containing only words and whitespace
		
		while(scan.hasNext()) //while the scanner finds inputs in the text
		{
			String toFile = (scan.next()); //String x is equal to the next input
			fw.write(toFile); //use FileWriter to write the string as input in the file
		}
		fw.close();
		scan.close();
	}

}
