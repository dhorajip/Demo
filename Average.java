import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any three numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = (a+b+c)/3;
		System.out.println("The Average of the number is: " + d);
	}

}
