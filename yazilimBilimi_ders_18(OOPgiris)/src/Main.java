
public class Main {

	public static void main(String[] args) {
		//Car car1 = new Car();//Referans = Obje
		
		String s1 = new String("Mustafa");
		String s2 = new String("Mustafa");
		
		/*if(s1 == s2) {
			System.out.println("Eþit");
		}else {
			System.out.println("Eþit Deðil");//2 tane referans olduðu ve ikisi ayrý objeleri ele aldýklarý için eþit sayýlmazlr /////Deðerleri bulmak için EQUALS kullanýlýr
		}*/
		if(s1.equals(s2)) {
			System.out.println("Eþit");
		}else {
			System.out.println("Eþit Deðil");
		}
		
		Car car1 = new Car("Gümüþ", "Renault Megane", 1.80, 4);
		Car car2 = new Car();
		Car car3 = new Car("Siyah", "Mercedes");
		
		/*car1.setColor("Gümüþ");
		car1.setModel("Renault Megane");
		car1.setEngine(1.60);
		car1.setDoors(4);*/
		/*
		System.out.println("Arabanýn Rengi : " + car1.getColor());
		System.out.println("Arabanýn Modeli : " + car1.getModel());
		System.out.println("Arabanýn Motor Hacmi : " + car1.getEngine());
		System.out.println("Arabanýn Kapý Sayýsý : " + car1.getDoors());*/
		
		car1.ShowInfos();
		System.out.println("--------------------");
		car2.ShowInfos();
		System.out.println("--------------------");
		car3.ShowInfos();
		System.out.println("--------------------");
		car1.Start();
		car1.Stop();
	}

}