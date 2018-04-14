package vm222cv_assign1;

import java.util.Arrays;

public class PascalMain 
{
	public static void main (String[] args)
	{
		System.out.println(Arrays.toString(pascalRow(32)));
	}
	
	public static int[] pascalRow(int n)
	{
		int[] pascalTriangle = new int [n+1];
		
		if (n == 0)
		{
			pascalTriangle[0] = 1;
			return pascalTriangle;
		}
		
		else if (n == 1)
		{
			pascalTriangle[0] = 1;
			
			pascalTriangle[1] = 1;
			
			return pascalTriangle;
		}
		
		else if (n == 2)
		{
			pascalTriangle[0] = 1;
			
			pascalTriangle[1] = 2;
			
			pascalTriangle[2] = 1;
						
			return pascalTriangle;	
		}
		else
		{
			int[] pascal = pascalRow(n-1); //recursion on the method so it jumps down to the previous row
						
			pascalTriangle[0] = pascalTriangle[n] = 1; //since the pattern is that the first number of the row and the last number of the row is 1
				
			for (int i = 1; i < pascal.length; i++) //for loop going from 1 to the number of r
			{	
				pascalTriangle[i] = pascal[i-1] + pascal[i]; //going from addition pattern from last row
			}
			
			if (n > 32)
			{
				System.out.println("int cannot handle numbers this big!");
				System.exit(0);
			}
			
			return pascalTriangle;
		}
		
	}
}
