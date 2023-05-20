import java.util.*;

public class Assignment0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ip1 = sc.nextInt();
        int ip2 = sc.nextInt();
        sc.close();
        if (ip2 < 9) {
            if (ip1 == ip2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else if (ip1 == (ip2 % 10)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}