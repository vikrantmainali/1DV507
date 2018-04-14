package vm222cv_assign4.time;

import java.util.Comparator;
import java.util.Random;
import vm222cv_assign4.time.SortingAlgorithms;

public class SortingAlgorithmsBenchmark 
{
	public static void main(String[] args)
	{
		intInsertionSort();
		intMergeSort();
		stringMergeSort();
	}
	
	public static void intInsertionSort()
	{
		int[] insertionArr = randomIntArray();
		
		long start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < 1000) 
		{
			SortingAlgorithms.insertionSort(insertionArr);
		}
		System.out.println("Amount of integers that can be sorted with insertion sort in one second: " + insertionArr.length);
	}

	public static void intMergeSort()
	{
		int[] mergeArr = randomIntArray();
		
		long start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < 1000) 
		{
			SortingAlgorithms.mergeSort(mergeArr);
		}
		System.out.println("Amount of integers that can be sorted with merge sort in one second: " + mergeArr.length);
	}

	public static void stringMergeSort()
	{
		Random rand = new Random();
		String[] mergeArr = createRandomStringArray(rand);
        Comparator<String> test =  (s1, s2) -> s2.compareTo(s1);		
		long start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < 1000) 
		{
			SortingAlgorithms.mergeSort(mergeArr,test);
		}
		System.out.println("Amount of strings that can be sorted with merge sort in one second: " + mergeArr.length);
	}


	private static int[] randomIntArray() 
	{
		
		Random rand = new Random();
		int[] arr = new int[rand.nextInt(1000)];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = rand.nextInt(1000*2);
		}
		return arr;
	}
	
	
	private static String[] createRandomStringArray(Random random) 
	{
		String[] randomStringArray = new String[random.nextInt(100)];

		for (int i = 0; i <= randomStringArray.length - 1; i++) 
		{
			randomStringArray[i] = createRandomString(random);
		}

		return randomStringArray;
	}

	private static String createRandomString(Random random)
	{
		int length = 10;
		
		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; ++i) 
		{
			sb.append((char)(random.nextInt(26) + 'a'));
		}

		return sb.toString();
	}    
}