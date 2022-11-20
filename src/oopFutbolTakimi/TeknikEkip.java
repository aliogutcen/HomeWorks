package oopFutbolTakimi;

import java.util.Random;

public class TeknikEkip  extends FutbolTakimi implements ITakimYonetimi{
	static Random rastgele= new Random();
	private String adi;
	private String gorevi;
	public TeknikEkip(String adi, String gorevi) {
		super("Galatasaray");
		this.adi = adi;
		this.gorevi = gorevi;
	}

	
	
	
	public String getAdi() {
		return adi;
	}




	public void setAdi(String adi) {
		this.adi = adi;
	}




	public String getGorevi() {
		return gorevi;
	}




	public void setGorevi(String gorevi) {
		this.gorevi = gorevi;
	}

	public void antrenmanAyarla() {
		if(getGorevi().equalsIgnoreCase("Antrenor")) { 
		int gun=0;
		for(int i=0;i<7;i++) {
			if(i%2==0)
			System.out.println("Antrenman Ayarlanmıştır.\nHaftanın "+gun+1+".günü ");
			else
				System.out.println("Bugün antrenman yoktur.");
		}
		}
		else
			System.out.println("Antrenman ayarlama yetkisi yoktur");
	}
	
	@Override
	public void sampiyonlukKutla() {
		System.out.println(getAdi()+"isimli teknip ekipteki kişi şampiyonluk kutlamlarına katıldı");
		
	}


	@Override
	public void antrenmanaCik() {
		for(int i=0; i<7;i++) {	
			if(i==0|| i==2|| i==4 ||i==6) {
				System.out.println(getAdi()+"isimli ekibin antrenmana çıktı.");
			}
			else
				System.out.println("Bugün ekibin dinlenme günü");
		}
		
	}


	@Override
	public void macaCik() {
		if(getGorevi().equalsIgnoreCase("Antrenor")) {
			int gunKontrol=rastgele.nextInt(0,2);
			if(gunKontrol==1) {
				System.out.println("Maça çıkmaya hazırsınız");
		}else
			System.out.println("Bugün maç yok");
	}
		else
			System.out.println("Maça gitmenize gerek yok");
		}
		
	}
	
	

