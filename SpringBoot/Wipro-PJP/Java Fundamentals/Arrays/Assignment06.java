//Write a program to initialize an array and print them in a sorted order.

import java.util.Arrays;

public class Assignment06 {

	public static void main(String[] args) {
	
		int[] arrayElements = {19, 14, 20, 18, 2};
		
		Arrays.sort(arrayElements);			//sort inbuilt function
		
	
		System.out.print("Sorted Array : ");
		for(int element : arrayElements) {
			System.out.print(element + " ");
		}
	}

}
