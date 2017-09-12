
public class TestGeometricObject1 {

	public static void main(String[] args) {

		Circle1 co = new Circle1(4);
		Rectangle1 ro = new Rectangle1(5, 5);

		Circle1 co1 = new Circle1(6);
		Rectangle1 ro1 = new Rectangle1(6, 6);

		Circle1 co2 = new Circle1(10);
		Rectangle1 ro2 = new Rectangle1(8, 8);

		if (ro.isLess(co) == true) {

			System.out.println(
					"Circle has Larger Area" + "\nRectangle Area: " + ro.getArea() + "\nCircle Area: " + co.getArea());

		} else if (ro.isLess(co) == false) {
			System.out.println("Rectangle has Larger Area" + "\nRectangle Area: " + ro.getArea() + "\nCircle Area: "
					+ co.getArea());
		}

		System.out.println();

		if (co1.isEquals(ro1) == true) {
			System.out.println("Circle1 has equal area with Rectangle1." + "\nRectangle Area: " + ro1.getArea()
					+ "\nCircle Area: " + co1.getArea());
		} else if (co1.isEquals(ro1) == false) {
			System.out.println("Circle1 and Rectangle1 do not have equal areas" + "\nRectangle Area: " + ro1.getArea()
					+ "\nCircle Area: " + co1.getArea());
		}

		System.out.println();

		if (ro2.isGreater(co2) == true) {
			System.out.println("Rectangle3 has Larger Area" + "\nRectangle Area: " + ro2.getArea() + "\nCircle Area: "
					+ co2.getArea());
		} else if (ro2.isGreater(co2) == false) {
			System.out.println("Circle2 has Larger Area" + "\nRectangle Area: " + ro2.getArea() + "\nCircle Area: "
					+ co2.getArea());
		}

	}

}
