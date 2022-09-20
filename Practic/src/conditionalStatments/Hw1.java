package conditionalStatments;

public class Hw1 {

	public static void main(String[] args) {
		// Write a java program to find a number is positive or negative.
		System.out.println("> Find if -16 number is positive or negative....");

		int Number = -16;

		if (Number >= 0) {
			System.out.println("This number is positive");
		} else {
			System.out.println("This number is negative");
		}
		System.out.println();

		// Write a java program to find greatest of 3 numbers.
		System.out.println("> Find the greatest of 10,20 and 30 numbers...");

		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b) {
			System.out.println("10 is greatest number");
		} else if (b > c) {
			System.out.println("20 is greatest number");
		} else {
			System.out.println("30 is greatest number");
		}
	}

}
