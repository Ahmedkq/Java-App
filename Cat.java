public class Cat extends Animal{
	String color;
	
	public Cat(String breed,  int age, String name, String color) {
		super(breed,name,age);
		this.color= color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color= color;
	}
	public void makeNoise() {
		System.out.println("meow");
	}
	public void jump() {
		System.out.println("*jingle*");
	}
}