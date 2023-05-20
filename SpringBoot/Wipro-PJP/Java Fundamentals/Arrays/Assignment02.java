//Write a program to initialize an integer array and find the maximum and minimum value of the array.

import java.util.Arrays;

public class Assignment02 {

	public static void main(String[] args) {
	 
		int[] arrayElements = {20, 19, 22, 40, 2};
		
		System.out.println("Array: "+Arrays.toString(arrayElements));//print Array
		
		int max = arrayElements[0];																	//max value
		for(int i = 1; i < arrayElements.length; i++) {
			if(arrayElements[i] > max)
				max = arrayElements[i];
		}
		System.out.println("The maximum value of Array is: "+max);
		
		int min = arrayElements[0];																	//min value
		for(int i = 1; i < arrayElements.length; i++) {
			if(arrayElements[i] < min)
				min = arrayElements[i];
		}
		System.out.println("The minimum value of Array is: "+min);
	}

}
