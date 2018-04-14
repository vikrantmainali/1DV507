package vm222cv_assign4.priority_queues;

public class BinaryIntHeap
{
	private int heap[];
	private int size;
	private static final int heapSize = 8;
	
	public BinaryIntHeap()
	{
		heap = new int[heapSize + 1];
		size = 0;
	}	
	
	public void insert(int n)
	{
		if (size == heap.length - 1)
		{
			resize();
		}
		
		if (size == 0)
		{
			heap[1] = n;
			size++;
		}
		
		else
		{
	      heap[size+1] = n;
	      size++;
	      
	      int pos = size;
	      
	      while(pos > 1)
	      {
	        if (heap[pos/2] < heap[pos])
	        {
	        	int temp = heap[pos/2];
	            heap[pos/2] = heap[pos];
	            heap[pos] = temp; 
	        }
	        	pos = pos/2;
	      	}
	        }
	}
	 
	public int pullHighest() 
	{
		int highest = heap[1];
        heap[1] = heap[size];
        heap[size] = 0;
        size--;
        int pos = 1;
        
        while (pos < size)
        {	 
            if(heap[pos*2] > heap[pos*2+1] && heap[pos] < heap[pos*2] )
            {
                    int temp = heap[pos];
                    heap[pos] = heap[pos*2];
                    heap[pos*2] = temp;
                    pos = pos*2;
             }

            else if(heap[pos*2] < heap[pos*2+1] && heap[pos] < heap[pos*2+1])
            {   
                    int temp = heap[pos];
                    heap[pos] = heap[pos*2+1];
                    heap[pos*2+1] = temp;
                    pos = pos*2+1;
            }
    
            else
            {
                pos = pos*2;
            }
        }
        return highest;
	}
	
	
	public int size()
	{
		return size;
	}
	
	
	public boolean isEmpty() 
	{
		if (size == 0)
		{
			return true;
		}
		else
			return false;
	}
	
	
	private void resize() 
	{
        int newSize = heap.length*2 - 1;

        int[] temp = new int[newSize];
        
        System.arraycopy(heap,1,temp,1,heap.length-1);
        
        heap = temp;
	}
}
