
public class Main {

	public static void main(String[] args) {
		//Car car1 = new Car();//Referans = Obje
		
		String s1 = new String("Mustafa");
		String s2 = new String("Mustafa");
		
		/*if(s1 == s2) {
			System.out.println("E�it");
		}else {
			System.out.println("E�it De�il");//2 tane referans oldu�u ve ikisi ayr� objeleri ele ald�klar� i�in e�it say�lmazlr /////De�erleri bulmak i�in EQUALS kullan�l�r
		}*/
		if(s1.equals(s2)) {
			System.out.println("E�it");
		}else {
			System.out.println("E�it De�il");
		}
		
		Car car1 = new Car("G�m��", "Renault Megane", 1.80, 4);
		Car car2 = new Car();
		Car car3 = new Car("Siyah", "Mercedes");
		
		/*car1.setColor("G�m��");
		car1.setModel("Renault Megane");
		car1.setEngine(1.60);
		car1.setDoors(4);*/
		/*
		System.out.println("Araban�n Rengi : " + car1.getColor());
		System.out.println("Araban�n Modeli : " + car1.getModel());
		System.out.println("Araban�n Motor Hacmi : " + car1.getEngine());
		System.out.println("Araban�n Kap� Say�s� : " + car1.getDoors());*/
		
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