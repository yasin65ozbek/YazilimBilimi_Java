
public class MongoDatabase extends AbstractDatabase{

	@Override
	void update() {
		System.out.println("Mongo g�ncelledi..");
	}

	@Override
	void get() {
		System.out.println("Mongo verileri ald�..");
	}

}
