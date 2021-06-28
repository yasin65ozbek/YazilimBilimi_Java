
public class Manager extends Employee{
	
	private int num_of_employees;//sorumlu olduðu çalýþan sayýsý

	public Manager(String name, String department, int salary, int num_of_employees) {
		super(name, department, salary);
		this.num_of_employees = num_of_employees;
	}
	
	public void raiseSalary(int amount) {//maaþ yükselt
		System.out.println("Çalýþanlara " + amount + " TL zam yapýldý.");
	}

	@Override
	public void showInfos() {// var olan yapýyý bozmadan bir özellik ya da eklenti eklendi
		/*System.out.println("Bilgiler...");
		System.out.println("Ýsim : " + getName());
		System.out.println("Departman : " + getDepartment());
		System.out.println("Maaþ : " + getSalary()); bunlarý ayný þekilde yazmak yerine super.showInfos()* ile ayný iþlemleri çaðýrabiliyoruz*/
		
		super.showInfos();
		System.out.println("Çalýþan sayýsý : " + this.num_of_employees);
	}

	@Override
	public String toString() {
		return "Manager Objesi";//Manager@7637f22 yerine Manager Objesi diye yazdýrýr
	}
	
	

}
