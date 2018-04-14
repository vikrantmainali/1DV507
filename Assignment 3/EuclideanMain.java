package vm222cv_assign3;

public class EuclideanMain 
{

	public static void main (String[] args)
	{
		System.out.println("GCD of 18 and 12 is " + GCD(18,12)); //checking GCD of 18 and 12
		System.out.println("GCD of 42 and 56 is " +GCD(42,56)); //checking GCD of 42 and 56
		System.out.println("GCD of 9 and 28 is " +GCD(9,28)); //checking GCD of 9 and 28
		System.out.println("GCD of 0 and 5 is " +GCD(0,5)); //checking GCD of 0 and 5
	}
	
	public static int GCD(int a, int b) //method to calculate GCD of 2 numbers
	{
		if (b == 0) //if one number is 0
		{
			return a; //then GCD is the other number
		}
		else
		return GCD(b, a % b); /*otherwise, the GCD is the same as GCD of b and a mod b
		 						and then recursion (this is the general rule for GCD) */
	}

}
