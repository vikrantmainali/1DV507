package vm222cv_assign4.priority_queues;

public class BinaryIntHeapMain
{
	public static void main (String[] args)
	{
	BinaryIntHeap a = new BinaryIntHeap();
	
	System.out.println(a.isEmpty());
	a.insert(1);
	a.insert(2);
	a.insert(3);
	a.insert(4);
	a.insert(5);
	a.insert(6);
	a.insert(7);
	a.insert(8);
	a.insert(9);
	a.insert(10);
	a.insert(11);
	
	
	System.out.println(a);
	System.out.println(a.isEmpty());
	System.out.println(a.pullHighest());
	System.out.println(a.pullHighest());
	System.out.println(a.size());
	}
}
