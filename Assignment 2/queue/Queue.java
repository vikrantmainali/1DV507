package vm222cv_assign2.queue;

import java.util.Iterator;

public interface Queue
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
   public void enqueue(Object element);   
   
   /**
    * Return and remove first element.
    * @return The first element and removes it. 
    */
   public Object dequeue();             
   
   /**
    * Return (without removing) first element.
    * @return Without removing, the first element.
    */
   public Object first();                
   
   /**
    * Return (without removing) last element.
    *@return Without removing, the last element.
    */
   public Object last();                  
   
   /**
    * Return a string representation of the queue content.
    * @return A string representation of the queue content.
    */
   public String toString();             
   
   /**
    * An iterator for the elements in the LinkedQueue.
    * @return ObjectIterator();
    */
   public Iterator<Object> iterator();
}