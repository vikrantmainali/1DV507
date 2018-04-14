package vm222cv_assign1.IntCollection;

import vm222cv_assign1.IntCollection.ArrayIntList;

public class CollectionMain 
{
	public static void main(String[] args) 
	{
		ArrayIntList list = new ArrayIntList();
		
		
		System.out.println("Checking if list is empty or not: " + list.isEmpty());
		
		System.out.println("Size before adding elements to list: " + list.size());
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Size after adding: " + list.size());
		
		System.out.println("Checking if list is empty after adding: " + list.isEmpty());
		
		System.out.println("Elements in list: " + list);
						
		list.remove(1);
		
		System.out.println("Removed list: " + list);
		
		System.out.println("Size after removing: " + list.size());
		
		System.out.println("Index of 4 in list: " + list.indexOf(4));
		
		
		ArrayIntStack stack = new ArrayIntStack();
		
		System.out.println("Checking if stack is empty: " + stack.isEmpty());
		
		System.out.println("Size of stack before adding elements: " + stack.size());

		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println("Stack size after pushing elements: " + stack.size());
		
		System.out.println("Stack pop: " + stack.pop());
		   
		System.out.println("Stack peek: " + stack.peek());
	}	
}
