package arrays;

import java.util.Arrays;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		int sum = 0;
		int expectedSum = 0;

		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}
		for (int i = 1; i <= 10; i++) {
			expectedSum = expectedSum + i;
		}

		System.out.println("Actual Array is : " + Arrays.toString(numArr));
		System.out.println("The missing number is : " + (expectedSum - sum));

	}
}
