package loopingConcept;

public class ForLoop {
	public static void main(String[] args) {
		// To print 1 to 10

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);// 1 2 3...10
		}
		System.out.println("Program exited");
		System.out.println();

		// To print 10 to 1
		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}
		System.out.println("Program exited");
	}
}
