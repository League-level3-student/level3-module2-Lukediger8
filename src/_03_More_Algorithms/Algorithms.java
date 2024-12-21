package _03_More_Algorithms;

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
	    	for(int i = 2; i <= (int)num/2; i++) {
	    		if(num/i == i) {
	    			return true;
	    		}
	    	}
	    	return false;
	  }
	
	public static String multiply(int num1, int num2) {
        return null;
    }
    
    public static int findBrokenEgg(List<String> eggs) {	
        return 0;
    }
}
