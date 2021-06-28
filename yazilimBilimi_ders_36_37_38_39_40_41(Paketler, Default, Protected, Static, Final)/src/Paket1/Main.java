package Paket1;

import java.util.Scanner;

import Paket2.Student;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student("Yasin ÖZBEK");
		
		student.study();
		
		deneme();//Eðer static þeklinde yazýlmasaydý newlenip obje oluþturulmasý gerekirdi ama static olduðu için baþlangýçta obje oluþturulur 
	}

	
	public static void deneme() {
		System.out.println("Deneme");
	}
}
//Static access modifier(eriþim bellleyici)i program baþlar baþlamaz bellekte bir kere oluþturulur yani newlenmeden çalýþtýrýlabilir

//Final bir kere tanýmlanýr sonrasýnda deðiþtirilemez