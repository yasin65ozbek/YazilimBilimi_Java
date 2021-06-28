
public class Main {

	public static void main(String[] args) {
		String s1 = "Yasin";
		String s1Yedek = "Yasin";
		
		String s2 = new String("Yasin");
		String s2Yedek = new String("Yasin");
		
		if(s1 == s1Yedek){
			System.out.println("s1 ve s1Yedek EÞÝT \n");//s1 ve s2'nin farký s1 ve s1yedek ayný objeden veri çeker ama s2 ve s2Yedek farklý objeden üretildikleri için eþit deðiller
		}
		if(s2 == s2Yedek){
			System.out.println("s2 ve s2Yedek EÞÝT \n");//içeriðin kontrole edilebilmesi için s2.equals(s2Yedek) kullanýlmalýdýr
		}
		
		System.out.println(s2.length());
		
		System.out.println("0. index: " + s2.charAt(0));
		System.out.println("5. index: " + s2.charAt(s2.length() - 1));//5. indeks
		
		System.out.println(s2.startsWith("Ya"));//ya ile baþlýyor mu diye kontrol eder
		System.out.println(s2.endsWith("in"));//in ile bitiyor mu diye kontrol eder
		
		
	}

}