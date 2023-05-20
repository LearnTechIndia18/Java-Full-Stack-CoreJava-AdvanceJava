//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

public class Assignment05 {

	public static void main(String[] args) {
 
		int[] arrayElements = {19, 14, 20, 18, 2};	
		for(int i = 0; i < arrayElements.length-1; i++) {		//sort 
			for(int j = 0; j < arrayElements.length-1; j++) {
				if(arrayElements[j] > arrayElements[j+1]) {
					int temp = arrayElements[j+1];
					arrayElements[j+1] = arrayElements[j];
					arrayElements[j] = temp;
				}
			}
		}
		System.out.println("Largest two numbers are "+arrayElements[arrayElements.length-1]+", "+arrayElements[arrayElements.length-2]);
		System.out.println("Smallest two numbers are "+arrayElements[0]+", "+arrayElements[1]);
	}

}
