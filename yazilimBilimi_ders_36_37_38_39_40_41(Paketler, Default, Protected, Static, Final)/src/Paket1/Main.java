package Paket1;

import java.util.Scanner;

import Paket2.Student;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student("Yasin �ZBEK");
		
		student.study();
		
		deneme();//E�er static �eklinde yaz�lmasayd� newlenip obje olu�turulmas� gerekirdi ama static oldu�u i�in ba�lang��ta obje olu�turulur 
	}

	
	public static void deneme() {
		System.out.println("Deneme");
	}
}
//Static access modifier(eri�im bellleyici)i program ba�lar ba�lamaz bellekte bir kere olu�turulur yani newlenmeden �al��t�r�labilir

//Final bir kere tan�mlan�r sonras�nda de�i�tirilemez