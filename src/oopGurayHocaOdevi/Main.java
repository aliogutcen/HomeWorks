package oopGurayHocaOdevi;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Musteriler> musteriler = new ArrayList<>();
		Musteriler musteri = new Musteriler("Ali Ogutcen", "32125151", 10000, 100000);
		Musteriler musteri1 = new Musteriler("Melihcan Ozturk", "3231151", 5000, 500);
		Musteriler musteri2 = new Musteriler("Kübra Han", "1125121", 2000, 1000);

		// Musterileri ArrayListe ekleme metodu
		musteriler.add(musteri);
		musteriler.add(musteri1);
		musteriler.add(musteri2);

		ArrayList<Calisanlar> calisanlar = new ArrayList<>(); // yonetici ve çalışanı aynı anda arrayliste eklemek için
		Memur memur1 = new Memur("Kaan", "1312515", 1000, false, "Kredi-Onay");
		Yonetici yonetici1 = new Yonetici("Ali", "312151251", 50000, true);
		calisanlar.add(memur1);
		calisanlar.add(yonetici1);

		musteri.krediKartiVarmi();
		musteri.krediSkoruHesapla();

		ArabaKredisi kredi = new ArabaKredisi(0);
		kredi.krediMiktarı(musteri);
		kredi.krediOnay(musteri);
// 		kredi.krediMiktarı(musteri); Aktif bir kredisi varken 2.krediyi alıp alamadığını kontrol etmek için 
		kredi.vade(musteri);
		kredi.krediGeriOdeme(musteri);
		kredi.aylikOdeme(musteri);
		kredi.kalanOdeme(musteri);
		musteri.imzaAt();
		yonetici1.imzaAt();

		IhtiyacKredisi kredi1 = new IhtiyacKredisi(0);
		kredi1.krediMiktarı(musteri);
		kredi1.krediOnay(musteri1);
		// kredi1.krediMiktarı(musteri); Aktif bir kredisi varken 2.krediyi alıp
		// alamadığını kontrol etmek için
		kredi1.vade(musteri1);
		kredi1.krediGeriOdeme(musteri1);
		kredi1.aylikOdeme(musteri1);
		kredi1.kalanOdeme(musteri1);
		musteri.imzaAt();
		yonetici1.imzaAt();
	}

	public void Listele(ArrayList<Musteriler> musteri) {
		for (Musteriler musteriler : musteri) {
			System.out.println("Adı=" + musteriler.getAd() + " Tc kimlik= " + musteriler.getTcNo() + " Maaş= "
					+ musteriler.getMaas());
		}
	}
}
