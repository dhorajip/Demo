package oopspractice;

public class Ex2 {
	int a;
	int b;
	
	//Method takes parameters 
	void sum(int x, int y)
	{
		a =x;
		b =y;
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		Ex2  cal = new Ex2();
		cal.sum(100, 200);
	
	}

}
