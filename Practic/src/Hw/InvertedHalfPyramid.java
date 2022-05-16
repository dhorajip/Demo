package Hw;

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		int i=0, j=0;
		for(i=6; i>0; i--) {
			for(j=6; j>0; j--) {
				if(j<=i) {
				System.out.print(" * ");
				}
				}
			System.out.println("");
		}

	}

	}


