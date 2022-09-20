package loopingConcept;

public class DoWhileLoop {
	public static void main(String[] args) {
		// To print 1 to 10
		int i = 1;

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);// checks condition later
		System.out.println("Program exited");
		System.out.println();

		// to print odd number

		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j <= 10);
		System.out.println("Program exited");
	}
}
