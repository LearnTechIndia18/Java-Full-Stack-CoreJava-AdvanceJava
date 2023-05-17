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

// Widening Typecast
int myInt=99;
double hello=myInt;
System.out.println(hello);

// Narrowing
double dolor=99.90;
int myInt1=(int)dolor;
System.out.println(myInt1);

// Conversion
String s3=String.valueOf(myInt1);
System.out.println(myInt+" "+(s3.getClass().getSimpleName()));
System.out.println(s3+1);

// String to Integer Or Double
int i=Integer.parseInt(s3);
double dolor2=Double.parseDouble(s3);
System.out.println(i);
System.out.println(dolor2);

// Without using Scanner class
String name=System.console().readLine();
System.out.println(name);

// String and its method
String fName=System.console().readLine();
String LName=System.console().readLine();
System.out.println(fName+" "+LName);

System.out.println(fName.length());
System.out.println(fName.toUpperCase());

System.out.println(fName.indexOf("Raja"));
System.out.println(fName.contains("Raja"));

System.out.println(fName.charAt(3));

System.out.println(fName.endsWith("r"));

System.out.println(fName.indexOf(LName));

// Math functions

int num=10,num2=20;

System.out.println(Math.min(num, num2));
System.out.println(Math.max(num, num2));
System.out.println(Math.sqrt(num));
num=-40;
System.out.println(Math.abs(num));

System.out.println(Math.random());
System.out.println(5+(10-5)*(Math.random()));



}
}