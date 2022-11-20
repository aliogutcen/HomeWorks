package oopFutbolTakimi;

import java.util.Scanner;

public class Yonetim extends FutbolTakimi {
	static Scanner scanner= new Scanner(System.in);
	private String isim;
	private String departman;
	private int borc;
	
	
	public Yonetim(String isim, String departman) {
		super("Galatasaray");
		this.isim = isim;
		this.departman = departman;
	}

	
	public int getBorc() {
		return borc;
	}


	public void setBorc(int borc) {
		this.borc = borc;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public void borcEkle() {
		if(getDepartman().equalsIgnoreCase("Başkan")) {
		System.out.println("***ALMAK İSTEDİĞİNİZ BORCU GİRİNİZ***");
		int borcMiktarı=scanner.nextInt();
		setBorc(getBorc()+borcMiktarı);
		System.out.println("***TAKIMA BORC EKLENMİŞTİR***"+ "\nGüncelBorcunuz="+getBorc());
		}
		else
			System.out.println("Başkan dışında kimse borç alamaz");
	}
	
	
	public void borcOdemeGunu() {
		System.out.println("***ÖDEMEK İSTEDİĞİNİZ BORCU GİRİNİZ***");
		int odemeMiktarı=scanner.nextInt();
		 if(odemeMiktarı<getBorc()) {
			 setBorc(getBorc()-odemeMiktarı);
			System.out.println("***TAKIMIN BORCU ODENMIŞTIR***"+ "\nGüncelBorcunuz="+getBorc());
		 }else
			 System.out.println("TAKIMIN BU KADAR BORCU YOKTUR");
		
	}

	@Override
	public void sampiyonlukKutla() {
		System.out.println(getIsim()+"kişisi şampiyonluk kutlamalarına katılmıştır");
		
	}

}
