package vm222cv_assign4.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * @author vikra
 * @param <T>
 */
public class LinkedQueue<T> implements Queue<T>
{
	/**
	 * @param size This is a counter that is incremented when Enqueue() is called and decremented when Dequeue() is called.
	 * @param head This is the first part of the LinkedQueue.
	 * @param tail This is the last part of the LinkedQueue.
	 */
	private int size = 0;
	private Node head;
	private Node tail;
	
	/**
	 * Empty constructor to create a LinkedQueue object with parameters size, head and tail.
	 * Size when calling the LinkedQueue should be 0.
	 * Head doesn't have a value when calling the LinkedQueue at first.
	 * Tail doesn't have a value when calling the LinkedQueue at first.
	 */
	public LinkedQueue()
	{
		size = 0; 
		head = null;
		tail = null; 
	}

	/**
	 * Return the size of the LinkedQueue.
	 *@return the size of the LinkedQueue, this size grows after each Enqueue() and decreases after each Dequeue()
	 */
	@Override
	public int size() 
	{
		return size;
	}
	
	/**
	 * Method to check if LinkedQueue is empty or not.
	 * @return true if the head has no value, otherwise return false.
	 */
	@Override
	public boolean isEmpty() 
	{
		if (head == null)
		{
			return true;
		}
		else
			
		return false;
	}

	/**
	 * This method is used to add elements to the end of a LinkedQueue. If head is empty, the first value to be added is the first element
	 * and tail becomes the head, if not then it gets added to the next tail value and tail becomes the next tail. 
	 * Each Enqueue() increases the size counter.
	 * @param element is the object we want  to add to the LinkedQueue
	 */
	@Override
	public void enqueue(T element) 
	{
		
		if (head == null)
		{
			head = new Node();
			
			head.value = element;
			
			tail = head;
		}
		else 
		{
				tail.next = new Node();
				
				tail.next.value = element;
				
				tail = tail.next;
		}
		size++;
		
	}

	  /**
	   * @return the first element in the LinkedQueue and removes it. 
	   * Each Dequeue() decreases the size counter.
	   */
	@Override
	public T dequeue()
	{
		  if (isEmpty()) 
		  { 
			  throw new NoSuchElementException(); 
		  }
		  
		  Node output = head;
		  
		  head = head.next;
		  
		  size--;
		  
		  return output.value;
	}
	

	/**
	 * @return the first element in the LinkedQueue.
	 */
	@Override
	public T first() 
	{
		return head.value;
	}

	
	/**
	 * @return the last element in the LinkedQueue
	 */
	@Override
	public T last() 
	{
		return tail.value;
	}
	
	/**
	 * @return a new object iterator that has been created by implementing Iterator.
	 * 
	 * @see ObjectIterator
	 */
	@Override
	public Iterator<T> iterator()
	{
		return new ObjectIterator<T>();
	}
	
	
	/**
	 * @return a string object representing the elements in the LinkedQueue.
	 */
	@Override
	public String toString()
	{
			String text = "Elements in the LinkedQueue: [";
			
			Iterator<T> it = iterator();
			while (it.hasNext())
			{
				text += it.next() + (it.hasNext() ? ", " : "");
			}
			text += "]";
			
			return text;
	}
	
	/**
	 * 
	 * @author vikra
	 *
	 */
	private class ObjectIterator<M> implements Iterator<T> 
	{
		/**
		 *@param temp A temporary node created to store the head. 
		 */
		private Node temp = head; 
		
		/**
		 * Method to check if there are elements in the Linked Queue or not.
		 */
		@Override
		public boolean hasNext() 
		{  			
			if (temp == null)
			{
				return false;
			}
			else
				return true;
		}
			
		/**
		 * Method to get the next element in the LinkedQueue. A temporary object is created to store the value 
		 * of the node.
		 * @throws NoSuchElementException If there is no next element to get.
		 * @return The next element in the LinkedQueue.
		 */
		@Override
		 public T next() 
		{
            if (!hasNext()) 
            { 
            	throw new NoSuchElementException();
            }
        
            T element = temp.value;
            temp = temp.next;
            
            return element;
        }
	}
	
	/**
	 * 
	 * @author vikra
	 *
	 */
    private class Node
    {
    	/**
    	 * @param value allows us to set and get value of head and tail nodes.
    	 */
        T value;
        
        /**
         * @param next allows us to set and get the next values of the head and tail nodes. 
         */
        Node next; 
    }
}
