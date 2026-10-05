package day2;

public class Program_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int originalNum = num;
		int armstrong = 0;

		for (; num > 0;) {
			int lastDigit = num % 10;
			num = num / 10;
			int mul = lastDigit * lastDigit * lastDigit;
			armstrong = armstrong + mul;
		}
		if (originalNum == armstrong) {
			System.out.println("153 is an Armstrong number");
		} else {
			System.out.println("153 is not an Armstrong number");
		}

	}

}
