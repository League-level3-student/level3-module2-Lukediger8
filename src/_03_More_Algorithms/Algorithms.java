package _03_More_Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
	  public static boolean isPrime(int num) {
	    	for(int i = 2; i <= (int)num/2; i++) {
	    		if(num%i == 0) {
	    			return false;
	    		}
	    	}
	    	return true;
	  }
	  
	  public static boolean isSquare(int num) {
		  for(int i = 1; i <= num; i++) {
	    		if(Math.sqrt(num) == i) {
	    			return true;
	    		}
	    	}
	    	return false;
	  }
	
	public static String multiply(int num1, int num2) {
		int sum = num1*num2;
    	String w = num1 + " x " + num2 + " = " +  sum;
        return w;
    }
    
    public static int findBrokenEgg(List<String> eggs) {	
    	for(int i = 0; i<eggs.size(); i++) {
    		if(eggs.get(i) .equals("cracked")) {
    			return i;
    		}
    	}
        return 0;
    }

    public static long countPearls(List<Boolean> oysters) {
		int count = 0;
    	for(int i = 0; i < oysters.size(); i++) {
    		if(oysters.get(i)) {
    			count +=1;
    		}
    	}
	
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for(int i = 0; i<peeps.size(); i++) {
			if(peeps.get(i) > tallest) {
			tallest = peeps.get(i);
			}
			
		}
		return tallest;
	}
}
		
		
	
	


