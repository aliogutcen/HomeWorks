package oopGurayHocaOdevi;

import java.util.Scanner;

public class ArabaKredisi extends Krediler implements IKrediYonetimi {

	static Scanner scanner = new Scanner(System.in);
	private Musteriler musteriler;
	private int krediTutari;
	private int geriOdeme;
	private int arabaFiyati;
	private boolean onay;
	private int vade;
	private int geriKalanOdeme;

	public ArabaKredisi(int krediSayisi) {
		super(krediSayisi);
	}

	public Musteriler getMusteriler() {
		return musteriler;
	}

	public void setMusteriler(Musteriler musteriler) {
		this.musteriler = musteriler;
	}

	public int getKrediTutari() {
		return krediTutari;
	}

	public void setKrediTutari(int krediTutari) {
		this.krediTutari = krediTutari;
	}

	public int getArabaFiyati() {
		return arabaFiyati;
	}

	public void setArabaFiyati(int arabaFiyati) {
		this.arabaFiyati = arabaFiyati;
	}

	public boolean isOnay() {
		return onay;
	}

	public void setOnay(boolean onay) {
		this.onay = onay;
	}

	public int getVade() {
		return vade;
	}

	public void setVade(int vade) {
		this.vade = vade;
	}

	public int getGeriOdeme() {
		return geriOdeme;
	}

	public void setGeriOdeme(int geriOdeme) {
		this.geriOdeme = geriOdeme;
	}

	public int getGeriKalanOdeme() {
		return geriKalanOdeme;
	}

	public void setGeriKalanOdeme(int geriKalanOdeme) {
		this.geriKalanOdeme = geriKalanOdeme;
	}

	@Override
	public void krediMiktarı(Musteriler musteriler) {
		System.out.println("**** KREDİ MİKTARI HESAPLAMA **** ");
		if (musteriler.getKrediSkoruHesapla() != 0 && getKrediSayisi() == 0) {
			System.out.println("Tebrikler kredi skorunuz= " + musteriler.getKrediSkoruHesapla()
					+ "\nKredi başvurusu yapabilirsiniz.\n");
			System.out.println("Başvuru yapacağınız türü seçiniz\n0.el araba için = 1\n2.el araba için = 2");
			int secim = scanner.nextInt();
			if (secim == 1) {
				System.out.println("Alacağınız arabanın fiyatını giriniz");
				setArabaFiyati(scanner.nextInt());
				musteriler.setCount(0);
				System.out.println("Almak istediğiniz kredi tutarı giriniz");
				krediTutari = scanner.nextInt();
				setKrediSayisi(1);
			} else if (secim == 2) {
				System.out.println("Alacağınız arabanın fiyatını giriniz");
				int arabaFiyati = scanner.nextInt();
				setArabaFiyati(scanner.nextInt());
				scanner.next();
				System.out.println("Almak istediğiniz tutarı giriniz");
				setKrediTutari(scanner.nextInt());
				setKrediSayisi(1);
				musteriler.setCount(0);
			} else
				System.out.println("Tekrar seçim yapınız.");

		} else
			System.out.println("Kredi başvurusu yapamazsınız.");
		musteriler.setCount(0);
	}

	@Override
	public void krediOnay(Musteriler musteriler) {

		if (musteriler.getKrediSkoruHesapla() == 2) {
			if (this.krediTutari <= this.arabaFiyati * 70 / 100) {
				System.out.println("Krediniz onaylanmıştır.");

				this.onay = true;
			} else
				System.out.println("Mevduat gereği araba fiyatının %70'inden fazla kredi başvurusu yapamazsınız..");

		} else if (musteriler.getKrediSkoruHesapla() == 1) {
			if (this.krediTutari <= this.arabaFiyati * 50 / 100) {
				System.out.println("Krediniz onaylanmıştır.");
				onay = true;

			} else
				System.out.println("En fazla araba fiyatının %50si kadar krediye başvurabilirsiniz.");

		} else
			System.out.println("Başvurduğunuz bir kredi yoktur.");
	}

	@Override
	public void vade(Musteriler musteriler) {

		System.out.println("Ödemek istediğiniz vadeyi seçiniz.\n1-12 ay\n2-24 ay\n3-36 ay");
		int secim = scanner.nextInt();
		if (onay == true) {
			if (secim == 1) {
				this.vade = 12;
			} else if (secim == 2) {
				this.vade = 24;
			} else
				this.vade = 36;
		} else
			System.out.println("Krediniz onaylanmamıştır.");

	}

	@Override
	public void krediGeriOdeme(Musteriler musteriler) {
		if (onay == true && this.vade != 0) {
			if (this.vade == 12) {
				this.geriOdeme = this.krediTutari * 13 / 10;

				System.out.println("Geri ödeme tutarınız= " + this.geriOdeme);
			} else if (this.vade == 24) {
				this.geriOdeme = this.krediTutari * 24 / 10;

				System.out.println("Geri ödeme tutarınız= " + this.geriOdeme);
			} else {
				this.geriOdeme = this.krediTutari * 36 / 10;

				System.out.println("Geri ödeme tutarınız= " + this.geriOdeme);
			}
		} else
			System.out.println("Krediniz onaylanmamıştır..");

	}

	@Override
	public void aylikOdeme(Musteriler musteriler) {
		System.out.println(
				"Kredinizin aylık ödeme tutarı= " + (this.geriOdeme / this.vade) + " Vade sayısı= " + this.vade);
	}

	@Override
	public void kalanOdeme(Musteriler musteriler) {
		System.out.println("*** KALAN KREDİ ÖDEME MİKTARINIZ ***");
		int odenenTutar = 0;
		for (int i = 0; i < this.vade; i++) {
			odenenTutar = (this.geriOdeme / this.vade) + odenenTutar;
			setGeriKalanOdeme(getGeriOdeme() - odenenTutar);
			System.out.println(i + 1 + ".Ay Kredi Borcunuz Ödenmiştir.\nGeriye kalan borcunuz=" + getGeriKalanOdeme());
			this.geriKalanOdeme = this.geriOdeme - odenenTutar;
		}
		if (this.geriKalanOdeme < 100) {
			System.out.println("------------------");
			System.out.println("Kredi borcunuz bitmiştir..");
			musteriler.setCount(0);
			setKrediSayisi(0);
		}
	}

}
