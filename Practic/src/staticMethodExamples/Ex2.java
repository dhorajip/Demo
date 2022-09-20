package staticMethodExamples;

public class Ex2 {

	int a; // non static
	static int b; // static

	static void m1() // static method
	{
		System.out.println("This is static method");
	}

	void m2() // non static method
	{
		System.out.println("This is non static method");
	}

	void m3() // non static method
	{
		a = 100; // non static
		b = 200; // static

		m1(); // static method
		m2(); // non static method
	}

	public static void main(String[] args) // static method
	{

	}
}
