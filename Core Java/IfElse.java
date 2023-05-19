import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();

        if(age<12){
            System.out.println("You are Kid");
        }
        else if(12<age && age<=19)
        {
            System.out.println("You are a teenager");
        
        }
        else if(19<age && age<=50){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior citizen");
        }
      

    }
}
