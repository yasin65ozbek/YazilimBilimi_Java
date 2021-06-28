//Benzeyen classlar varsa ana bir base class olur içerisinde ortak veriler tanýmlanýr

public class Main {//Kalýtým - Miras bir class'ýn baþka bir class'tan fields'larýný(özelliklerini) ya da metodlarýný miras alma anlamýna gelir
	
	//Bir þirkette yönetici ve personel alaný var ise yönetici ve personelde ortak alanlarý bir classta toplanýp inherit edilerek çaðýrlýr id veya adsoyad gibi ortak özellikler
	public static void main(String[] args) {
		Employee employee = new Employee("Yasin ÖZBEK", "Biliþim", 3000);
		//employee.showInfos();
		
		Manager manager = new Manager("Yasin ÖZBEK", "Biliþim", 4000, 10);
		/*manager.showInfos();
		manager.raiseSalary(100);*/
		
		
		System.out.println(manager.toString());//"System.out.println(manager)" ile ayný anlama gelir
		
		
		
		
		
		
		
		

		Employee employee1 = new Manager("Yasin ÖZBEK", "Biliþim", 2000, 10);//bur bir polymorphism(Çok biçimlilik)'dir employee1 artýk manager gibi davranacak 
		
		employee.showInfos();
		
		
	}

}
