package operatorsInJava;

public class OperatorsEx {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// Arithmetic operators --> + - * /%

		System.out.println(".....Arithmetic operators.....");
		System.out.println("Sum of a and b is : " + (a + b));
		System.out.println("Diff of a and b is : " + (b - a));
		System.out.println("Mul of a and b is : " + (a * b));
		System.out.println("Div of a and b is : " + (a / b));
		System.out.println("Mod of a and b is : " + (a % b));

		// Relational Operators(Comparison Operators) --> == < > <= >= !=
		// Always return boolean value --> yes or no, true or false

		System.out.println(".....Relational operators.....");
		System.out.println(a == b); // false
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a >= b); // false
		System.out.println(a <= b); // true
		System.out.println(a != b); // true

		// Logical Operators --> && || !
		// Works between two boolean values

		boolean x = true;
		boolean y = false;

		System.out.println(".....Logical operators.....");
		System.out.println(x && y); // false
		System.out.println(x || y); // true
		System.out.println(!x); // false
		System.out.println(!y); // true

		// Increment or Decrement operators ++ --

		a = 10;
		a++; // a= a+1
		System.out.println("Increment operator");
		System.out.println(a); // 11

		b = 20;
		b--; // b= b-1
		System.out.println("Decrement operator");
		System.out.println(b); // 19
	}
}
