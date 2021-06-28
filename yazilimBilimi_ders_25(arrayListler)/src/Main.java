import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> groups = new ArrayList<String>();
		
		groups.add("Metallica");
		groups.add("Iron Maiden");
		groups.add("Guns'n Roses");
		groups.add("Black Sabbath");
		
		System.out.println("0. indesk : " + groups.get(0));
		System.out.println("1. indesk : " + groups.get(1));
		
		System.out.println("ArrayListUzunluk : " + groups.size());
		
		//groups.remove(1);
		groups.remove("Iron Maiden");
		System.out.println("Black Sabbath'ýn index numarasý: " + groups.indexOf("Black Sabbath"));//ismin sahip olduðu index numarasýný yazdýrýr
		
		for(int i = 0; i < groups.size(); i++) {
			System.out.println(i + ". Eleman : " + groups.get(i));
		}
		
		for(String yazdir:groups){//foreach
			System.out.println("Eleman : " + yazdir);
		}
	}

}
