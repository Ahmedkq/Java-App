class Circle extends GeometricObject {
	private double radius;

	public Circle() {
		this.radius = 0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}

	public double getPerimeter() {
		return 2 * 3.14 * this.radius;
	}

	public double getDiameter() {
		return 2 * this.radius;
	}

}