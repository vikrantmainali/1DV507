package vm222cv_assign2.circulararray;

import java.util.Iterator;

import vm222cv_assign2.queue.Queue;

public class ArrayQueue implements Queue
{
	private Object[] arr;
	private int size;
	private int front;
	private int rear;

	public ArrayQueue()
	{
		arr = new Object[10]; //creating an object array with 10 spaces
		size = 0; //initial size is 0 since it is a counter
		front = -1; //this is also because it will be incremented 
		rear = -1; //also set to -1 since it will be incremented
	}
	
	@Override
	public int size() //method to check the size of the ArrayQueue
	{
		return size; //returning the counter value after enqueue/dequeue operations have been performed
	}

	@Override
	public boolean isEmpty() //method to check if ArrayQueue is empty
	{
		if (front == -1 && rear == -1) //the ArrayQueue is empty when both the front and rear are at initial position
		{
			return true;
		}
		else
			return false;
	}

	@Override
	public void enqueue(Object element) //method for enqueuing an object
	{
		  if((rear + 1) % arr.length == front) 
			  //if the next position after rear (front), resize since there is no empty space in the array
		  {
	            resize();
	      }
		  
		  else if (isEmpty()) //if ArrayQueue is empty then set the front and rear as 0 
		  {
			  front = rear = 0;
		  }
		  else
		  {
			rear = (rear + 1) % arr.length; //rear is incremented by 1,2,3, etc
		  }
		arr[rear] = element;
		size++; //size increases while dequeuing
	}

	@Override
	public Object dequeue() //method to return and remove the first element of the ArrayQueue
	{
		Object temp = arr[front]; //creating a temporary object to store the value of the first element
		
		if (front == rear) //if there's only one element in the queue
		{
			front = rear = -1;
		}
		else
		
        front = (front + 1) % arr.length; 
		//increment front by 1,2,3 , etc so we move front and remove the element where front previously was
		
        size--; //size decreases while dequeuing 
        	
        return temp;
	}

	@Override
	public Object first() //method to get the first element of the ArrayQueue
	{
		return arr[front];
	}

	@Override
	public Object last() //method to get the last element of the ArrayQueue
	{
		return arr[rear];
	}

	@Override
	public Iterator<Object> iterator() //element iterator for the ArrayQueue (used in toString())
	{
		return new ArrayQueueIterator();
	}
	
	private void resize() //resizing the array whenever there is no empty space left in the array
	{
        Object[] temp = new Object[arr.length*2];
        
        for (int i = 0; i <= arr.length-1; i++) 
        {
            temp[i] = arr[ (i + front) % arr.length];
        }
       
        front = 0;
        rear = arr.length;
        arr = temp;
    }	
	
	public String toString() //method allowing us to print contents of the ArrayQueue using iterator
	{
		String text = "Elements in the ArrayQueue: [";
		
		Iterator<Object> it = iterator();
		while (it.hasNext())
		{
			text += it.next() + (it.hasNext() ? ", " : "");
		}
		text += "]";
		
		return text;
	}
	
	
    private class ArrayQueueIterator implements Iterator<Object>
    {
        int it = front;
        
        private Object temp = arr[it];

        @Override
        public boolean hasNext() 
        {
            if (temp != null)
                return true;
            else
                return false;
        }

        @Override
        public Object next() 
        {
            Object element = temp;
            
            temp = arr[it];
            it = it + 1 % size();
            return element;
        }
    }
}
