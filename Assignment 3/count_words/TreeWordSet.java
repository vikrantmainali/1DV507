package vm222cv_assign3.count_words;

import java.util.Iterator;

public class TreeWordSet implements WordSet //class for the treewordset (created with the help of lecture slides)
{

	private BST root = null;
	private int size, count = 0;
	private Word[] arr = new Word[8];

	private class BST //private inner class for it made with the help of the lecture slide
	{
		private Word word;
		private BST left = null;
		private BST right = null;

		public BST(Word word) 
		{
			this.word = word;
		}
		
		public String toString()
		{
			return word.toString();
		}

		private void add(Word word) //recursion method for add inside the bst inner class (made using lecture slides)
		{
			if (word.compareTo(this.word) < 0) 
			{
				if (left == null) 
				{
					left = new BST(word);
					size++;
				} 
				else
				{
					left.add(word);
				}
			} 
			else if (word.compareTo(this.word) > 0) 
			{
				if (right == null) 
				{
					right = new BST(word);
					size++;
				} 
				else
				{
					right.add(word);
				}
			}

		}

		public boolean contains(Word word) //also made using lecture slides
		{
			if (word.compareTo(this.word) < 0)
			{
				if (left == null)
				{
					return false;
				}
				else
				{
					return left.contains(word);
				}
			}

			else if (word.compareTo(this.word) > 0)
			{
				if (right == null)
				{
					return false;
				}
				else
				{
					return right.contains(word);
				}
			}
			return true;
		}
		
		public Word[] toArray() //using principle of print() from lecture slide to send Words to array
		{
			if (left != null)
			{
				left.toArray();
			}
			if (count == arr.length)
			{
				resize();
			}
			arr[count] = word; 
			count++;
			if (right != null)
			{
				right.toArray();
			}
			return arr;
		}
	}

	public TreeWordSet()
	{
		size = 0;

	}

	@Override
	public void add(Word word) //add method for the treewordset class using the bst inner class and made with the help from lecture slide
	{
		if (root == null)
		{
			root = new BST(word);
			size++;
		} 
		else
		{
			root.add(word);
		}

	}

	@Override
	public boolean contains(Word word) //contain method for the treewordset class using the bst inner class and made with the help from lecture slide
	{
		if (size == 0)
		{
			return false;
		}
		else
		{
			return root.contains(word);
		}
	}

	
	@Override
	public int size() //returning size since we are incrementing it every time we use the add method
	{
		return size;
	}


	@Override
	public String toString() //toString method to print all elements in the treewordset using the iterator
	{
		String text = "[";
		Iterator<Word> it = new TreeWordSetIterator();
		
		while (it.hasNext())
		{
			text += it.next() + (it.hasNext() ? ", " : "");
		}
		text += "]";
		
		return text;
	}


	private void resize() //resize when the array is too small to add more elements 
	{
		Word[] temp = new Word[arr.length * 2];
		for (int i = 0; i < arr.length; i++) 
		{
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	@Override
	public Iterator<Word> iterator() //return the treewordsetiterator class
	{
		return new TreeWordSetIterator();
	}


	private class TreeWordSetIterator implements Iterator<Word>
	{
		private int count = 0;

		public TreeWordSetIterator() //send the bst root to array so that we can use it as an array
		{
			root.toArray(); 
		}


		@Override
		public boolean hasNext()  
		{
			if (root == null) //there is no next element if root is null
			{
				return false;
			}
			else if (arr[count] == null) //no next element if the first element is null
			{
				return false;
			}
			else
				return count < arr.length; 
		}


		@Override
		public Word next() //returns the next word in the array arr
		{ 
			return arr[count++];
		}
	}
}