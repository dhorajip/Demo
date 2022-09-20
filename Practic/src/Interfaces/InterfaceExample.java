package Interfaces;

interface Testinter {
	int a = 10;// bydefault variable is static and final

	void display();// abstact method
}

public class InterfaceExample implements Testinter {
	public void display() {
		System.out.println(a);

	}

	public static void main(String[] args) {

		InterfaceExample ie = new InterfaceExample();
		ie.display();

	}
}
