
public class Dog extends Animal {
		double weight ;
		
		public Dog(String breed,  int age, String name, double weight) {
			super(breed,name,age);
			this.weight= weight;
		}
	
		public double getweight() {
			return weight;
		}
		
		public void seWeight(double weight) {
			this.weight= weight;
		}
		public void makeNoise() {
			System.out.println("ruff-ruff");
		}
		public void jump() {
			System.out.println("*jingle*");
		}
	}

