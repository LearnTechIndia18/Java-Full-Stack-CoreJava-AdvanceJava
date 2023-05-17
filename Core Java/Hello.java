import java.util.Scanner;

class Hello{ 
 
public static void main(String[] args) {
// System.out.print("Hello ");   
// System.out.println("Hello");  

Scanner s=new Scanner(System.in);

String s1=s.nextLine();
System.out.println(s1);
s1="raja";
System.out.println(s1);

final String s2=s.nextLine();
System.out.println(s2);

int age=20;
System.out.println(age);

float b=93.7f;
System.out.println(b);

char c='A';
System.out.println(c);

boolean d=true;
System.out.println(d);

byte w=26;
System.out.println(w);

double e=3.1438383;
System.out.println(e);

long f=303030;
System.out.println(f);

}
}