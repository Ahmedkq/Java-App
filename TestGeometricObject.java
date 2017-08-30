public class TestGeometricObject {

	public static void main(String[] args) {

		GeometricObject GO = new GeometricObject();
		Circle CO = new Circle(4);
		Rectangle RO = new Rectangle(5, 5);
		
		System.out.println("Circle :");
		System.out.println(CO.toString());
		System.out.println("Its Area: " + CO.getArea());
		System.out.println("Its Perimeter: " + CO.getPerimeter());
System.out.println("Date Created :" + GO.getDateCreated());
		System.out.println();
		System.out.println();

		System.out.println("Rectangle :");
		System.out.println(RO.toString());
		System.out.println("Its Area: " + RO.getArea());
		System.out.println("Its Perimeter: " + RO.getPerimeter());
		System.out.println("Date Created :" + GO.getDateCreated());

	}

}
