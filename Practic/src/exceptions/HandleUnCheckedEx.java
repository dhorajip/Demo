package exceptions;

public class HandleUnCheckedEx {
	public static void main(String[] args) {
		System.out.println("Program is started");
		int a = 20;
		try {
			System.out.println(a / 0); // ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		String s = null;

		try {
			System.out.println(s.length()); // NullPointerException
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Program is in progress");
		System.out.println("Program is comlpeted");

	}
}
