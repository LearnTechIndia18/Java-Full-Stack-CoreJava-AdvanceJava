/*Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
*/

public class Assignment17 {

	public static void main(String[] args) {
 
		int number = Integer.parseInt(args[0]);
		int temp = number, digit, reverse = 0;
		
		while(temp > 0) {
			digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp = temp / 10;
		}
		
		if(number == reverse) {
			System.out.println(number + " "+ "is a palindrome");
		}
		else {
			System.out.println(number + " "+ "is not a palindrome");
		}
	}

}
