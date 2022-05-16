package Hw;

public class HalfPyramid {

	public static void main(String[] args) {
		int i=0, j=0;
		for(i=0; i<6; i++) {
			for(j=0; j<6; j++) {
				if(j<=i) {
				System.out.print(" * ");
				}
				}
			System.out.println("");
		}

	}

}
