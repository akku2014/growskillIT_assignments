package day2;

public class Program_ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int reverse = 0;

		for (; num > 0;) {
			int lastDigit = num % 10;// 5
			num = num / 10;// 1234
			reverse = reverse * 10 + lastDigit;
		}
		System.out.println("Reverse Number:" + reverse);
	}

}
