package arrays;

public class TwoDimensionalArrayPassing {

	public static void main(String[] args) {
		int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		System.out.println("Number of rows:" + a.length);
		System.out.println("Number of columns:" + a[0].length);

		// classic for loop

		for (int i = 0; i <= 2; i++) // for incrementing rows
		{
			for (int j = 0; j <= 1; j++) // for increamenting the columns for each row
			{

				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}

		// for each loop

		for (int i[] : a) {
			for (int j : i) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
	}

}
