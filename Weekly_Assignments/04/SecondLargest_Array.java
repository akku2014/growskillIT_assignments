package day2;

public class SecondLargest_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 45, 7, 89, 34, 89, 56 };
		int largest = arr[0];
		int secondLargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < largest) {
				if (secondLargest == 0 || arr[i] > secondLargest) {
					secondLargest = arr[i];
				}
			}
		}
		System.out.println("Second largest element:" + secondLargest);

	}

}
