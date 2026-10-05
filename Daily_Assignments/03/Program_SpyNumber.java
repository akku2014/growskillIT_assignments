package assignment3;

public class Program_SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1124;
		int sum = 0;
		int mul = 1;

		for (; num > 0;) {
			int lastDigit = num % 10;// 4
			num = num / 10;// 112
			sum = sum + lastDigit;
			mul = mul * lastDigit;
		}
		if (sum == mul) {
			System.out.println("1124 is a Spy Number");
		} else {
			System.out.println("1124 is not a Spy Number");
		}
	}

}
