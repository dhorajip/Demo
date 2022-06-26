package OOPS;

public class PaintThings {
	public static void main(String args[]) {

		// Creating objects through upcasting
		Paint paint = new Paint(350);
		Shape sphere = new Sphere(15);
		Shape rectangle = new Rectangle(20, 35);
		Shape cylinder = new Cylinder(10, 30);

		
		//calling methods
		paint.amount(sphere);
		paint.amount(rectangle);
		paint.amount(cylinder);

	}

}