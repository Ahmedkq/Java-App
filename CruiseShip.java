
	public class CruiseShip extends Ship {
		
	protected int Maxpassengers;

	public CruiseShip() {
		super();
	}
		CruiseShip(String name, int Maxpassengers){
			super(name);
			this.Maxpassengers = Maxpassengers;
		}
		
		
		public int getMaxpassengers() {
			return Maxpassengers;
		}

		public void setMaxpassengers(int Maxpassengers) {
			this.Maxpassengers = Maxpassengers;
		}
		
		
		public String toString(){
			return " Name: " + getName() + 
					"\n Maximum passengers: " + Maxpassengers +
					"\n------------------------";
		}

		
	
}
