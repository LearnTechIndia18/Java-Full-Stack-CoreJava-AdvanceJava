/*Write a program to print the sum of all the digits of a given number.

Example1) 
I/P:1234
O/P:10
*/

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scan.nextInt();
		scan.close();
		int sum;
		
		for(sum = 0; number > 0; number = number/10) 
	        	sum = sum + (number % 10);
		
		System.out.println(sum);
		
	}
	

}
