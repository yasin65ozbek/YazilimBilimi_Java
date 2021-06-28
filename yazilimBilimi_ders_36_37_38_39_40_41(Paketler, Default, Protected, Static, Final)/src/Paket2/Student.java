package Paket2;

public class Student {//public yerine default kullanýlýrsa (class Student) sadece ayný pakatteki classlar eriþilebilir
	//Defaultun privateden farký private dýþardan eriþilemez, default ise sadece ayný pakettekiler eriþebilir baþka paketlerdekiler eriþemez
	//protected eriþim belleyicisi ise sadece miras aldýðý taktirde eriþilebilir direkt olarak eriþilemez
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public void study() {
		System.out.println(this.name + " çalýþýyor...");
	}
}
