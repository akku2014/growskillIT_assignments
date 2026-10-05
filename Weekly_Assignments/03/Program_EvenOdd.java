package day2;

public class Program_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Even Numbers:");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		System.out.println("Odd Numbers:");

		for (int j = 1; j <= 20; j++) {
			if (j % 2 != 0) {
				System.out.print(j + " ");
			}
		}

	}
}
