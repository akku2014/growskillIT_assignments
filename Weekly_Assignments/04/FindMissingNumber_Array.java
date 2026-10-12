package day2;

public class FindMissingNumber_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		int count = 0;
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			count = count + i;
		}

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		int missing = count - sum;
		System.out.println("Missing Number: " + missing);
	}

}
