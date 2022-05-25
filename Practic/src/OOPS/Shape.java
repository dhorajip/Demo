package OOPS;

abstract class Shape {
	private String shapeName;

	abstract double area();

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	// tostring method
	@Override
	public String toString() {
		return "Shape [shapeName=" + shapeName + "]";
	}

	// Getters and Setters
	public String getShapeName() {
		return shapeName;
	}

}