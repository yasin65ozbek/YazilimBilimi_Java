
public class MysqlDatabase extends AbstractDatabase{

	@Override
	void update() {
		System.out.println("Mysql g�ncelledi..");
	}

	@Override
	void get() {
		System.out.println("Mysql verileri ald�..");
	}

}
