/*Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
*/

import java.util.*;

public class Assignment16 {

	public static void main(String[] args) {
 
 	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = scan.nextInt();
		scan.close();
		
		int digit, reverse = 0;
		
		while(number > 0) {
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		System.out.println(reverse);
	}

}
