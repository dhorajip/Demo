package OOPS;

class Rectangle extends Shape {
	int length, width;

	// Constructor to initialize values
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
		this.setShapeName("sphere");
	}

	@Override
	public double area() {
		return length * width;
	}

}
