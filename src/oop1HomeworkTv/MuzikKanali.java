package oop1HomeworkTv;

public class MuzikKanali extends Kanal {

	private String muzikTuru;

	public MuzikKanali(String kanalAdi, int kanalNo, String muzikTuru) {
		super(kanalAdi, kanalNo);
		this.muzikTuru = muzikTuru;
	}

	public String getHaberTuru() {
		return muzikTuru;
	}

	public void setHaberTuru(String haberTuru) {

	}

	
	

	
}
