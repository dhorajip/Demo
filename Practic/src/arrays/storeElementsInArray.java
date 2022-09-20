package arrays;

public class storeElementsInArray {

	public static void main(String[] args) {
int a[]=new int[5]; //declaration od array with 5 elements
		
		//store elements into array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//read elements from an array in for loop
		for(int i=0; i<=4; i++)
		{
		System.out.println(a[i]);
		}
		
		//for..each loop
		for(int i:a)
		{
			System.out.println(i);
		}

	}

}
