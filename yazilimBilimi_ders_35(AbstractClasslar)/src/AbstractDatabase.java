 
public abstract class AbstractDatabase {
	public void add() {
		System.out.println("Eklendi...");
	}
	public void delete() {
		System.out.println("Silindi...");
	}
//add ve delete fonksiyonlarý ortak olduðu için burada tanýmlanabilirler ama update ve get fonksiyonlarý deðiþebilir olduðu için zorunlu kullanýmý vardýr 
	abstract void update();//bu abstractlar kullanýldýklarý yerde yazýlmak ve tanýmlanmak zorundalar
	abstract void get();
}
