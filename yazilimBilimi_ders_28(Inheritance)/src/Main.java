//Benzeyen classlar varsa ana bir base class olur i�erisinde ortak veriler tan�mlan�r

public class Main {//Kal�t�m - Miras bir class'�n ba�ka bir class'tan fields'lar�n�(�zelliklerini) ya da metodlar�n� miras alma anlam�na gelir
	
	//Bir �irkette y�netici ve personel alan� var ise y�netici ve personelde ortak alanlar� bir classta toplan�p inherit edilerek �a��rl�r id veya adsoyad gibi ortak �zellikler
	public static void main(String[] args) {
		Employee employee = new Employee("Yasin �ZBEK", "Bili�im", 3000);
		//employee.showInfos();
		
		Manager manager = new Manager("Yasin �ZBEK", "Bili�im", 4000, 10);
		/*manager.showInfos();
		manager.raiseSalary(100);*/
		
		
		System.out.println(manager.toString());//"System.out.println(manager)" ile ayn� anlama gelir
		
		
		
		
		
		
		
		

		Employee employee1 = new Manager("Yasin �ZBEK", "Bili�im", 2000, 10);//bur bir polymorphism(�ok bi�imlilik)'dir employee1 art�k manager gibi davranacak 
		
		employee.showInfos();
		
		
	}

}
