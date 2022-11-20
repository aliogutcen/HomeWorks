package oopGurayHocaOdevi;

public class Yonetici extends Calisanlar implements ICalisanlarYonetimi {

	public Yonetici(String ad, String tcNo, int maas, boolean yoneticiMi) {
		super(ad, tcNo, maas, yoneticiMi);

	}

	@Override
	public void toplantiyaKatil() {
		System.out.println(getAd() + "yonetici kişisi toplantıya katıldı.");

	}

	@Override
	public void maasZammı() {
		System.out.println("Senelik zam oranınız %100 dür");
		setMaas(getMaas() * 2);

	}

}
