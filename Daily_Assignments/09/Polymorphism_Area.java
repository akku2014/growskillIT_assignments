package assignment9;

public class Polymorphism_Area {
	//Method Overload
	static int calculateArea(int length, int breadth) {
		return length * breadth;
	}

	static float calculateArea(float length, int breadth) {
		return length * breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateArea(8, 4));
		System.out.println(calculateArea(8.0f, 4));
	}

}
