package loopingConcept;

public class ContinueStatement {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue; // It will print all numbers , except 5
			}
			System.out.println(i); // 1 2 3 4 6 7 8 9 10
		}
	}
}
