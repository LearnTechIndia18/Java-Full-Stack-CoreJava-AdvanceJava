import java.util.*;
public class Assignment10{

	
	public static void main(String[] args) {
        int n[] = { 1, 0, 1, 0, 0, 1, 1 };
        int[] res = evenOdd(n);
        System.out.println(Arrays.toString(res));
    }

    public static int[] evenOdd(int[] n) {
        int[] arr = new int[n.length];
        int k = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                arr[k] = n[i];
                k++;
            }
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                arr[k] = n[i];
                k++;
            }
        }
        return arr;
    }
		
}
			
		

	



