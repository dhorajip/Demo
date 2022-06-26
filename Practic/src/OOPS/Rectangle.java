package OOPS;

class Rectangle extends Shape {
	int length, width;

	// Constructor to initialize values
	public Rectangle(int length, int width) {
		
		this.length = length;
		this.width = width;
		this.setShapeName("rectangle");
	}

	@Override
	public double area() {
		return length * width;
	}

}
