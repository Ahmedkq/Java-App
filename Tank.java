
public class Tank extends Vehicle {

	protected double armorwidth;

	public Tank() {
		super();
	}

	public Tank(int year, double weight, double armorwidth) {
		super(year, weight);

		this.armorwidth = armorwidth;

	}

	public double getArmorWidth() {
		return armorwidth;
	}

	public void setarmorwidth(double armorwidth) {
		this.armorwidth = year;
	}

	public String toString() {

		return "Tank: " + super.toString() + " Armor Width: " + armorwidth;

	}
}
