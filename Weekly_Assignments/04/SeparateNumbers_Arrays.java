package day2;

public class SeparateNumbers_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -4, 7, 0, -2, 9, 0, -8, 5 };

		System.out.println("Expected Output: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.print(arr[i] + " ");
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.print(arr[i] + " ");
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
