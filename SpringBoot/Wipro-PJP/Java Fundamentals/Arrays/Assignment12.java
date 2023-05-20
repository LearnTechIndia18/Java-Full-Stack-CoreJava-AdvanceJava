import java.util.*;
public class Assignment12 {
    public static void main(String[] args) {
        int n1[] = { 7, 7, 7 };
        int n2[] = { 3, 8, 0 };
        int[] res = middleWay(n1, n2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] middleWay(int[] n1, int[] n2) {
        int mid = n1.length / 2;
        int[] arr = new int[2];
        for (int i = 0; i < n1.length; i++) {
            if (mid == i) {
                arr[0] = n1[i];
                arr[1] = n2[i];
            }

        }
        return arr;
    }
}
