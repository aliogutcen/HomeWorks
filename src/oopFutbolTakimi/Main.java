package oopFutbolTakimi;

import java.util.ArrayList;

import oopGurayHocaOdevi.Yonetici;

public class Main {

	public static void main(String[] args) {
		
		//String isim, String formaNumarasi, String mevki, int yas, int bonservis
		ArrayList<Futbolcu> futbolcular = new ArrayList<>();
		Futbolcu futbolcu=new Futbolcu("Kerem", "45", "Forvet", 20, 1000);
		Futbolcu futbolcu1=new Futbolcu("Mert", "25", "Forvet", 21, 500);
		Futbolcu futbolcu2=new Futbolcu("Ali", "4", "OrtaSaha", 25, 750);
		Futbolcu futbolcu3=new Futbolcu("Berkan", "24", "OrtaSaha", 23, 421);

		futbolcular.add(futbolcu);
		futbolcular.add(futbolcu1);
		futbolcular.add(futbolcu2);
		futbolcular.add(futbolcu3);
		
		futbolcu.yetenekliMiKontrolEt();
		futbolcu.bonservisHesapla();
		futbolcu.yeteneksizFutbolcuGelistirme();
		futbolcu.antrenmanaCik();
		futbolcu.macaCik();
		futbolcu.sampiyonlukKutla();
			
		ArrayList<TeknikEkip> teknikEkipListesi = new ArrayList<>();
		TeknikEkip ekip= new TeknikEkip("Fatih", "Antrenor");
		TeknikEkip ekip1= new TeknikEkip("Mustafa", "Yardımcı Antrenor");
		TeknikEkip ekip2= new TeknikEkip("Kerem", "Masör");
		TeknikEkip ekip3= new TeknikEkip("Buğra", "İstatikçi");
		
		teknikEkipListesi.add(ekip);
		teknikEkipListesi.add(ekip1);
		teknikEkipListesi.add(ekip2);
		teknikEkipListesi.add(ekip3);
		
		
		ekip.antrenmanAyarla();
	// ekip1.antrenmanAyarla(); antrenman ayarlayıp ayarlayamadıgını kontrol etme
		ekip.antrenmanaCik();
		ekip.macaCik();
		ekip.sampiyonlukKutla();
		
		
		ArrayList<Yonetim> yoneticiler = new ArrayList<>();
		Yonetim yonetici1=new Yonetim("Burak", "Başkan");
		Yonetim yonetici2=new Yonetim("Melisa", "Yardımcı");
		Yonetim yonetici3=new Yonetim("Hakkı", "Basın Sözcüsü");
		
		yoneticiler.add(yonetici1);
		yoneticiler.add(yonetici2);
		yoneticiler.add(yonetici3);
		
		yonetici1.borcEkle();
		yonetici2.borcEkle();
		yonetici1.borcOdemeGunu();
		yonetici1.sampiyonlukKutla();
	}

}
