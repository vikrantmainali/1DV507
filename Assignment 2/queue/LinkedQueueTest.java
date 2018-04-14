package vm222cv_assign2.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public final class LinkedQueueTest 
{	
	//making a new LinkedQueue
	Queue test = new LinkedQueue();

	//test method to check different scenarios of sizes of LinkedQueue when its empty, enqueued and dequeued
	@Test
	public void size() throws Exception
	{
		assertEquals(0,test.size());
		test.enqueue(1);
		assertEquals(1,test.size());
		test.enqueue("A");
		assertEquals(2,test.size());
		test.enqueue(2);
		assertEquals(3,test.size());
		test.enqueue("B");
		assertEquals(4,test.size());
		
		test.dequeue();
		assertEquals(3,test.size());
		test.dequeue();
		assertEquals(2,test.size());
		test.dequeue();
		assertEquals(1,test.size());
		test.dequeue();
		assertEquals(0,test.size());
	}
	
	//test method to see if LinkedQueue is empty before adding anything and after enqueuing and dequeuing an element
    @Test
    public void isEmpty() throws Exception 
    {
        assertTrue(test.isEmpty());
        test.enqueue("A");
        assertFalse(test.isEmpty());
        test.dequeue();
        assertTrue(test.isEmpty());
    }
    
    //test method to see if the enqueue() method is adding elements to the end of the queue
    @Test
    public void enqueue() throws Exception
    {
    	test.enqueue("A");
    	assertEquals("A",test.last());
    	test.enqueue("B");
    	assertEquals("B",test.last());
    	test.enqueue("C");
    	assertEquals("C",test.last());
    }
    	
    //test method to see if the dequeue() method is decreasing the size for each dequeue() or not
    @Test
    public void dequeue() throws Exception
    {
    	test.enqueue("X");
    	test.enqueue("Y");
    	test.enqueue("Z");
    	
    	test.dequeue();
    	assertEquals(2,test.size());
    	
    	test.dequeue();
    	assertEquals(1,test.size());
    	
    	test.dequeue();
    	assertEquals(0,test.size());
    }
    
    //test method to check if the first() method does indeed give the first element in the LinkedQueue
    @Test
    public void first() throws Exception
    {
    	test.enqueue("A");
    	test.enqueue("B");
    	test.enqueue("C");
    	assertEquals("A",test.first());
    }
    
    //test method to check if last() method does indeed give the last element in the LinkedQueue
    @Test
    public void last() throws Exception
    {
    	test.enqueue(1);
    	test.enqueue(2);
    	test.enqueue(3);
    	assertEquals(3,test.last());
    }
		
}
