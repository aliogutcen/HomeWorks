package oop1HomeworkTv;

public class Kanal {

	private String kanalAdi;
	private int kanalNo;
	private int baslangicKanali = 1;

	public Kanal(String kanalAdi, int kanalNo) {
		super();
		this.kanalAdi = kanalAdi;
		this.kanalNo = kanalNo;
	}

	public String getKanalAdi() {
		return kanalAdi;
	}

	public void setKanalAdi(String kanalAdi) {
		this.kanalAdi = kanalAdi;
	}

	public int getKanalNo() {
		return kanalNo;
	}

	public void setKanalNo(int kanalNo) {
		this.kanalNo = kanalNo;
	}

	public int getBaslangicKanali() {
		return baslangicKanali;
	}

	public void setBaslangicKanali(int baslangicKanali) {
		this.baslangicKanali = baslangicKanali;
	}

}
