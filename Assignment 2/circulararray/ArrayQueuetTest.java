package vm222cv_assign2.circulararray;

import org.junit.Test;

import vm222cv_assign2.queue.Queue;
import static org.junit.Assert.*;

public final class ArrayQueuetTest
{
	/*VG exercise 4 required us to do least modification to the LinkedQueueTest code, the test coding in both are the same,
	 * except that i have changed Queue test = new LinkedQueue(); to Queue test = new ArrayQueue(); (which is my minor modification)
	 * this way i also check if	the interface is functional */
	
	Queue test = new ArrayQueue();
	
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
	
    @Test
    public void isEmpty() throws Exception 
    {
        assertTrue(test.isEmpty());
        test.enqueue("A");
        assertFalse(test.isEmpty());
        test.dequeue();
        assertTrue(test.isEmpty());
    }
    
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
    
    
    @Test
    public void first() throws Exception
    {
    	test.enqueue("A");
    	test.enqueue("B");
    	test.enqueue("C");
    	assertEquals("A",test.first());
    }
    
    @Test
    public void last() throws Exception
    {
    	test.enqueue(1);
    	test.enqueue(2);
    	test.enqueue(3);
    	assertEquals(3,test.last());
    }
		
}
