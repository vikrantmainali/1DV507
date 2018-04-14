package vm222cv_assign2.circulararray;

public class ArrayQueueMain 
{
	public static void main (String[] args)
	{
		ArrayQueue a = new ArrayQueue();
		
		System.out.println("What is the size of the ArrayQueue?: " + a.size()); //checking size of ArrayQueue before adding elements 
		System.out.println("Is the ArrayQueue empty?: " + a.isEmpty() + "\n"); //checking if ArrayQueue is empty before addding elements
		System.out.println("Enqueuing elements... \n");
		a.enqueue("A");
		a.enqueue("B");
		a.enqueue("C");
		a.enqueue("D");
		System.out.println(a);
		System.out.println("Checking if ArrayQueue is empty after adding elements: " + a.isEmpty());
		System.out.println("Size of ArrayQueue after adding elements: " + a.size());
		System.out.println("First element of ArrayQueue: " + a.first());
		System.out.println("Last element of ArrayQueue: " + a.last());
		System.out.println("Returning and removing the first element: " + a.dequeue());
		System.out.println("Size after removing first element: " + a.size());
		System.out.println("\n Enqueuing more elements... \n");
		a.enqueue("D");
		a.enqueue("E");
		a.enqueue("F");
		System.out.println("Size after enqueuing more elements: " + a.size());
		System.out.println("First element after dequeuing: " + a.first());
		System.out.println("Last element after enqueuing: " + a.last());
		a.dequeue();
		a.dequeue();
		a.dequeue();
		a.dequeue();
		a.dequeue();
		a.dequeue();
		System.out.println("Size after dequeuing all elements: " + a.size());
	}
}

