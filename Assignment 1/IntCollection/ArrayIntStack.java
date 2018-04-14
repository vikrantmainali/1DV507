package vm222cv_assign1.IntCollection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack
{

	@Override
	public void push(int n) //adding element to top of the stack
	{
		values[super.size] = n;
		
		size++;
	}

	@Override
	public int pop() throws IndexOutOfBoundsException //checking and removing first element
	{
		int pop = values[super.size - 1];
		
		size--;
		
		return pop;
	}

	@Override
	public int peek() throws IndexOutOfBoundsException //looking at the first element
	{
		return values[super.size - 1];
	}

	@Override
	public int size() //checking size of stack
	{
		return super.size;
	}

	@Override
	public boolean isEmpty() //checking if stack is empty or not
	{
		if (super.size == 0)
		{
			return true;
		}
		return false;
	}

}
