package vm222cv_assign4.priority_queues;

import static org.junit.Assert.*;
import org.junit.Test;
import vm222cv_assign4.priority_queues.BinaryIntHeap;

public class BinaryIntHeapTest 
{
	@Test
	public void testInsert()
	{
		BinaryIntHeap a = new BinaryIntHeap();
		
		a.insert(4);	
		assertEquals(4,a.pullHighest());
		
		a.insert(1);
		a.insert(5);
		a.insert(2);
		a.insert(7);
		assertEquals(4,a.size());
		assertEquals(7,a.pullHighest());
	}
	
	
	@Test
	public void testPullHighest()
	{
		BinaryIntHeap a = new BinaryIntHeap();
		
		for (int i = 0; i <= 5; i++) 
		{
			a.insert(i);
		}

		for (int i = 5; i >= 0; i--) 
		{
			assertEquals(i, a.pullHighest());
		}
	}
	
	
	@Test
	public void testSize()
	{
		BinaryIntHeap a = new BinaryIntHeap();
		assertEquals(0,a.size());
		
		for (int i = 0; i < 5; i++)
		{
			a.insert(i);
		}
		assertEquals(5,a.size());
	}
	
	
	@Test
	public void testIsEmpty()
	{
		BinaryIntHeap a = new BinaryIntHeap();
		assertEquals(true,a.isEmpty());
		
		a.insert(4);
		assertEquals(false,a.isEmpty());
		
		a.pullHighest();
		assertEquals(true,a.isEmpty());
	}
}
