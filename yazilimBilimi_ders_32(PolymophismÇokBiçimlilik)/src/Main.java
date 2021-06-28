//Polymorphism var olan koda dokunmadan bir�eyler eklemek i�in kullan�l�r var olan yap�y� de�i�timemeliyiz yaz�l�m kararl� bir yazz�l�m olmal�d�r
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
		System.out.println("Hayvan Konu�uyor");
	}

}
//---------------------------------------------------------------

class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(getName() + " �t�yor...");
	}
	
}
class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(getName() + " havl�yor...");
	}
	
	
}
class Horse extends Animal{

	public Horse(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(getName() + " ki�niyor...");
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Hayvan");
		Bird bird = new Bird("Limon");
		Dog dog = new Dog("Karaba�");
		Horse horse = new Horse("�ore�");
		
		Animal animal2 = new Bird("Limon");//hayvan konu�uyor yerine limon �t�yor yazar
		
		animal2.speak();
		/*animal.speak();
		bird.speak();
		dog.speak();
		horse.speak();*/
	}

}
