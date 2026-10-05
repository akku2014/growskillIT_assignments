package assignment3;

public class Program_MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 172;
		int sum = 0;

		for (; num > 0;) {
			int lastDigit = num % 10;// 2
			num = num / 10;// 17
			sum = sum + lastDigit;
		}
		System.out.println(sum);
		System.out.println("Final Digit=1+0=1");
	}

}
