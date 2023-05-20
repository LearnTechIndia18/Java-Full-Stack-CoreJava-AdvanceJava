/*Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
*/

import java.util.Arrays;

public class Assignment07 {

	public static void main(String[] args) {
	 
		int[] arrayElements = {12, 34, 12, 45, 67, 89};
		
		Arrays.sort(arrayElements);									//sort
		int[] temp = new int[arrayElements.length];
		int j = 0;											//Using temporary array
		for (int i = 0; i < arrayElements.length-1; i++){
			if (arrayElements[i] != arrayElements[i+1]){
				temp[j++] = arrayElements[i];  
			}
		}
		temp[j++] = arrayElements[arrayElements.length-1];
		for (int i = 0; i < j; i++){
			System.out.print(temp[i]+" ");  				//last element
		}
	}
	
}
 