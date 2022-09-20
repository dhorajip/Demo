package oopspractice;

public class Ex4 {
	int a;
	int b;
	
	//Method  may not returns any value
	
	void sum()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		Ex4  cal = new Ex4();
		cal.a = 100;
		cal.b =200;
		cal.sum();
	
	}

}
