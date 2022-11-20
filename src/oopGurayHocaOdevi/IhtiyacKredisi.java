package oopGurayHocaOdevi;

import java.util.Scanner;

public class IhtiyacKredisi extends Krediler implements IKrediYonetimi {
	static Scanner scanner = new Scanner(System.in);
	private Musteriler musteriler;
	private int krediTutari;
	private int geriOdeme;
	private int geriKalanOdeme;
	private boolean onay;
	private int vade;

	public IhtiyacKredisi(int krediSayisi) {
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

	public int getGeriOdeme() {
		return geriOdeme;
	}

	public void setGeriOdeme(int geriOdeme) {
		this.geriOdeme = geriOdeme;
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

	public int getGeriKalanOdeme() {
		return geriKalanOdeme;
	}

	public void setGeriKalanOdeme(int geriKalanOdeme) {
		this.geriKalanOdeme = geriKalanOdeme;
	}

	@Override
	public void krediMiktarı(Musteriler musteriler) {
		System.out.println("*** İhtiyaç Kredisi Başvurusuna Hoşgeldiniz ****");
		if (musteriler.getKrediSkoruHesapla() != 0 && getKrediSayisi() == 0) {
			System.out.println("Tebrikler kredi skorunuz= " + musteriler.getKrediSkoruHesapla()
					+ "\nKredi başvurusu yapabilirsiniz.\n");
			System.out.println("Başvurmak istediğiniz kredi miktarını giriniz");
			setKrediTutari(scanner.nextInt());
			System.out.println("Başvurunuz yapılmıştır..");
			setKrediSayisi(1);
		} else
			System.out.println("Kredi başvurusu yapamazsınız.");

	}

	@Override
	public void krediOnay(Musteriler musteriler) {
		if (getKrediTutari() <= musteriler.getMaas() * 10) {
			System.out.println("Krediniz onaylanmıştır");
			onay = true;
		} else
			System.out.println("Krediniz onaylanmamıştır");
		musteriler.setCount(0);
		onay = false;
	}

	@Override
	public void vade(Musteriler musteriler) {

		System.out.println("Ödemek istediğiniz vadeyi seçiniz.\n1-12 ay\n2-24 ay\n3-36 ay");
		int secim = scanner.nextInt();
		if (onay = true) {
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
	public void aylikOdeme(Musteriler musteriler) {
		System.out.println(
				"Kredinizin aylık ödeme tutarı= " + (this.geriOdeme / this.vade) + " Vade sayısı= " + this.vade);

	}

	@Override
	public void krediGeriOdeme(Musteriler musteriler) {
		if (onay == true) {
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
	public void kalanOdeme(Musteriler musteriler) {

		System.out.println("*** KALAN KREDİ ÖDEME MİKTARINIZ ***");
		int odenenTutar = 0;
		for (int i = 0; i < this.vade; i++) {
			odenenTutar = (this.geriOdeme / this.vade) + odenenTutar;
			System.out.println(
					i + 1 + ".Ay Kredi Borcunuz Ödenmiştir.\nGeriye kalan borcunuz=" + (this.geriOdeme - odenenTutar));
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
