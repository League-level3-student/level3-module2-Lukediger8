package _00_Intro_to_Sorting_Algorithms;

import java.util.Random;

import processing.core.PApplet;

/*
 * Goal: Create a program that sorts each rectangle by height!
 * 
 * 1. Create an array of ints. Do not initialize it.
 *
 *In the settings() method:
 * 2. Set the size of your window to at least 500 width 500 height
 * 
 * In the setup() method:
 * 3. Initialize your array to contain 50 ints
 * 
 * 4. Initialize the ints in the array with random numbers from
 *    0 to the window height. Use the following code to get a random int:
 *    (int)random(height)
 * 
 * 5. Call the noStroke() method to remove the outline for each shape
 * 
 * In the draw() method:
 * 6. Set the background color with background(r, g, b);
 * 
 * 7. Set the color for your graph using the fill() method
 * 
 * 8. Draw a rectangle for each int in your array.
 *    the x value will be the loop variable multiplied by (width/intArray.length)
 *    the y value will the height variable
 *    the width is (width/intArray.length)
 *    the height is the negative array value at the array index, e.g. -intArray[i]
 * 
 * 9. Call the stepSort method
 * 
 * 10. Extract the code from step 4 that randomizes the array into a new method.
 * 
 * 11. Call the method you made in step 10 when the mouse is pressed using the
 *     mousePressed variable
 */
public class _03_VisualArraySorter extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int[] arr;
    Random rand = new Random();
    @Override
    public void settings() {
        size(500,500);
    }

    @Override
    public void setup() {
        arr = new int[50];
        randomizeInts();
        noStroke();
        
    }

	private void randomizeInts() {
		for(int i = 0; i < 50; i++) {
        	arr[i] = rand.nextInt(500);
        
        }
	} 


    @Override
    public void draw() {
        background(255,255,255);
        fill(0,0,0);
        for (int i = 0; i < arr.length; i++) {
        	rect(i*(width/arr.length),HEIGHT,(width/arr.length),-arr[i]);
        }
        stepSort(arr);
        if (mousePressed) {
        	randomizeInts();
        }
    }
    
    static public void main(String[] passedArgs) {
        PApplet.main(_03_VisualArraySorter.class.getName());
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/
    
    int startIndex = 1;

    void stepSort(int[] arr) {
      for (int i = startIndex; i < arr.length; i++) {
        if (arr[i - 1] > arr[i]) {
          int t = arr[i];
          arr[i] = arr[i - 1];
          arr[i - 1] = t;

          startIndex = i;
          return;
        }
      }
      startIndex = 1;
    }
    
    void bubbleSort(int[] arr) {
    	for (int j = 0; j < arr.length - 1; j++) {
            // Compare adjacent elements
            if (arr[j] > arr[j + 1]) {
                // Swap the elements if they are in the wrong order
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                
            }
        }
    }
    
    void binarySort(int[] arr) {
    	
    }
}