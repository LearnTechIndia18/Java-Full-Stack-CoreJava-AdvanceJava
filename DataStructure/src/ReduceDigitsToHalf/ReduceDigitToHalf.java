package ReduceDigitsToHalf;

import java.util.Scanner;

public class ReduceDigitToHalf {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            // Convert the integer to a string to count the digits
            String numString = Integer.toString(number);
            int digitCount = numString.length();
            // Calculate the divisor (10^(digitCount / 2))
            int divisor = (int) Math.pow(10, digitCount / 2);
            // Reduce the number to half and print the result
            int reducedNumber = number / divisor;
            System.out.println("Reduced number: " + reducedNumber);
        }
    }
}
