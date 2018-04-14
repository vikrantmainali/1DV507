package vm222cv_assign3;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.Test;

public class SortingAlgorithmsTest
{
	@Test
	public void testIntSort() //Test case for the integer sorting using both insertion sort and merge sort
	{
		int[] a = {32,-23,12,-19,4,8}; //creating an array with random order integers
		int[] b = {-23,-19,4,8,12,32}; //ordering the previous array in ascending order
		int[] c = SortingAlgorithms.insertionSort(a); //performing insertion sort and storing in this array
		int[] c1 = SortingAlgorithms.mergeSort(a); //performing merge sort and storing in this array
		assertArrayEquals(c,b); //checking if the sorted array and sorted by insertion sort array are equal
		assertArrayEquals(c1,b); //checking if the sorted array and sorted by merge sort array are equal
		
		//same principle from above test applies to the rest
		
		int[] d = {-32,-50,-9,-43,-99}; //case with only negative integers
		int[] e = {-99,-50,-43,-32,-9};
		int[] f = SortingAlgorithms.insertionSort(d);
		int[] f1 = SortingAlgorithms.mergeSort(d);
		assertArrayEquals(f,e);
		assertArrayEquals(f1,e);
		
		int[] g = {99,0,-5,88,5,-88,-99}; //case with both negative and positive integers and 0
		int[] h = {-99,-88,-5,0,5,88,99};
		int[] i = SortingAlgorithms.insertionSort(g);
		int[] i1 = SortingAlgorithms.mergeSort(g);
		assertArrayEquals(i,h);
		assertArrayEquals(i1,h);
		
		int[] j = {90,54,101,49,43,2}; //case with only positive integers
		int[] k = {2,43,49,54,90,101};
		int[] l = SortingAlgorithms.insertionSort(j);
		int[] l1 = SortingAlgorithms.insertionSort(j);
		assertArrayEquals(l,k);
		assertArrayEquals(l1,k);
		
		int[] m = {}; //case with no integers (empty array)
		int[] n = {};
		int[] o = SortingAlgorithms.insertionSort(m);
		int[] o1 = SortingAlgorithms.mergeSort(m);
		assertArrayEquals(o,n);
		assertArrayEquals(o1,n);
		
		int[] p = {53,21,53,21}; //case with repeated integers
		int[] q = {21,21,53,53};
		int[] r = SortingAlgorithms.insertionSort(p);
		int[] r1 = SortingAlgorithms.mergeSort(p);
		assertArrayEquals(r,q);
		assertArrayEquals(r1,q);
	}
	
	@Test
	public void testStringSort() //Test case for the string sorting using both insertion sort and merge sort
	{
        Comparator<String> test =  (s1, s2) -> s2.compareTo(s1); //comparator we'll be using, alphabetical comparison	

		String[] a = {"zebra", "apple", "zimbabwe", "microsoft", "samsung"}; //creating an array with random order strings
        String[] b = {"apple", "microsoft", "samsung", "zebra", "zimbabwe"};//sorting the previous array in ascending order
        String[] c = SortingAlgorithms.insertionSort(a, test); //performing insertion sort and storing in this array
        String[] c1 = SortingAlgorithms.mergeSort(a, test);//performing merge sort and storing in this array
        assertArrayEquals(c,b); //checking if the sorted array and sorted by insertion sort array are equal
        assertArrayEquals(c1,b); //checking if the sorted array and sorted by merge sort array are equal
        
        //same principle from above test applies to the rest
        
        String[] d = {"zoom","zebra","zambia","zimbabwe","zephyr", "zipper"}; //case where all strings start with z
        String[] e = {"zambia", "zebra", "zephyr", "zimbabwe", "zipper", "zoom"};
        String[] f = SortingAlgorithms.insertionSort(d, test);
        String[] f1 = SortingAlgorithms.mergeSort(d, test);
        assertArrayEquals(f,e); 
        assertArrayEquals(f1,e); 
        
        String[] g = {"b","d","c","e","a","f","g"}; //case with only one letter strings
        String[] h = {"a","b","c","d","e","f","g"};
        String[] i = SortingAlgorithms.insertionSort(g, test);
        String[] i1 = SortingAlgorithms.mergeSort(g, test);
        assertArrayEquals(i,h);
        assertArrayEquals(i1,h);
        
        String[] j = {""}; //case with empty string
        String[] k = {""};
        String[] l = SortingAlgorithms.insertionSort(j, test);
        String[] l1 = SortingAlgorithms.mergeSort(j, test);
        assertArrayEquals(l,k);
        assertArrayEquals(l1,k);
        
        String[] m = {"z","x","x","z"}; //case with repeated string
        String[] n = {"x","x","z","z"};
        String[] o = SortingAlgorithms.insertionSort(m, test);
        String[] o1 = SortingAlgorithms.insertionSort(m, test);
        assertArrayEquals(o,n);
        assertArrayEquals(o1,n);
	}
}
