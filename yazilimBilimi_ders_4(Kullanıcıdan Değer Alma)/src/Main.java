import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Bir say� giriniz: ");
		//int sayi = scan.nextInt(); 
		//System.out.println("Say� = " + sayi);
		
		System.out.println("Kullan�c ad�n�z� giriniz");
		String kullaniciadi = scan.nextLine();
		System.out.println("Kullan�c� ad�n�z : " + kullaniciadi);
	}

}
