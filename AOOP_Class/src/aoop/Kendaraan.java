package aoop;

public class Kendaraan {
	public int roda;
	public String nama;
	public Kendaraan() {
	}
	public Kendaraan(int roda, String nama) {
		super();
		this.roda = roda;
		this.nama = nama;
	}

	public int getRoda() {
		return roda;
	}

	public void setRoda(int roda) {
		this.roda = roda;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

}
