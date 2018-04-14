package vm222cv_assign4.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public final class LinkedQueueTest 
{	
	//making a new LinkedQueue
	LinkedQueue<Integer> test = new LinkedQueue<Integer>();
	LinkedQueue<String> testa = new LinkedQueue<String>();

	//test method to check different scenarios of sizes of LinkedQueue when its empty, enqueued and dequeued
	@Test
	public void size() throws Exception
	{
		assertEquals(0,test.size());
		test.enqueue(1);
		assertEquals(1,test.size());
		test.enqueue(2);
		assertEquals(2,test.size());
		test.enqueue(3);
		assertEquals(3,test.size());
		test.enqueue(4);
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
        assertTrue(testa.isEmpty());
        testa.enqueue("A");
        assertFalse(testa.isEmpty());
        testa.dequeue();
        assertTrue(testa.isEmpty());
        
        assertTrue(test.isEmpty());
        test.enqueue(1);
        assertFalse(test.isEmpty());
        test.dequeue();
        assertTrue(test.isEmpty());
    }
    
    //test method to see if the enqueue() method is adding elements to the end of the queue
    @Test
    public void enqueue() throws Exception
    {
    	testa.enqueue("A");
    	assertEquals("A",testa.last());
    	testa.enqueue("B");
    	assertEquals("B",testa.last());
    	testa.enqueue("C");
    	assertEquals("C",testa.last());
    	
    	test.enqueue(1);
    	assertEquals(1,(int) test.last());
    	test.enqueue(10);
    	assertEquals(10,(int) test.last());
    	test.enqueue(100);
    	assertEquals(100,(int) test.last());
    }
    	
    //test method to see if the dequeue() method is decreasing the size for each dequeue() or not
    @Test
    public void dequeue() throws Exception
    {
    	testa.enqueue("X");
    	testa.enqueue("Y");
    	testa.enqueue("Z");
    	
    	testa.dequeue();
    	assertEquals(2,testa.size());
    	
    	testa.dequeue();
    	assertEquals(1,testa.size());
    	
    	testa.dequeue();
    	assertEquals(0,testa.size());
    	
    	
    	test.enqueue(12);
    	test.enqueue(45);
    	test.enqueue(60);
    	assertEquals(3, test.size());
    	
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
    	testa.enqueue("A");
    	testa.enqueue("B");
    	testa.enqueue("C");
    	assertEquals("A",testa.first());
    	
    	test.enqueue(1);
    	test.enqueue(5);
    	test.enqueue(10);
    	assertEquals(1,(int) test.first());
    }
    
    //test method to check if last() method does indeed give the last element in the LinkedQueue
    @Test
    public void last() throws Exception
    {
    	test.enqueue(1);
    	test.enqueue(2);
    	test.enqueue(3);
    	assertEquals(3,(int) test.last());
    	
    	testa.enqueue("A");
    	testa.enqueue("B");
    	testa.enqueue("C");
    	assertEquals("C", testa.last());
    }		
}
