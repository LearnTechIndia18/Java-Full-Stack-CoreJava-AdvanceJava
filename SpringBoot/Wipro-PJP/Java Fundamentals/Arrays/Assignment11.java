public class Assignment11 {
    public static void main(String[] args) {
        int n[] = { 1, 4, 1, 4 };
        System.out.println(CheckOneFour(n));
    }

    public static boolean CheckOneFour(int[] n) {
        boolean flag = true;
        for (int i = 0; i < n.length; i++) {
            if (n[i] != 1 && n[i] != 4) {
                flag = false;
            }
        }
        return flag;
    }   
}
