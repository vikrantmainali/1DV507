package vm222cv_assign3.count_words;
	
import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashWordSet implements WordSet //a HashWordSet class created using Hashing (created with help from lecture slides)
{

	private int size; //a size variable that allows us to keep track of the size of the hashwordset
	private Node[] buckets = new Node[8]; //a bucket varialbe where we can store words
	
	private class Node //an inner class node
	{
		Word word;
		Node next = null;
		
		public Node(Word word) //Constructor with parameter word for node class
		{
			this.word = word;
		}
		
		public String toString() //printing the node
		{
			return word.toString();
		}
	}	
	
	@Override
	public void add(Word word) //method gotten from lecture slide
	{
		int pos = getBucketNumber(word);
		Node bucketNode = buckets[pos];

		while (bucketNode!= null)	
		{
			if (bucketNode.word.equals(word))
			{
				return;
			}
			else 
				bucketNode = bucketNode.next;
		}
		
		bucketNode = new Node(word);
		bucketNode.next = buckets[pos];
		buckets[pos] = bucketNode;
		size++;
		
		if (size == buckets.length)
		{
			rehash();
		}
	}

	
	@Override
	public boolean contains(Word word) //method gotten from lecture slide
	{
		int pos = getBucketNumber(word);
		Node node = buckets[pos];
		
		while (node != null)
		{ 
			if (node.word.equals(word))
			{
				return true; 
			}
			else
				node = node.next;
		}
		return false ; 
	}

	
	@Override
	public int size() //return size since we will be incrementing it each time we add
	{
		return size;
	}
	
	
	@Override
	public String toString() //using the iterator to print all the elements in the hashwordset instead of memory allocations
	{
		String text = "[";
		Iterator<Word> it = new WordIterator();
		
		while (it.hasNext())
		{
			text += it.next() + (it.hasNext() ? ", " : "");
		}
		text += "]";
		
		return text;
	}
	
	
	private int getBucketNumber(Word w) //method gotten from lecture slide
	{
		int hc = w.hashCode(); 
		
		if (hc < 0) 
		{
			hc = -hc; 
		}
		return hc % buckets.length; 
	} 
	
	
	private void rehash() //increasing the size of the array
	{
		Node[] temp = buckets;
		
		buckets = new Node[2 * temp.length]; 
		size = 0;
		for (Node n : temp)
		{ 
			if (n == null) continue; 
			
				while (n != null )
				{
					add(n.word); 
					n = n.next;
				}
		}
	}
	
	
	@Override
	public Iterator<Word> iterator() 
	{
		return new WordIterator();
	}

	class WordIterator implements Iterator<Word> 
	{
		private int count;
		private Node temp; 
		
		public WordIterator()
		{
			count = 0;
			temp = null;
		}
		
		@Override
		public boolean hasNext() 
		{  			
			if (temp != null && temp.next != null) //if the temp node is not null and the next one is not null either
			{
				return true; //then it does indeed have next element
			}
			
			for (int i = count; i < buckets.length; i++)
			{
				if (buckets[i] != null) //checking if the element in array is null or not
				{
					return true; //then it does have next element
				}
			}
				return false;
		}
			
		
		@Override
		 public Word next() 
		{	
			if (!hasNext()) //if it does not have next then move the temp node to the next one
			{
				temp = temp.next;
			} 
			if (count == buckets.length) //throw an exception since this cannot be allowed
			{
				throw new NoSuchElementException();
			}
			else 
			{
				do 
				{
					temp = buckets[count++]; //otherwise the temp node becomes the elements of the bucket
				} 
				while (temp == null); //while the temp node is null
			}
			return temp.word; //return the word

		}
	}
}