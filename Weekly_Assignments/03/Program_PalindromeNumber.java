package day2;

public class Program_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1221;
		int originalNum = num;
		int reverse = 0;

		for (; num > 0;) {
			int lastDigit = num % 10;// 1
			num = num / 10;// 122
			reverse = reverse * 10 + lastDigit;
		}
		if (reverse == originalNum) {
			System.out.println("1221 is a Palindrome Number");
		} else {
			System.out.println("Not a Palindrome number");
		}
	}

}
