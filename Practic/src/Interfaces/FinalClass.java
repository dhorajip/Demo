package Interfaces;

final class Test
{
	final int a=10;
	 final void m1()
	{
		//a=20;// not valid bcoz a is final variable
		System.out.println(a);
	}
}

/*class Test123 extends Test // not valid bcoz class Test is final class
{
	void m1() // not valid bcoz m1 is final method
	{
		System.out.println("m1 is overridden");
	}
}*/


public class FinalClass {

	public static void main(String[] args) {
		

	}

}
