package vm222cv_assign1.IntCollection;

public class ArrayIntList extends AbstractIntCollection implements IntList
{
	@Override
	public void add(int n) //adding integer n to each element
	{

		values[super.size] = n;	
		
		super.size++;
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException //adding an integer at a specific index
	{
		if (index >= super.size)
		{
			throw new IndexOutOfBoundsException();
		}
		
		values[index] = n;
		
		super.size++;
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException //removing an element from a given index
	{
		if (index >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		
		for (int i = index; i < values.length-1; i++)
		{
			values[i] = values[i+1];
		}
		
		super.size--;
	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException //getting the value at a specific index of array int list
	{
		return values[index];
	}

	@Override
	public int size() //getting the size of the array int list
	{
		return super.size;
	}
	
	@Override
	public boolean isEmpty() //checking if list is empty
	{
		if (super.size == 0)
		{	
			return true;
		}
		
		return false;
	}

	@Override
	public int indexOf(int n) //finding out the index of a given number
	{
		for (int i = 0; i <= values.length - 1; i++)
		{
			if (values[i] == n)
			{
				return i;
			}
		}
		return -1;
	}

}
