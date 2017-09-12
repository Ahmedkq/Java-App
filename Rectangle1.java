class Rectangle1 extends GeometricObject1 implements Comparable {
	private double width;
	private double height;

	public Rectangle1() {
		this.width = 0;
		this.height = 0;
	}

	public Rectangle1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return this.height * this.width;
	}

	public double getPerimeter() {
		return 2 * (this.height + this.width);
	}

	public boolean isEquals(GeometricObject1 go) {
		if (this.getArea() == go.getArea()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isGreater(GeometricObject1 go) {
		if (this.getArea() > go.getArea()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isLess(GeometricObject1 go) {
		if (this.getArea() < go.getArea()) {
			return true;
		} else {
			return false;
		}
	}
}