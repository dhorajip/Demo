package Hw;

public class HollowInvertedHalfPyramid {

	public static void main(String[] args) {
		int i=0, j=0;
		for(i=6; i>0; i--) 
		{
			if(i==1 || i==6) 
			{
			for(j=1; j<=i; j++) 
			{
				System.out.print("*");
			}
			}
			else {
				for(int k=1; k<=i; k++) {
				if(k==1 || k==i) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
				}
			}
			System.out.println();
			}
		}
	}



