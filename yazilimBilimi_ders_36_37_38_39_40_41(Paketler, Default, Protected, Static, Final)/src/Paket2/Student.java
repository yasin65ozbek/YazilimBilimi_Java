package Paket2;

public class Student {//public yerine default kullan�l�rsa (class Student) sadece ayn� pakatteki classlar eri�ilebilir
	//Defaultun privateden fark� private d��ardan eri�ilemez, default ise sadece ayn� pakettekiler eri�ebilir ba�ka paketlerdekiler eri�emez
	//protected eri�im belleyicisi ise sadece miras ald��� taktirde eri�ilebilir direkt olarak eri�ilemez
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public void study() {
		System.out.println(this.name + " �al���yor...");
	}
}
