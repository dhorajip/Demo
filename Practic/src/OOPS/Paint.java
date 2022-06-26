package OOPS;

public class Paint {
	int coverage;

	public Paint(int coverage) {
		this.coverage = coverage;
	}

	public void amount(Shape shape) {

		double paintneeded = shape.area() / coverage;
		double rounded = Math.round(paintneeded * 100) / 100.0;
		// System.out.println(shape);
		System.out.println("The amount of paint needed " + shape + " = " + rounded);
		System.out.println("----------------------------------------------------------------------------");
	}

}
