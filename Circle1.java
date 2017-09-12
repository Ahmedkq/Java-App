
public class Circle1 extends GeometricObject1 implements Comparable {
	private double radius;

	public Circle1() {
		this.radius = 0;
	}

	public Circle1(double radius) {
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

	@Override
	public boolean isEquals(GeometricObject1 go) {
		// TODO Auto-generated method stub
		if (this.getArea() == go.getArea()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isLess(GeometricObject1 go) {
		if (this.getArea() < go.getArea()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isGreater(GeometricObject1 go) {

		if (this.getArea() > go.getArea()) {
			return true;
		} else {
			return false;
		}
	}

}
