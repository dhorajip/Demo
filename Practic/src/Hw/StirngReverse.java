package Hw;

public class StirngReverse {

	public static void main(String[] args) {
		String a = reverse("This is Java course");
		System.out.println(a);
	}
	public static String reverse(String s) {
		char letters[] = new char[s.length()];
		int lettersindex = 0;
		
		for(int i = s.length()-1; i>=0; i--) {
			letters[lettersindex] = s.charAt(i);
			lettersindex++;
		}
		String reverse = "";
		for(int i=0; i<s.length();i++) {
			reverse=reverse+letters[i];
		}
		return reverse;
	}

}
