package day2;

public class Program_SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 50;
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {

				sum = sum + i;
			}

		}
		System.out.println("Sum of even numbers:" + sum);
	}

}
