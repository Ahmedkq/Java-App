
public class Vehicle {

	protected int year;
	protected double weight;

	public Vehicle() {
		super();
	}

	public Vehicle(int year, double weight) {
		this.year = year;
		this.weight = weight;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getweight() {
		return weight;
	}

	public void setYear(double weight) {
		this.weight = weight;
	}

	public String toString() {
		return "Year: " + year + " Weight: " + weight + "";

	}

}
