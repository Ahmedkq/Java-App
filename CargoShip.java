public class CargoShip extends Ship {

	protected int Cargocapacity;

	public CargoShip() {
		super();
	}

	public CargoShip(String name, int Cargocapacity) {
		super(name);
		this.Cargocapacity = Cargocapacity;
	}

	public int getCargocapacity() {
		return Cargocapacity;
	}

	public void setCargocapacity(int Cargocapacity) {
		this.Cargocapacity = Cargocapacity;
	}

	public String toString() {
		return " Name: " + getName() + "\n Cargo capacity: " + Cargocapacity +
				"\n------------------------";
	}

}