package oopGurayHocaOdevi;

public abstract class Kisiler {

	private String ad;
	private String tcNo;
	private int maas;

	public Kisiler(String ad, String tcNo, int maas) {
		super();
		this.ad = ad;
		this.tcNo = tcNo;
		this.maas = maas;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public abstract void imzaAt();

}
