package homework;
import java.util.Scanner;
public class Firstweekhomework003 {

public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
		//Odev 3 
		// 1- Toplama
		// 2- Çıakrma
		// 3- Çarpma
		// 4- Bölme

		//Hangi işlemi yapmak isterseniz (1)

		// iki tane sayı girin (5,10)

		// 2 sayı kullanıcıdan alınız		
		// 1 se iki sayıyı topla
		// 2 ise 2 sayıyı çıkar vb
			
	System.out.println("Hoşgeldiniz");	
	System.out.println("1-TOPLAMA");
	System.out.println("2-ÇIKARMA");
	System.out.println("3-ÇARPMA");
	System.out.println("4-BÖLME");

		System.out.print("yapmak istediğiniz işlemi seçiniz= ");
			int secim= scanner.nextInt();
			
		System.out.print("İlk sayıyı giriniz= ");
			float sayi1= scanner.nextFloat();
		System.out.print("İkinci sayıyı giriniz= ");
			float sayi2= scanner.nextFloat();

	float sonuc;

	if(secim==1) {
	sonuc= sayi1+sayi2;
	}else if (secim==2) {
		sonuc=sayi1-sayi2;
	}else if(secim==3) {
		sonuc=sayi1*sayi2;
	}else {
		sonuc=(sayi1/sayi2);
	}
	
		System.out.println("İşlemin sonucu= "+ sonuc);
		scanner.close();
	}
}
