//Write a program to initialize an integer array and print the sum and average of the array.

import java.util.Arrays;

public class Assignment01 {

	public static void main(String[] args) {
 
		int[] arrayElements = {28, 26, 25, 18, 2};
		int sum = 0;
		
		System.out.println("Array: "+Arrays.toString(arrayElements)); 	//print Array
		
		for(int i = 0; i < arrayElements.length; i++) {										//sum
			sum = sum + arrayElements[i];
		}
		System.out.println("The sum of the array is: "+sum);
		double avg = (sum/arrayElements.length);											//average
		System.out.println("The average of the array is: "+avg);	
	}

}
