package vm222cv_assign3.count_words;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class WordCount1Main 
{
	public static void main (String[] args) throws FileNotFoundException
	{
		File file = new File("C:/Users/vikra/Desktop/java_courses/1DV507/src/vm222cv_assign3/count_words/words.txt");
		//accessing the file we created in exercise 3
		
		HashSet<Word> hash = new HashSet<Word>(); //new hashset<word> object
		TreeSet<Word> tree = new TreeSet<Word>(); //new treeset<word> object
		Scanner scan = new Scanner(file); //scanner to scan through the file
		
		while(scan.hasNext()) //while the scanner finds an input in the file
		{
			String str = scan.next(); //string str is equal to the input it finds
			
			Word w = new Word(str); //use Word class constructor with string parameter to make word objects
			
			tree.add(w); //add the words to the treeset
			hash.add(w); //add the words to the hashset
		}
		
		System.out.println("Size of HashSet: " + hash.size());	//print size of hashset
		System.out.println("Size of TreeSet: " + tree.size()); //print size of treeset
		
		scan.close();
		
		System.out.println("\nList of words in alphabetical order: \n");


		Iterator<Word> it = tree.iterator(); 
		//use iterator for the tree set to print out the content of the treeset in alphabetical order
		
		while (it.hasNext()) //while the iterator has next elements
		{
			System.out.println(it.next()); //print out the elements
		}
		
	}
}
	