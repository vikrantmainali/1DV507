package vm222cv_assign1;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class WarAndPeace 
{
	public static void main (String[] args) throws IOException
	{
	String text = readText("C:/Users/vikra/Desktop/java_courses/1DV507/src/vm222cv_assign1/WarAndPeace.txt");   // My own method
	List<String>words = Arrays.asList(text.split(" "));  // Simple split, will be cleaned up later on
	System.out.println("Initial word count: "+words.size());   // We found 577091
			
	long stream = words.stream().map(String::toLowerCase).filter(s -> s.matches("^[^\\d\\s\\W[-—']]*")).distinct().count();
	
	//using regex statement in matches so it does not include digits at beginning, whitespaces or the characters - emdash and '
	
	System.out.println("Unique word count: " + stream);
	}

	private static String readText(String string) throws IOException 
	{
		return new String(Files.readAllBytes(Paths.get(string)));
	}
}

//sorry in advance for a messy assignment