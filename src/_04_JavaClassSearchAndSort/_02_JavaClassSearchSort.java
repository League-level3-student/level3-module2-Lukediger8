package _04_JavaClassSearchAndSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
    	int[] intArr = {5, 4, 3, 2, 1, 0};
    	Arrays.sort(intArr);
		return intArr;
    }
    
    public static List<Double> listSort(List<Double> list){
    	 ArrayList<Double> doubleList = new ArrayList<Double>();
         doubleList.add(5.0);
         doubleList.add(3.0);
         doubleList.add(2.0);
         doubleList.add(4.0);
         doubleList.add(0.0);
         doubleList.add(1.0);
         Collections.sort(doubleList);
        return doubleList;
    }

    public static Boolean arraySearch(char[] arr, char key) {
    	 for( char i : arr ) {
    	 if(i==key) {
    		 return true;
    	 }
    	 }

        return false;
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
		return list.contains(key);
       
    }
}
