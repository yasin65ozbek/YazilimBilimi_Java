package yazilimBilimi_ders_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String varOlanKulAdi = "yasinozbek";
		String varOlanParola = "1234";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kullan�c� ad�: ");
		String Kul_adi = scan.nextLine();
		System.out.println("Parola: ");
		String Kul_parola = scan.nextLine();
		
		if(varOlanKulAdi.equals(Kul_adi) && varOlanParola.equals(Kul_parola)) {
			System.out.println("Giri� Ba�ar�l�");
		}
		else if(!(varOlanKulAdi.equals(Kul_adi)) &&  !(varOlanParola.equals(Kul_parola))) {
			System.out.println("Kullan�c�ad� ve parola yanl��");
		}
		else if(!(varOlanKulAdi.equals(Kul_adi)) &&  (varOlanParola.equals(Kul_parola))) {
			System.out.println("Kullan�c�ad� yanl��");
		}
		else if(!(varOlanKulAdi.equals(Kul_adi)) &&  !(varOlanParola.equals(Kul_parola))) {
			System.out.println("Kullan�c� ad� ve parola yanl��");
		}
		else if((varOlanKulAdi.equals(Kul_adi)) &&  !(varOlanParola.equals(Kul_parola))) {
			System.out.println("parola yanl��");
		}
		else {
			System.out.println("Kullan�c�ad� veya parola yanl��");
		}
	}

}
