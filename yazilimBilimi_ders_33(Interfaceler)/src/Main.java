
public class Main {

	public static void main(String[] args) {
		//IDatabase database = new IDatabase();//interfaceler newlenemezler obje olu�turamazlar
		Customer customer = new Customer();
		Student student = new Student();
		
		IDatabase database1 = new Customer();//Polymorphism �stteki referans� alttakine atama
		IDatabase database2 = new Student();
		
		
		student.log();
		customer.log();
		System.out.println("\n");
		database1.log();
	}

}
