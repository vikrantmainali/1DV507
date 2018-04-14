package vm222cv_assign4.queue;

import java.util.Iterator;

public interface Queue<T>
{  
	/** 
	 * Current queue size.
	 * @return current queue size
	 */
   public int size();                     
  
   /**
    * True if queue is empty. 
    * @return true if queue is empty.
    */
   public boolean isEmpty();              

   /**
    * Add element at end of queue.
    * @param element is the element to be added.
    */
   public void enqueue(T element);   
   
   /**
    * Return and remove first element.
    * @return The first element and removes it. 
    */
   public T dequeue();             
   
   /**
    * Return (without removing) first element.
    * @return Without removing, the first element.
    */
   public T first();                
   
   /**
    * Return (without removing) last element.
    *@return Without removing, the last element.
    */
   public T last();                  
   
   /**
    * Return a string representation of the queue content.
    * @return A string representation of the queue content.
    */
   public String toString();             
   
   /**
    * An iterator for the elements in the LinkedQueue.
    * @return ObjectIterator();
    */
   public Iterator<T> iterator();
}