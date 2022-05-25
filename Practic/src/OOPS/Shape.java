package OOPS;

abstract class Shape {
	String shapeName;

	abstract double area();

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	// tostring method
	@Override
	public String toString() {
		return "for Shape : " + shapeName ;
	}

	
}