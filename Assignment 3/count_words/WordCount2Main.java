package vm222cv_assign3.count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class WordCount2Main 
{
	public static void main (String[] args) throws FileNotFoundException
	{
		File file = new File("C:/Users/vikra/Desktop/java_courses/1DV507/src/vm222cv_assign3/count_words/words.txt");
		//accessing file we created in Exercise 3
		
		WordSet hashSet = new HashWordSet(); //making a hashwordset object
		WordSet treeSet = new TreeWordSet(); //making a treeset object
		Scanner scan = new Scanner(file); //scanner is called to help scan through the file
		Word w = new Word(); //a word object with empty parameters
		
		while(scan.hasNext()) //while scanner finds inputs
		{
			String str = scan.next(); //String str is equal to those inputs
			
			w = new Word(str); //making the previously initialized word object as that string
			
			hashSet.add(w); //add the words to the hashset
			treeSet.add(w); //add the words to the treeset
		}
		
		
		System.out.println("Size of HashSet: " + hashSet.size()); //print size of hashset
		
		System.out.println("Size of TreeSet: " + treeSet.size()); //print size of treeset
				 
		System.out.println("\nList of words in hashSet:"); //using iterator to iterate through the words in the hashset
		
		Iterator<Word> it = hashSet.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}		
		
		System.out.println("\nElements in hashSet: " + hashSet); //printing the whole hashset 
		
		System.out.println("\nList of words in treeSet (alphabetical order): ");
		//using iterator to iterate through the words in the treeset (this should print alphabetically)

		Iterator<Word> in = treeSet.iterator();
		
		while (in.hasNext())
		{
			System.out.println(in.next());
		}
		
		System.out.println("\nElements in treeSet: " + treeSet); //printing the whole treeset
		
		scan.close();
	}
}
	