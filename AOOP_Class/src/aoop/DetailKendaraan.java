package aoop;

public class DetailKendaraan extends Kendaraan {
	public String aksesoris;
	public DetailKendaraan() {
		super();
	}
	public DetailKendaraan(String aksesoris) {
		super();
		this.aksesoris = aksesoris;
	}
	public DetailKendaraan(int roda, String nama, String aksesoris) {
		super(roda, nama);
		this.aksesoris = aksesoris;
	}
	public String getAccessories() {
		return aksesoris;
	}
	public void setAccessories(String aksesoris) {
		this.aksesoris = aksesoris;
	}
	
}
