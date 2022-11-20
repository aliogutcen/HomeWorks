package oopFutbolTakimi;

import java.util.Random;
import java.util.Scanner;

public class Futbolcu extends FutbolTakimi implements ITakimYonetimi {
	static Random rastgele =new Random();
	static Scanner scanner=new Scanner(System.in);
	private String isim;
	private String formaNumarasi;
	private String mevki;
	private int yas;
	private boolean sakatMi;
	private int bonservis;
	private boolean yetenekliMi;
	
	public Futbolcu(String isim, String formaNumarasi, String mevki, int yas, int bonservis) {
		super("Galatasaray");
		this.isim = isim;
		this.formaNumarasi = formaNumarasi;
		this.mevki = mevki;
		this.yas = yas;
		this.bonservis = bonservis;	
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getFormaNumarasi() {
		return formaNumarasi;
	}

	public void setFormaNumarasi(String formaNumarasi) {
		this.formaNumarasi = formaNumarasi;
	}

	public String getMevki() {
		return mevki;
	}

	public void setMevki(String mevki) {
		this.mevki = mevki;
	}

	public int getYas() {
		return yas;
	}

	public void setYaş(int yas) {
		this.yas = yas;
	}

	public boolean isSakatMi() {
		return sakatMi;
	}

	public void setSakatMi(boolean sakatMi) {
		this.sakatMi = sakatMi;
	}

	public int getBonservis() {
		return bonservis;
	}

	public void setBonservis(int bonservis) {
		this.bonservis = bonservis;
	}
	
	public boolean isYetenekliMi() {
		return yetenekliMi;
	}

	public void setYetenekliMi(boolean yetenekliMi) {
		this.yetenekliMi = yetenekliMi;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
	
	

	public void bonservisHesapla() {
		System.out.println("*** FUTBOLCUNUN BONSERVİSİ HESAPLANIYOR ***");
		if(getYas()<25) {
			setBonservis(getBonservis()+1000);
		}else if(getYas()<40 && getYas()>25) {
			setBonservis(getBonservis()+500);
		}else 
			setBonservis(0);

		if(yetenekliMi==true) {
			setBonservis(getBonservis()+50000);
		}else
			getBonservis();
		
	}
		
	public void yetenekliMiKontrolEt() {
		
		int yetenekKontrol =rastgele.nextInt(0,2);
		if(yetenekKontrol==1) {
			setYetenekliMi(true);
		}else 
			setYetenekliMi(false);
		
	}
	
	public void yeteneksizFutbolcuGelistirme() {
		int yetenekPuani=0;
		if(yetenekliMi==false) {
			System.out.println("**DAHA ÇOK ÇALIŞMAN GEREKİYOR");
			int gelistir=rastgele.nextInt(0,2);
			if(gelistir==1) {
				  for(int i=0;i<50;i++) {
					  yetenekPuani+=2;
					  System.out.println("Antrenman sonrası yetenek puanınız "+yetenekPuani);
					  setYetenekliMi(true);
				  }
		  
			  }else
				  System.out.println("Kendini geliştirmek istemiyor");
			  
		}else
			System.out.println("Zaten yetenekli birisin..");
	}
	

	
	@Override
	public void sampiyonlukKutla() {
		System.out.println(getIsim()+"isimli kişi şampiyonluğu kutluyor");
		
	}

	@Override
	public void antrenmanaCik() {
		if(sakatMi==false) {
		
		for(int i=0; i<7;i++) {	
			if(i==0|| i==2|| i==4 ||i==6) {
				System.out.println(getIsim()+"isimli futbolcu antrenmana çıktı.");
			}
			else
				System.out.println("Bugün futbolcuların dinlenme günü");
		}
		}
		else
			System.out.println(getIsim()+"isimli oyuncu sakat olduğun için antrenmanlara çıkamamaktadır.");
	}

	@Override
	public void macaCik() {

		int gunKontrol=rastgele.nextInt(0,2);
			if(gunKontrol==1) {
				System.out.println("Maça çıkmaya hazırsınız");
		}else
			System.out.println("Bugün maç yok");
	}
	
	
	
	
	
	
	
}
