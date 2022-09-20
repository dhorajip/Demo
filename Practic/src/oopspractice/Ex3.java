package oopspractice;

public class Ex3 {
	int a;
	int b;

	// Method returns some value

	int sum() {
		return (a + b);
	}

	public static void main(String[] args) {
		Ex3 cal = new Ex3();
		cal.a = 100;
		cal.b = 200;
		int r = cal.sum();
		System.out.println(r);

	}
}
