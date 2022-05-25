package OOPS;

class Cylinder extends Shape {
	int radius, height;
	public static final double PI = 3.14;

	// Constructor to initialize values
	public Cylinder(int radius, int height) {
		super();
		this.radius = radius;
		this.height = height;
		this.setShapeName("cylinder");
	}

	@Override
	public double area() {
		return PI * radius * radius * height;
	}

}
