public class Assignment09 {
    private static int[] arr = {1,10,10,2};

	public static int[] RemoveTen(int[] n) {

		int[] copy = new int[n.length];
		int j = 0;
		
		for (int i=0; i<n.length; i++)

			if (n[i] != 10) {

				copy[j] = n[i];
				j++;

			}

		return copy;

	}

	public static void main(String[] args) {

		int[] result = RemoveTen(arr);

		for (int i=0; i<result.length; i++) {

			System.out.println(result[i]+" ");

		}

	}
}
