/*Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
*/

public class Assignment05 {

	public static void main(String[] args) {
	 
		char variable = '@';
		
		if((variable >= 65 && variable <= 90) || (variable >= 97 && variable <= 122) ) {
			System.out.println("Alphabet");
		}
		else if(variable >= 48 && variable <= 57) {
			System.out.println("Number");
		}
		else {
			System.out.println("Special Character");
		}
	}

}
