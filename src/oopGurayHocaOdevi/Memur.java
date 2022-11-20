package oopGurayHocaOdevi;

public class Memur extends Calisanlar implements ICalisanlarYonetimi {
	private String departman;

	public Memur(String ad, String tcNo, int maas, boolean yoneticiMi, String departman) {
		super(ad, tcNo, maas, yoneticiMi);
		this.departman = departman;
	}

	@Override
	public void toplantiyaKatil() {
		System.out.println(getAd() + "memur kişisi toplantıya katıldı");

	}

	@Override
	public void maasZammı() {
		if (getMaas() < 10000) {
			System.out.println("Senelik zam oranınız %40");
			setMaas(getMaas() + getMaas() * 40 / 100);
		} else {
			System.out.println("Senelik zam oranınız %60");
			setMaas(getMaas() + getMaas() * 60 / 100);
		}

	}

}
