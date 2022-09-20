package arrays;

public class singleDimensionalString {

	public static void main(String[] args) {
		String s[] = new String[3];

		s[0] = "Welcome";
		s[1] = "to";
		s[2] = "single dimensional String for Array";
		 // return length of an array
		System.out.println(s.length);

		for (String i : s) {
			System.out.println(i);
		}
	}

}
