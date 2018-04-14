package vm222cv_assign1;

import java.io.File;
import java.io.FileNotFoundException;

public class PrintJavaMain 
{

	public static void main (String[] args) throws FileNotFoundException
	{
		File file = new File("C:/Users/vikra/Desktop/java_courses");
		
        System.out.println("All java files in: " + file.toString() + "\n");
		
		printAllJavaFiles(file);
	}
		
	private static void printAllJavaFiles (File file) throws FileNotFoundException
	{
		if (file.isDirectory()) 
		{
			File [] subs = file.listFiles();
	
			for (File f : subs)
			{
				printAllJavaFiles(f);	
			}
		}
		
	else 
	{
        String fileName = file.toString();
        
        if (file.isFile() && fileName.endsWith(".java")) 
        {
            javaFileSeperator(file);
        }
    }
	}
	
	private static void javaFileSeperator(File file) throws FileNotFoundException
	{ 
	StringBuffer buf = new StringBuffer();
	
	String nameOfFile = "-" + file.getName() + ", size of file is: " + file.length() + " bytes";
	
	System.out.println(buf.append(nameOfFile));
	}

}
