package assignment9;

public class Polymorphism {
//method overloading
	static int calculateArea() {
		return (100);
	}

	static double calculateArea(double radius) {
		return radius;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 5;
		System.out.println(calculateArea());

		System.out.println(calculateArea(3.14 * radius * radius));
	}

}
