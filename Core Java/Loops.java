import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {

            if (i % 3 == 0) {
                System.out.print(" " + i);
            }

        }
        // While loop
        System.out.println("\n");
        int init = 100;
        while (init >= 0) {
            System.out.print(" " + init);
            init--;
        }
        // do while loop
        int init1 = 100;
        System.out.println("\n");
        do {
            System.out.print(" " + init1);
            init1--;
        } while (init1 >= 0);

        // For Each
        int ar[] = { 10, 50, 60, 80, 90 };
        System.out.println("\n");
        for (int element : ar)

            System.out.print(element + " ");
    }
}
