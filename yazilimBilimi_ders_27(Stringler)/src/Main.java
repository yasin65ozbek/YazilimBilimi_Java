
public class Main {

	public static void main(String[] args) {
		String s1 = "Yasin";
		String s1Yedek = "Yasin";
		
		String s2 = new String("Yasin");
		String s2Yedek = new String("Yasin");
		
		if(s1 == s1Yedek){
			System.out.println("s1 ve s1Yedek E��T \n");//s1 ve s2'nin fark� s1 ve s1yedek ayn� objeden veri �eker ama s2 ve s2Yedek farkl� objeden �retildikleri i�in e�it de�iller
		}
		if(s2 == s2Yedek){
			System.out.println("s2 ve s2Yedek E��T \n");//i�eri�in kontrole edilebilmesi i�in s2.equals(s2Yedek) kullan�lmal�d�r
		}
		
		System.out.println(s2.length());
		
		System.out.println("0. index: " + s2.charAt(0));
		System.out.println("5. index: " + s2.charAt(s2.length() - 1));//5. indeks
		
		System.out.println(s2.startsWith("Ya"));//ya ile ba�l�yor mu diye kontrol eder
		System.out.println(s2.endsWith("in"));//in ile bitiyor mu diye kontrol eder
		
		
	}

}