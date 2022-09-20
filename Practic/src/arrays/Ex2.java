package arrays;

public class Ex2 {

	public static void main(String[] args) {
		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 }, { 21, 11, 12 }, { 13, 14, 15 } };

		for (int i[] : a) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Program exited");
	}

}
