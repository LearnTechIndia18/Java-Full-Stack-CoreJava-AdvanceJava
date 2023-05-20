 //Write a program to check if a given integer number is odd or even.

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int number = scan.nextInt();
		
		if(number % 2 != 0) {
			System.out.println("Number is Odd");
		}
		else {
			System.out.println("Number is Even");
		}
		scan.close();
	}

}
