package vm222cv_assign3.count_words;

public class Word implements Comparable<Word>
{
	   private String word;
	   
	   public Word() //Empty constructor to create word objects
	   {
	   }
	   
	   public Word(String str) //Constructor with a string parameter 
	   {
		   this.word = str.toLowerCase(); 
		   /*the word field in the class is equal to the parameter in
		   lower case (since we are treating upper case and lower case as equal)*/
	   }
	   
	   public String toString() //printing the word to a string
	   {
		   return word; 
	   }
	   
	   /* Override Object methods */
	   public int hashCode() //computing a hash value for the word
	   { 
		   return this.word.hashCode(); //returns an automatically generated hashCode for the word object 
	   }
	   	
	   public boolean equals(Object other) //checking if two words are equal
	   { 
		  if(other instanceof Word) //since other is an object, we check if other is an instance of Word class
		  {
			  return this.word.hashCode() == other.hashCode(); 
			  //if it is then we compare the hashCode of the two since hashCode defines the meaning of "equality" 
		  }
		  else
			  return false;
	   }
	   
	   /* Implement Comparable */
	   public int compareTo(Word w) //comparing two words lexicographically
	   {
		   return this.word.compareTo(w.word); //compareTo is an inbuilt method that helps us compare two Strings lexicographically
	   }
}

