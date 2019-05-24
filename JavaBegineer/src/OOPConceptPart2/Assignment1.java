package OOPConceptPart2;

public class Assignment1 {

	public static void main(String[] args) {
		
		int ar[]= {1,3,4,5,6,7};
		int n=ar.length;
		prin2largest(ar, n);
	}

	static void prin2largest(int ar[], int ar_size) {
		int i, first, second;
		if (ar_size < 2) {
			System.out.println("invalid input");
			return;
		}

		first = second = Integer.MIN_VALUE;

		for (i = 0; i < ar_size; i++) {
			if (ar[i] > first) {
				second = first;
				first = ar[i];

			} else if (ar[i] > second && ar[i] != first) {
				second = ar[i];

			}
		}
		if (second == Integer.MIN_VALUE) {
			System.out.println("No second largest");
		} else
			System.out.println("second largest is" + second);
	}

}
