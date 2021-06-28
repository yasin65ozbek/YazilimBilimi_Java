import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Bir sayý giriniz: ");
		//int sayi = scan.nextInt(); 
		//System.out.println("Sayý = " + sayi);
		
		System.out.println("Kullanýc adýnýzý giriniz");
		String kullaniciadi = scan.nextLine();
		System.out.println("Kullanýcý adýnýz : " + kullaniciadi);
	}

}
