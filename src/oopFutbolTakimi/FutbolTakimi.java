package oopFutbolTakimi;

public abstract class FutbolTakimi {
	
	private String takimAdi;

	public FutbolTakimi(String takimAdi) {
		super();
		this.takimAdi = takimAdi;
		
	}

	public String getTakimAdi() {
		return takimAdi;
	}

	public void setTakimAdi(String takimAdi) {
		this.takimAdi = takimAdi;
	}

	public abstract void sampiyonlukKutla();

}
