package string;

public class StringEx {
	public static void main(String[] args) {

		String s1 = "Welcome";
		String s2 = "To Java";

		System.out.println(s1.length());

		// concatenation
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));

		System.out.println("Welcome" + "To Java");
		System.out.println("Welcome".concat("To Java"));

		s1 = "       Welcome        ";

		System.out.println("Before trimming string is:" + s1);
		System.out.println("After trimming string is:" + s1.trim());

		// charAt()returns character based on index number, index will start from 0

		String s9 = "Welcome";
		System.out.println(s9.charAt(4));

		// contains() always returns true

		s1 = "Welcome";

		System.out.println(s1.contains("Wel"));
		System.out.println(s1.contains("com"));
		System.out.println(s1.contains("wel"));
		System.out.println(s1.contains("xyz"));

		// equals() - comparing strings

		String s3 = "Welcome";
		String s4 = "welcome";

		System.out.println(s3.equals(s4));
		System.out.println(s3.equals("Wel  come"));
		System.out.println(s3.equals("welcome"));

		// equalsIgnoreCase()

		System.out.println(s3.equalsIgnoreCase(s4));

		// replace()

		String s8 = "Welcome to Java";

		System.out.println(s8.replace('e', 'a'));

		System.out.println(s8.replace("Java", "Selenium"));

		// substring()

		String s = "Welcome";

		// 0 1 2 3 4 5 6
		// W E L C O M E
		// 1 2 3 4 5 6 7

		System.out.println(s.substring(1, 3));
		System.out.println(s.substring(2, 4));
		System.out.println(s.substring(4, 7));
		System.out.println(s.substring(0, 3));

		// toLowercase and toUppercase

		String s6 = "WELCOME";
		System.out.println(s6.toLowerCase());

		String s7 = "welcome";
		System.out.println(s7.toUpperCase());
	}
}
