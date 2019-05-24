package OOPConceptPart2;

import java.util.Scanner;

public class Fabonicee {

	public static void main(String[] args) {

		int n, a = 0, b = 0, c = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of value");

		n = s.nextInt();
		for (int i = 0; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(+a);

		}
	}
}
