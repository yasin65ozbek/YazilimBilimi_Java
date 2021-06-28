//Polymorphism var olan koda dokunmadan birþeyler eklemek için kullanýlýr var olan yapýyý deðiþtimemeliyiz yazýlým kararlý bir yazzýlým olmalýdýr
class Animal{
	private String Name;

	public Animal(String name) {
		Name = name;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public void speak() {
		System.out.println("Hayvan Konuþuyor");
	}

}
//---------------------------------------------------------------

class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(getName() + " ötüyor...");
	}
	
}
class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(getName() + " havlýyor...");
	}
	
	
}
class Horse extends Animal{

	public Horse(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(getName() + " kiþniyor...");
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Hayvan");
		Bird bird = new Bird("Limon");
		Dog dog = new Dog("Karabaþ");
		Horse horse = new Horse("Þoreþ");
		
		Animal animal2 = new Bird("Limon");//hayvan konuþuyor yerine limon ötüyor yazar
		
		animal2.speak();
		/*animal.speak();
		bird.speak();
		dog.speak();
		horse.speak();*/
	}

}
