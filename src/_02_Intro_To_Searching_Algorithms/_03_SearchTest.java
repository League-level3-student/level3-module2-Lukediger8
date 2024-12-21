package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String arr[] = {"1","3","4","7","8","9","11"};
	    assertEquals(_01_LinearSearch.linearSearch(arr, "4"),2);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	
	    int arr[] = {1,3,4,7,8,9,11};
	    assertEquals(_02_BinarySearch.binarySearch(arr, 0, arr.length-1, 4),2);
	    }
}
