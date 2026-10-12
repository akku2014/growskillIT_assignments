package assignment3;

public class Program_MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 172;
		int sum = 0;

		for (; num > 9;) {
			for (; num > 0;) {
				int lastDigit = num % 10;// 1
				sum = sum + lastDigit;// 10
				num = num / 10;// 0
			}
			num = sum;// 1
			sum = 0;

		}
		System.out.println("Final value of num:" + num);
		if (num == 1) {
			System.out.println("Magic Number");
		}

	}

}
