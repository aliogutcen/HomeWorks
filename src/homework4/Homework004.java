package homework4;

import java.util.Locale;

public class Homework004 {

	public static void main(String[] args) {
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

		String[] newSehirler = sehirler.split(";");

		for (int i = 0; i < newSehirler.length; i++) {
			System.out.print(newSehirler[i] + " ");
		}
		System.out.println();
		System.out.println("\n-------------");

		String[] newSehirler2 = new String[newSehirler.length];
		String[] newSehirler3 = new String[newSehirler.length];

		for (int i = 0; i < newSehirler.length; i++) {

			newSehirler2[i] = newSehirler[i].trim().substring(newSehirler[i].indexOf("-") + 1, newSehirler[i].length());
			newSehirler3[i] = newSehirler[i].trim().substring(0, newSehirler[i].indexOf("-"));
			// newSehirler3[i]=newSehirler[i].split("-")[0];
			System.out.println(newSehirler2[i] + " adlı şehrin plaka kodu= " + newSehirler3[i]);
		}

	}
}
