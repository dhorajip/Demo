package Interfaces;

interface A {

	int a = 10;

	void display();
}

interface B {

	int b = 20;

	void show();
}

public class MultipleInterfaceEx implements A, B {

	public void display() {
		System.out.println(a);
	}

	public void show() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		MultipleInterfaceEx mi = new MultipleInterfaceEx();
		mi.display();
		mi.show();

	}

}
