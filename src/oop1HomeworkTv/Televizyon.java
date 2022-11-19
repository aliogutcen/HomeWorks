package oop1HomeworkTv;

import java.util.ArrayList;
import java.util.Scanner;

public class Televizyon {
	static Scanner scanner = new Scanner(System.in);

	private String marka;
	private double boyut;
	private ArrayList<Kanal> kanallar;
	private boolean tvAcikMi;
	private int ses = 10;
	private boolean tvKurulumu;
	private int baslangicKanali = 0;

	public Televizyon() {
		kanallar = new ArrayList<Kanal>();
		this.marka = marka;
		this.boyut = boyut;
		this.ses = ses;
		this.tvAcikMi = false;
		kanallariOlustur();

	}

	public boolean isTvAcikMi() {
		return tvAcikMi;
	}

	public void setTvAcikMi(boolean tvAcikMi) {
		this.tvAcikMi = tvAcikMi;
	}

	public int getSes() {
		return ses;
	}

	public void setSes(int ses) {
		this.ses = ses;
	}

	public boolean isTvKurulumu() {
		return tvKurulumu;
	}

	public void setTvKurulumu(boolean tvKurulumu) {
		this.tvKurulumu = tvKurulumu;
	}

	public int getBaslangicKanali() {
		return baslangicKanali;
	}

	public void setBaslangicKanali(int baslangicKanali) {
		this.baslangicKanali = baslangicKanali;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public double getBoyut() {
		return boyut;
	}

	public void setBoyut(double boyut) {
		this.boyut = boyut;
	}

	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}

	public void setKanallar(ArrayList<Kanal> kanallar) {
		this.kanallar = kanallar;
	}

	public void tvKur() {

		if (tvKurulumu == false) {
			System.out.println("Markayı giriniz");
			String marka = scanner.nextLine();
			System.out.println("Boyutunu giriniz");
			double boyut = scanner.nextDouble();
			scanner.nextLine();
			this.marka = marka;
			this.boyut = boyut;
			System.out.println("Televizyon kuruldu");
			kanallariOlustur();
			tvKurulumu = true;
		} else
			System.err.println("Televizyonunuz zaten kurulu");

	}

	public void kanallariOlustur() {

		Kanal kanal = new MuzikKanali("NumberOne", 1, "Pop");
		Kanal kanal1 = new HaberKanali("HaberTürk", 2, "Ana-haber");
		Kanal kanal2 = new MuzikKanali("PowerTurk", 3, "Türkçe-Pop");
		Kanal kanal3 = new HaberKanali("Bloomberg", 4, "Borsa");
		Kanal kanal4 = new MuzikKanali("KralFm", 5, "Arabesk");
		Kanal kanal5 = new HaberKanali("BeinSportHaber", 6, "Spor");
		Kanal kanal6 = new HaberKanali("TRT1", 7, "Ana-haber");
		Kanal kanal7 = new HaberKanali("CnnTurk", 8, "Ana-haber");
		Kanal kanal8 = new MuzikKanali("NumberOneFM", 9, "Yabancı-Pop");

		kanallar.add(kanal);
		kanallar.add(kanal1);
		kanallar.add(kanal2);
		kanallar.add(kanal3);
		kanallar.add(kanal4);
		kanallar.add(kanal5);
		kanallar.add(kanal6);
		kanallar.add(kanal7);
		kanallar.add(kanal8);
	}

	public void tvAc() {

		if (tvKurulumu == true) {
			if (tvAcikMi == true) {
				System.err.println("Televizyon zaten açık");
			} else
				System.out.println("Televizyonunuz açıldı");
			tvAcikMi = true;

		} else
			System.err.println("Televizyonu açmak için önce kurulumun yapınız");

	}

	public void sesArttir() {
		int maxSes = 20;
		if (tvKurulumu == true) {
			if (tvAcikMi == true) {
				if (this.ses < maxSes) {
					this.ses++;
					System.out.println("Ses arttırıldı= " + this.ses);
				} else
					System.err.println("Daha fazla sesi açamazsınız");

			} else
				System.err.println("Önce televizyonu açmalısın.");

		} else
			System.err.println("İlk önce televizyonu kurmak için 1e basar mısın.");

	}

	public void sesAzalt() {

		if (tvKurulumu == true) {
			if (tvAcikMi == true) {
				if (this.ses > 0) {
					this.ses--;
					System.out.println("Ses azaltıldı= " + this.ses);
				} else
					System.err.println("Daha fazla sesi kısamazsınız");

			} else
				System.err.println("Önce televizyonu açmalısın.");

		} else
			System.err.println("İlk önce televizyonu kurmak için 1e basar mısın.");

	}

	public void kapat() {
		if (tvAcikMi == true && tvKurulumu) {
			tvAcikMi = false;
			System.out.println("Tv kapatıldı ! ");
		} else
			System.err.println("Televizyon zaten kapalı..");
	}

	public void kanalBilgisiGoster() {
		System.out.println("İzlediğiniz kanalın adı = " + kanallar.get(baslangicKanali).getKanalAdi()
				+ " Kanalın numarası= " + kanallar.get(baslangicKanali).getKanalNo());

	}

	public void kanalDegistir() {

		if (tvKurulumu == true) {

			if (tvAcikMi == true) {
				System.out.println("---- Kanalların  Listesi ----");
				for (Kanal kanal : kanallar) {
					System.out.println("Kanal numarası= " + kanal.getKanalNo() + " Kanal adı= " + kanal.getKanalAdi());
				}

				System.out.println("Gitmek istediğiniz kanalı giriniz");
				int git = scanner.nextInt();

				if (baslangicKanali + 1 != git) {

					if (git < getKanallar().size() + 1) {
						this.baslangicKanali = git - 1;
						System.out.println(
								git + ".kanaldasınız izlediğiniz kanalın  adı= " + kanallar.get(git - 1).getKanalAdi());

					} else
						System.err.println("Gitmek istediğiniz kanal listenizde yoktur");
				}

				else if (baslangicKanali + 1 == git) {
					System.err.println("Aynı kanaldasınız");
				}

			} else
				System.err.println("Önce televizyonu açmalısın");
		} else

			System.err.println("Öncelikle televizyonu kurmalısın bunun için 1 e basar mısın? ");

	}
}
