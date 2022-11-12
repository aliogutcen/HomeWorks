package gurayhocaninodevleri;

import java.util.Scanner;

public class Homework001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hoşgeldiniz");
		System.out.print("Bir sayı giriniz=");
		int i = scanner.nextInt();
		String j = String.valueOf(i);
		for (int a = j.length() - 1; a >= 0; a--) {
			System.out.print(j.charAt(a));
		}
		
		String name="kerem";
		int a= Integer.parseInt(name);
System.out.println(a);
	}

}
