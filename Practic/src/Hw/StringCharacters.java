package Hw;

public class StringCharacters {

	public static void main(String[] args) {
		String a = "This is Java programming language";
		int b = a.replace("a", "").length();
		int count  = a.length()-b;
		System.out.println("The length of String is : " + a.length());
		System.out.println("The occurence of character \"a\" : " + count);

	}

}
