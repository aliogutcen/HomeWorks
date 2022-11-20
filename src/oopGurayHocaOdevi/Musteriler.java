package oopGurayHocaOdevi;

import java.util.ArrayList;
import java.util.Scanner;

public class Musteriler extends Kisiler {

	static Scanner sc = new Scanner(System.in);

	private boolean krediKartıVarMi;
	private boolean krediVarMi;
	private int krediSkoruHesapla;
	private int krediKartıLimit;

	private int hesaptakiPara;
	private boolean musteriKrediImzasi;
	private int count = 0;

	public Musteriler(String ad, String tcNo, int maas, int hesaptakiPara) {
		super(ad, tcNo, maas);
		this.krediKartıVarMi = krediKartıVarMi;
		this.krediVarMi = krediVarMi;
		this.krediKartıLimit = krediKartıLimit;
		this.hesaptakiPara = hesaptakiPara;
	}

	public boolean isKrediKartıVarMi() {
		return krediKartıVarMi;
	}

	public void setKrediKartıVarMi(boolean krediKartıVarMi) {
		this.krediKartıVarMi = krediKartıVarMi;
	}

	public boolean isKrediVarMi() {
		return krediVarMi;
	}

	public void setKrediVarMi(boolean krediVarMi) {
		this.krediVarMi = krediVarMi;
	}

	public int getKrediKartıLimit() {
		return krediKartıLimit;
	}

	public void setKrediKartıLimit(int krediKartıLimit) {
		this.krediKartıLimit = krediKartıLimit;
	}

	public int getHesaptakiPara() {
		return hesaptakiPara;
	}

	public void setHesaptakiPara(int hesaptakiPara) {
		this.hesaptakiPara = hesaptakiPara;
	}

	public boolean isMusteriKrediImzasi() {
		return musteriKrediImzasi;
	}

	public void setMusteriKrediImzasi(boolean musteriKrediImzasi) {
		this.musteriKrediImzasi = musteriKrediImzasi;
	}

	public int getKrediSkoruHesapla() {
		return krediSkoruHesapla;
	}

	public void setKrediSkoruHesapla(int krediSkoruHesapla) {
		this.krediSkoruHesapla = krediSkoruHesapla;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// KREDİ KARTI METHODLARI//

	public void krediKartiVarmi() {
		System.out.println("**** Kredi Kartı Oluşturma ****");
		if (krediKartıVarMi == false) {
			System.out.println("Kredi kartı oluşturmaya hoş geldiniz! ");
			this.krediKartıLimit = getMaas() * 4;
			System.out.println("Kredi kartı limitiniz= " + this.krediKartıLimit);
			System.out.println("Onayla= 1 \nOnaylama= 2");
			int secim = sc.nextInt();

			if (secim == 1) {
				System.out.println("Kredi Kartınız Oluşturulmuştur.");
				this.krediKartıVarMi = true;
			} else if (secim == 2) {
				System.out.println("Kredi Kartınız Oluşturulmamıştır");
			} else
				System.out.println("1 ya da 2 ye basınız.");

		} else
			System.out.println("Zaten kredi kartınız vardır.\nŞuanlık maksimum 1 adet kredi kartı alma imkanınız var");

	}

	public void krediKartıBorcEkle() {
		if (krediKartıVarMi == true) {
			System.out.println("Harcama tutarınız nedir ");
			int harcamaTutari = sc.nextInt();

			if (getKrediKartıLimit() - harcamaTutari > 0) {
				System.out.println("Keyifli Alışverişler Dileriz");
				System.out.println("Kart limitiniz= " + this.krediKartıLimit);
			} else
				System.out.println("Kart Limitinizi aştınız.");
		} else
			System.out.println("Kredi kartınız yoktur.");
	}

	public void krediKartıBorcuOde() {
		if (krediKartıVarMi == true) {
			System.out.println("Ödemek istediğiniz tutarı giriniz.");
			int odemeMiktarı = sc.nextInt();
			setKrediKartıLimit(getKrediKartıLimit() + odemeMiktarı);
		} else
			System.out.println("Kredi kartınız yoktur.");
	}

	public void krediKartLimitiniGoster() {
		System.out.println("Kredi kartınızın limiti= " + this.krediKartıLimit);
	}

	// HESAPTAKİ PARA METHODLARI//

	public void paraYatır() {
		System.out.println("Para Yatırma Tutarınızı Giriniz");
		int paraYatir = sc.nextInt();
		setHesaptakiPara(getHesaptakiPara() + paraYatir);
		System.out.println("Güncel bakiyeniz= " + this.hesaptakiPara);
	}

	public void paraCek() {
		System.out.println("Çekme Tutarınızı Giriniz");
		int cekmeTutari = sc.nextInt();
		if (getHesaptakiPara() - cekmeTutari > 0) {
			setHesaptakiPara(getHesaptakiPara() - cekmeTutari);
			System.out.println("Güncel bakiyeniz= " + this.hesaptakiPara);
		}

	}

	public void hesapBakiyesiSorgulama() {
		System.out.println("Bakiyeniz= " + this.hesaptakiPara);
	}

	// KREDİ SKORU HESAPLAMA VE GOSTER METODU

	public void krediSkoruHesapla() {
		if (count == 0) {
			System.out.println("KREDİ SKORUNUZ HESAPLANIYOR");
			if (this.isKrediKartıVarMi() == false) {
				setKrediSkoruHesapla(getKrediSkoruHesapla());
				count++;
				System.out.println("Kredi kartınız yok. \nKredi Skorunuz= " + getKrediSkoruHesapla());
			} else if (this.isKrediKartıVarMi() == true) {
				setKrediSkoruHesapla(getKrediSkoruHesapla() + 1);
				count++;
				System.out.println("Kredi Skorunuz= " + getKrediSkoruHesapla());
			} else if (this.isKrediKartıVarMi() == true && getHesaptakiPara() > 10000) {
				setKrediSkoruHesapla(getKrediSkoruHesapla() + 2);
				count++;
				System.out.println("Bankamızın değerli bir müştersininiz." + getKrediSkoruHesapla());
			}
		} else
			System.out.println("Daha önce kredi skorunuz hesaplanmıştır.");
	}

	public void krediSkorunuGoster() {
		System.out.println("Kredi skorunuz=" + getKrediSkoruHesapla());
	}

	@Override
	public void imzaAt() {
		if (krediVarMi == true) {
			System.out.println("Aldığınız krediyi imzalamanız gerekiyor.");
			musteriKrediImzasi = true;
		}
		if (musteriKrediImzasi == true) {
			System.out.println("Krediniz hayırlı olsun krediniz onaylanmıştır.");

		}
	}

}
