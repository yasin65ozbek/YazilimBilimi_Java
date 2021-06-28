
public class Main {

	public static void main(String[] args) {
		//IDatabase database = new IDatabase();//interfaceler newlenemezler obje oluşturamazlar
		Customer customer = new Customer();
		Student student = new Student();
		
		IDatabase database1 = new Customer();//Polymorphism üstteki referansı alttakine atama
		IDatabase database2 = new Student();
		
		
		student.log();
		customer.log();
		System.out.println("\n");
		database1.log();
	}

}
