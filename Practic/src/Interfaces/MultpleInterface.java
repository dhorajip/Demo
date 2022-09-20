package Interfaces;

interface A1 {
	int a = 10;

	void display();
}

interface B1 {
	int b = 20;

	void show();
}

public class MultpleInterface implements A1, B1 {
	public void display() {
		System.out.println(a);
	}

	public void show() {
		System.out.println(b);
	}

	public static void main(String[] args) {

		MultpleInterface me = new MultpleInterface();
		me.display();
		me.show();

	}

}
