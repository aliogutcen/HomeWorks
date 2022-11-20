package oopGurayHocaOdevi;

public class Calisanlar extends Kisiler {

	private boolean yoneticiMi;
	private String departman;

	public Calisanlar(String ad, String tcNo, int maas, boolean yoneticiMi) {
		super(ad, tcNo, maas);
		this.yoneticiMi = yoneticiMi;
		this.departman = departman;
	}

	public boolean isYoneticiMi() {
		return yoneticiMi;
	}

	public void setYoneticiMi(boolean yoneticiMi) {
		this.yoneticiMi = yoneticiMi;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	@Override
	public void imzaAt() {
		if (isYoneticiMi() == true) {
			System.out.println("Kredi için İmza atıldı");
		} else
			System.out.println("Yönetici olmadığı için imza atamazsınız.");
	}

}
