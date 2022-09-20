package inheritance;

public class Methodoverloading {
	int a;
	int b;

	void sum() // First
	{
		a = 10;
		b = 20;
		System.out.println(a + b);
	}

	void sum(int x, int y) // Second
	{
		int a = x;
		int b = y;
		System.out.println(a + b);
	}

	void sum(int x, int y, int z) // Third
	{
		System.out.println(x + y + z);
	}

	void sum(int x, double y) // Fourth
	{
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		Methodoverloading mo = new Methodoverloading();

		mo.sum(); // call first method

		mo.sum(100, 200); // call second method

		mo.sum(10, 20, 30); // call third method

		mo.sum(10, 20.5); // call fourth method
	}

}
