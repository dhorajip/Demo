package OOPS;

public class PaintThings {
	public static void main(String args[]) {

		// Creating objects through upcasting
		Paint paintobject = new Paint(350);
		Shape sphere = new Sphere(15);
		Shape rectangle = new Rectangle(20, 35);
		Shape cylinder = new Cylinder(10, 30);

		
		//calling methods
		paintobject.calculateAmount(sphere);
		paintobject.calculateAmount(rectangle);
		paintobject.calculateAmount(cylinder);

	}

}