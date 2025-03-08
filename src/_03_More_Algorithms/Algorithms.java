 package _03_More_Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
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

	public static boolean isCube(int num) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=num; i++) {
    		if(i*i*i == num) {
    			return true;
	}
		}
	return false;
	}

	public static Object findLongestWord(List<String> words) {
		String woah = "";
		for(int i = 0; i<words.size(); i++) {
    		if(words.get(i).length()>woah.length()) {
    			woah = words.get(i);
    		}
    	}
        return woah;
    }

	public static Object containsSOS(List<String> message2) {
		for(int i = 0; i<message2.size(); i++) {
			if(message2.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		Double small;
		ArrayList<Double> scores = new ArrayList<Double>();
		for(int i = 0; i< results.size(); i++) {
			small = 100.0;
			for(int j = 0; j < results.size(); j++) {
				if (!(scores.contains(results.get(j))) && results.get(j) < small){
					small = results.get(j);
				}
				
			}
			scores.add(small);
			System.out.println(scores);
			
			
		}
		return scores;
		
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		for(int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size() - 1 - i; j++) {
				if (unsortedSequences.get(j).length() > unsortedSequences.get(j + 1).length()) {
					String temp = unsortedSequences.get(j);
					unsortedSequences.set(j,unsortedSequences.get(j+1)); 
					unsortedSequences.set(j+1,temp);
				}
			}
		
	}
		return unsortedSequences;
}

	
	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		for(int  i = 0; i < words.size();i++) {
			for(int j = 0; j < words.size() - 1 - i;j++) {
				if (words.get(j).compareTo(words.get(j+1)) > 0) {
					String temp = words.get(j);
					words.set(j, words.get(j+1));
					words.set(j+1, temp);
				}
			}
		}
		return words;
	}
}

				
	
	
	


		
		
	
	


