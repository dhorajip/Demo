package OOPS;

class Sphere extends Shape {
	int radius;
	public static final double PI = 3.14;

	// Constructor to initialize values
	public Sphere(int radius) {
		
		this.radius = radius;
		this.setShapeName("sphere");
	}


	public double area() {
		return 4 * PI * radius * radius;

	}

}
