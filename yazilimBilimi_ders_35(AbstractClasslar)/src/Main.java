//Abstract = interface ve inheritance birleþimidir. hem gövdesiz metodlar hem de normal metodlar yazýlabilir
//abstractlerde newlenemezler
public class Main {

	public static void main(String[] args) {
		AbstractDatabase abstractDatabase1 = new MysqlDatabase();
		AbstractDatabase abstractDatabase2 = new MongoDatabase();
		
		MongoDatabase mongo = new MongoDatabase();
		abstractDatabase1.add();
		abstractDatabase2.add();
		abstractDatabase1.update();
		abstractDatabase2.update();
	}

}
