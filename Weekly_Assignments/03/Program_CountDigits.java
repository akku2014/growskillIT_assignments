package day2;

public class Program_CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 987654;
		int count = 0;
		int reverse = 0;

		for (; num > 0;) {
			int lastDigit = num % 10;// 4
			count++;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;// 98765

		}
		System.out.println("Number of Digits:" + count);
	}

}
