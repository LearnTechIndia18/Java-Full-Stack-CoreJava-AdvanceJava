/*Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a
*/

public class Assignment07 {

	public static void main(String[] args) {
 
		char variable = 'a';
		if (variable >= 'a' && variable <= 'z')
			System.out.println((char)(variable-32));				//lowercase to uppercase
	     else
	    	 System.out.println((char)(variable+32)); 			//uppercase to lowercase
	}

}
