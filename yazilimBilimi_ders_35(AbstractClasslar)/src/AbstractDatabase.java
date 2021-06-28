 
public abstract class AbstractDatabase {
	public void add() {
		System.out.println("Eklendi...");
	}
	public void delete() {
		System.out.println("Silindi...");
	}
//add ve delete fonksiyonlar� ortak oldu�u i�in burada tan�mlanabilirler ama update ve get fonksiyonlar� de�i�ebilir oldu�u i�in zorunlu kullan�m� vard�r 
	abstract void update();//bu abstractlar kullan�ld�klar� yerde yaz�lmak ve tan�mlanmak zorundalar
	abstract void get();
}
