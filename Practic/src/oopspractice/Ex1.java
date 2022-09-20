package oopspractice;

public class Ex1 {
	int a;
	int b;

	void sum() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Ex1 cal = new Ex1();
		cal.a = 100;
		cal.b = 200;
		cal.sum();

	}
}
