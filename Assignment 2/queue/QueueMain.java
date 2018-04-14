package vm222cv_assign2.queue;

public class QueueMain
{
	public static void main(String[] args)
	{
        LinkedQueue m = new LinkedQueue();
        
        System.out.println("Is it empty?: " + m.isEmpty() + "\n"); //checking if LinkedQueue is empty before adding elements
        
        System.out.println("Enqueuing elements..." + "\n"); //Enqueuing elements to the LinkedQueue
        
        m.enqueue("a");
        m.enqueue(1);
        m.enqueue("b");
        m.enqueue(2);
        m.enqueue("c");
        m.enqueue(3);
       
        System.out.println("Is it empty?: " + m.isEmpty()); //checking if it is empty after adding elements
        System.out.println("What is the size?: " + m.size()); //checking the size of the LinkedQueue after adding elements
        System.out.println(m); //Printing the elements in the queue
        System.out.println("First element: " + m.first()); //getting the first element of the queue
        System.out.println("Dequeuing element: " + m.dequeue()); //removing and returning the first element of the queue
        System.out.println("After dequeuing, first element is: " + m.first()); //getting the first element after dequeuing 
        System.out.println("Last element: " + m.last());  //checking the last element of the LinkedQueue
        System.out.println("What is the size after dequeuing?: " + m.size()); //checking size after dequeuing 
	}
}
