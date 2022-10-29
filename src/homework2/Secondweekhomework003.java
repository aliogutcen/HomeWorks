package homework2;

import java.util.Scanner;

public class Secondweekhomework003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		int rastGeleSayi = (int) (Math.random() * 100);
		int sayac = 1;
		while (kontrol) {
			System.out.print("Bir sayı tahmin ediniz=");
			int tahmin = scanner.nextInt();

			if (tahmin == rastGeleSayi) {
				System.out.println("Tebrikler tahmininiz doğru!");
				kontrol = false;
				System.out.println(sayac + ". tahmininiz de buldunuz.");
			} else if (tahmin > rastGeleSayi) {
				System.out.println("Yanlış tahmin,tahmininizi azaltınız!");
				sayac++;
			} else {
				System.out.println("Yanlış tahmin,tahmininizi arttırın!");
				sayac++;
			}

		}
	}

}
