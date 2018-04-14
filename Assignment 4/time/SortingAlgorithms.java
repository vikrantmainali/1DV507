package vm222cv_assign4.time;

import java.util.Comparator;

public class SortingAlgorithms 
{
	public static int[] insertionSort(int[] in) //method for insertion sort of integer array
	{
		int[] sortedArr = in.clone(); //making a separate array with the same content so that original array isn't changed
		
        for (int i = 1; i <= in.length - 1; i++) 
        	/*made with the help of http://www.w3resource.com/w3r_images/insertion-sort.png
        	  starting with the second element and looping up to the last element in the array */
        	 
        {
        	int temp = sortedArr[i]; //temporary integer is every element from 2nd index till the last index
        	int j; //a counter integer which will help us sort array in ascending order
        	
            for(j = i; j > 0 && sortedArr[j - 1] > temp; j--) 
            	//for every integer j greater than 0 and the temp integer is smaller than the previous integer
            {
            	sortedArr[j] = sortedArr[j - 1]; //swap the elements places
            }
            sortedArr[j] = temp; //saving the smallest integer j
        }
		return sortedArr; //return the sorted array
    }
	
	
	public static int[] mergeSort(int[] in) 
	/*method for merge sort of integer array created with the help of
	  https://s3.amazonaws.com/ka-cs-algorithms/merge_sort_recursion.png */
	{
		int[] sortedArr = in.clone(); //making a separate array with the same content so that original array isn't changed
		int[] left; //to store after breaking down the array
		int[] right; //to store after breaking down the array
		int first = 0, second = 0;

		if (in.length > 1) //since arrays with only one integer doesn't need to be sorted at all
		{
			left = new int[in.length / 2]; //the left integer array is the original with half the length
			right = new int[in.length - left.length]; 
			//the right integer array is the original minus the already stored left array

			System.arraycopy(in, 0, left, 0, left.length); //copying half the initial array to left array
			System.arraycopy(in, left.length, right, 0, right.length); //copying the rest to the right array
		
			left = mergeSort(left); //recursion is performed on the left array 
			right = mergeSort(right); //recursion is performed on the right array

        for (int i = 0; i < in.length; i++)
        	//sorting the left and right arrays first and then merge the two sorted arrays to get the sorted array
        	
        {
            if (second >= right.length || (first < left.length && 
                    left[first] <= right[second])) 
            {
                sortedArr[i] = left[first];   
                first++;
            }
            else
            {
                sortedArr[i] = right[second];   
                second++;
            }
        }
		}
		return sortedArr; //return the sorted array
	}
	
	public static String[] insertionSort(String[] in, Comparator<String> c)  
	/* follows the same principal as the insertionSort for integers, except we're using a comparator since 
	we cannot use <,>,= operands on strings */
	{
		String[] sortedArr = in.clone();
		
		 for (int i = 1; i < in.length; i++)
	        {
	        	String temp = sortedArr[i];
	        	int j = i;
	        	
	            while (j > 0 && c.compare(temp, sortedArr[j - 1]) > 0)
	            {	
	            	sortedArr[j] = sortedArr[j - 1];
	            	j--;
	            }
	            sortedArr[j] = temp;
	        }
			return sortedArr;	
	}
	
	public static String[] mergeSort(String[] in, Comparator<String> c)
	{
	/*same principal as the mergeSort for integers except we use comparator since we cannot use operands such as <,>,=
	  on strings 
	  */
		
		String[] sortedArr = in.clone();
		String[] left;
		String[] right;
		int first = 0, second = 0;
	
		if (in.length > 1)
		{
			left = new String[in.length / 2];
			right = new String[in.length - left.length];
			
			System.arraycopy(in, 0, left, 0, left.length);
			System.arraycopy(in, left.length, right, 0, right.length);
			
			left = mergeSort(left,c);
			right = mergeSort(right,c);
		
		 for (int i = 0; i < in.length; i++)
		 {
			if (second >= right.length || (first < left.length && 
	                   c.compare(left[first],right[second]) > 0)) 
	        {
				sortedArr[i] = left[first];   
	            first++;
	        }
	        else
	        {
	        	sortedArr[i] = right[second];   
	            second++;
	        }
		 }
	     }
		return sortedArr;
	}
}	
