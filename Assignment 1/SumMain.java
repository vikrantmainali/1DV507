package vm222cv_assign1;

public class SumMain 
{
	public static void main (String[] args)
	{
		System.out.println(recursionSum(1,5));
	}


	public static int recursionSum(int initialNum, int lastNum) 
	//twp parameters since it becomes hard when we get to the 2nd part of the equation where it is n/2 + 1 to n
	{
		if (lastNum == initialNum)
		{
			return initialNum;
		}
		
		return recursionSum(initialNum,(initialNum+lastNum)/2) + recursionSum(((initialNum+lastNum)/2+1), lastNum);
	}	
}