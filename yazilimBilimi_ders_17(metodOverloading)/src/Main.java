
public class Main {
/*Overloading konsepti */
	public static void toplama(int a, int b, int c) {
		System.out.println("Toplamlar�: "+ (a+b+c));
	}
	public static void toplama(int a, int b) {
		System.out.println("Toplamlar�: "+ (a+b));
	}
	public static void toplama(int a, int b, int c, int d) {
		System.out.println("Toplamlar�: "+ (a+b+c+d));
	}
	
	
	

	public static void skorHesapla(String name, int score) {
		System.out.println(name + " isimli oyuncunun puan�: " + score);
	}
	public static void skorHesapla(int score) {
		System.out.println("�simsiz oyuncunun puan�: " + score);
	}
	
	
	public static void main(String[] args) {
		toplama(2,3,5,4);
		skorHesapla("Yasin", 2500);
	}
}