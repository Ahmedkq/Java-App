
public class Ship {

	protected String name;
	protected int year;
		
	public Ship() {
		super();
	}
	
		public Ship(String name, int year) {
			this.name = name;
			this.year = year;
		}
		

		public Ship(String name) {
		this.name=name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		
		public String toString(){
			return " Name: " + name + 
					"\n Year made: " + year +
					"\n------------------------";
		}

	}
