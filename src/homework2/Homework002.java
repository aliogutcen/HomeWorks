package homework2;

import java.util.Scanner;

public class Homework002 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hoşgeldiniz !!");
		System.out.print("Lütfen Bir Kelime Giriniz= ");
		String word = scanner.nextLine();

		System.out.println("Lütfen yapmak istediğiniz işlemi aşağıdan seçiniz");
		System.out.println("1- Kelimeyi büyük harf yap");
		System.out.println("2- Kelimeyi küçük harf yap");
		System.out.println("3- Kelimenin harflerinin arasına ? koy");
		System.out.println("4- Kelimenin başındaki ve sonundaki boşlukları silin");
		System.out.println("5- Kelimenin içindeki bütün a harflerini ? ile değiştirin");
		System.out.println("6- Kelimenin ilk üç indexini alıp sonuna ... koyun");
		int secim = scanner.nextInt();

		switch (secim) {
		case 1:
			word = word.toUpperCase();
			System.out.println("Kelimeniz= " + word);
			break;
		case 2:
			word = word.toLowerCase();
			System.out.println("Kelimeniz= " + word);
			break;
		case 3:
			for (int i = 0; i <= word.length() - 1; i++) {
				if (i < word.length() - 1) {
					System.out.print(word.charAt(i) + "?");
				} else
					System.out.println(word.charAt(i));
			}
			break;
		case 4:
			word = word.trim();
			System.out.println("Kelimeniz=" + word);
			break;
		case 5:
			word = word.replaceAll("a", "?");
			System.out.println("Kelimeniz=" + word);
			break;
		case 6:
			System.out.println(word.substring(0, 3) + word.replaceAll(word, "..."));
			break;
		default:
			System.out.println("Lütfen 1-6 arasında bir seçim yapınız!!!");
			break;
		}
	}

}
