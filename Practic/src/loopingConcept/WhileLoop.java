package loopingConcept;

public class WhileLoop {

	public static void main(String[] args) {
		// print 1 to 10 numbers
		int i = 1;

		while (i <= 10) {
			System.out.println(i); // 1 1 1 1 1 .....
			i++; // 1 2 3 4 5......10
		}

		System.out.println("Program Exited");
		System.out.println(); // to leave one empty line

		// To print even numbers

		int j = 2;

		while (j <= 10) {
			System.out.println(j); // 1 1 1 1 1 .....
			j += 2; // 2 4 6 8 10
		}

		System.out.println("Program exited");

	}
}
