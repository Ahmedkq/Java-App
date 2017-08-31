
public class Truck extends Automobile {

	protected double towCapacity;

	public Truck() {
		super();
	}

	public Truck(int year, double weight, String licensePlate, String make, double towCapacity) {
		super(year, weight, licensePlate, make);

		this.towCapacity = towCapacity;
	}

	public double getTowCapacity() {
		return towCapacity;
	}

	public void setTowCapacity(double towCapacity) {
		this.towCapacity = towCapacity;
	}

	public String toString() {

		return super.toString() + " Tow Capacity: " + towCapacity + "";
	}

}