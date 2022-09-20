package oopspractice;

public class ConstructorOverloading {
	int a = 0;
	int b = 0;
	double c = 0;

	ConstructorOverloading() // First	
	{
		a=10;
		b=20;
		c=20.5;
	}

	ConstructorOverloading(int x, int y) // Second 	
	{
		a=x;
		b=y;
	}

	ConstructorOverloading(int x, double y) // Third	
	{
		a=x;
		c=y;
	}

	ConstructorOverloading(int x, int y, double z) // Fourth	
	{
		a=x;
		b=y;
		c=z;
	}

	ConstructorOverloading(int x, double y, int z) // Fifth	
	{
		a=x;
		b=z;
		c=y;
	}

	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {

		/*
		 * ConstructorOverloading co = new ConstructorOverloading(); // First
		 * constructor co.display();
		 */

		/*
		 * ConstructorOverloading co = new ConstructorOverloading(10,20); // Second
		 * constructor co.display();
		 */

		/*
		 * ConstructorOverloading co = new ConstructorOverloading(10,20.5); // Third
		 * constructor co.display();
		 */

		/*
		 * ConstructorOverloading co = new ConstructorOverloading(10,20,20.5); // Fourth
		 * constructor co.display();
		 */

		ConstructorOverloading co = new ConstructorOverloading(10, 20.5, 30); // Fifth constructor
		co.display();
	}
}
