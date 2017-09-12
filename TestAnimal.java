public class TestAnimal {
	public static void main(String[] args) {
		Dog d = new Dog("Bulldog", 4, "Buddy ", 25);
		Cat c = new Cat("Bengal ", 4, "Toby", "Brown");

		System.out.println("The dog name is " + d.getName());
		System.out.println("he is a " + d.getBreed());
		System.out.println("he is " + d.getAge() + " years old" + " and his weight is " + d.getweight() + " lb.\n");

		d.jump(); d.makeNoise(); d.jump();
		

		System.out.println("\nThe cat name is " + c.getName());
		System.out.println("he is a " + c.getBreed());
		System.out.println("he is " + c.getAge() + " years old" + " and his color is " + c.getColor() + "\n");

		c.jump(); c.makeNoise(); c.jump();
	}
}