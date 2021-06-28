
public class Car {
	//arabanýn Fields, Properties veya özellikleri
	//private kapsülleme için kullanýlýr
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	public Car(String color, String model) {
		this(color,model,0,0);
	}
	public Car() {
		/*this.color = "Bilgi Yok!";
		this.model = "Bilgi Yok!";
		this.engine = 0;
		this.doors = 0;*/
		this("Bilgi Yok", "Bilgi Yok", 0, 0);
	}
//overloading ayný þeylerin iki kere kullanýlmasýna denir
	public Car(String color, String model, double engine, int doors) {
		this.color = color;
		this.model = model;
		this.engine = engine;
		this.doors = doors;
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public void Start() {
		System.out.println("Araba Çalýþtýrýldý!");
	}
	public void Stop() {
		System.out.println("Araba Durduruldu..!");
	}
	
	public void ShowInfos() {
		System.out.println("Arabanýn Rengi : " + this.color);
		System.out.println("Arabanýn Modeli : " + this.model);
		System.out.println("Arabanýn Motor Hacmi : " + this.engine);
		System.out.println("Arabanýn Kapý Sayýsý : " + this.doors);
	}
}
