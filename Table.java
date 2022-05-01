import java.util.Scanner;

public class Table {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a Number: ");
		int a = s.nextInt();
		for(int i=1; i<=10; i++) {
			int b = i;
			int c = a*b;
			System.out.println(a+ " * "+ i +" = "+ c);
		}

	}

}
