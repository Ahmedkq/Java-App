
public class TestShip {

	public static void main(String[] args) {
Ship [] Ship = new Ship[3];
Ship[0] = new Ship("Triumph",1960);
Ship[1] = new CruiseShip("Disney Magic",2400);
Ship[2] = new CargoShip("Black Pearl",50000);

		System.out.println(Ship[0].toString());
		System.out.println(Ship[1].toString());
		System.out.println(Ship[2].toString());
		
	}
}

