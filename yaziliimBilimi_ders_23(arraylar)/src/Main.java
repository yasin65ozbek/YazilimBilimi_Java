import java.util.Scanner;

public class Main {
	
	public static void mean(int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("Ortalama: " + (double)total / arr.length);
	} 

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		
		System.out.println("Array 1'nin birinci elemaný : " + arr1[1]);
		
		System.out.println("----------");
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("Eleman : " + arr1[i]);
		}
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int[] arr3 = new int[5];
		System.out.println("Array3'ün deðerlerini giriniz...");
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = scanner.nextInt();
		}
		System.out.println("Array3'ün derðerleri yazýlýyor...");
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("Eleman : " + arr3[i]);
		}
		
		mean(arr3);
		*/
		
		
		int[][] arrayimiz = {{10,20,30}, {40,50,60}};
		System.out.println("0'a 0: " + arrayimiz[0][0]);
		System.out.println("1'a 1: " + arrayimiz[1][1]);
	}

}
