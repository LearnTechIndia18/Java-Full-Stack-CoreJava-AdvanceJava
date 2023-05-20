import java.io.*;  

class Readerss{  
public static void main(String args[])throws Exception{  
  
InputStreamReader r=new InputStreamReader(System.in);  
BufferedReader br=new BufferedReader(r);  

FileReader f=new FileReader("hello.txt");
BufferedReader br1=new BufferedReader(f);  
int i;    
while((i=br1.read())!=-1){  
    // byte -> char

System.out.print((char)i);  
}  
br1.close();    
f.close();  
// System.out.println(f);  
System.out.println("\nEnter your name");  
String name=br.readLine();  

System.out.println("Welcome "+name);  
 }  
}  
