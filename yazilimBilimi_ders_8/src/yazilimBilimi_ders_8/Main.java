package yazilimBilimi_ders_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String varOlanKulAdi = "yasinozbek";
		String varOlanParola = "1234";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kullanýcý adý: ");
		String Kul_adi = scan.nextLine();
		System.out.println("Parola: ");
		String Kul_parola = scan.nextLine();
		
		if(varOlanKulAdi.equals(Kul_adi) && varOlanParola.equals(Kul_parola)) {
			System.out.println("Giriþ Baþarýlý");
		}
		else if(!(varOlanKulAdi.equals(Kul_adi)) &&  !(varOlanParola.equals(Kul_parola))) {
			System.out.println("Kullanýcýadý ve parola yanlýþ");
		}
		else if(!(varOlanKulAdi.equals(Kul_adi)) &&  (varOlanParola.equals(Kul_parola))) {
			System.out.println("Kullanýcýadý yanlýþ");
		}
		else if(!(varOlanKulAdi.equals(Kul_adi)) &&  !(varOlanParola.equals(Kul_parola))) {
			System.out.println("Kullanýcý adý ve parola yanlýþ");
		}
		else if((varOlanKulAdi.equals(Kul_adi)) &&  !(varOlanParola.equals(Kul_parola))) {
			System.out.println("parola yanlýþ");
		}
		else {
			System.out.println("Kullanýcýadý veya parola yanlýþ");
		}
	}

}
