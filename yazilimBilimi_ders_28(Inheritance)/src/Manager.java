
public class Manager extends Employee{
	
	private int num_of_employees;//sorumlu oldu�u �al��an say�s�

	public Manager(String name, String department, int salary, int num_of_employees) {
		super(name, department, salary);
		this.num_of_employees = num_of_employees;
	}
	
	public void raiseSalary(int amount) {//maa� y�kselt
		System.out.println("�al��anlara " + amount + " TL zam yap�ld�.");
	}

	@Override
	public void showInfos() {// var olan yap�y� bozmadan bir �zellik ya da eklenti eklendi
		/*System.out.println("Bilgiler...");
		System.out.println("�sim : " + getName());
		System.out.println("Departman : " + getDepartment());
		System.out.println("Maa� : " + getSalary()); bunlar� ayn� �ekilde yazmak yerine super.showInfos()* ile ayn� i�lemleri �a��rabiliyoruz*/
		
		super.showInfos();
		System.out.println("�al��an say�s� : " + this.num_of_employees);
	}

	@Override
	public String toString() {
		return "Manager Objesi";//Manager@7637f22 yerine Manager Objesi diye yazd�r�r
	}
	
	

}
