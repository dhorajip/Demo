package loopingConcept;

public class BreakStatement {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // It will not print after 4
			}
			System.out.println(i);
		}
	}
}
