package aoop;
import java.util.*;

public class Main {

	public Main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan nama kendaraan : ");
		String nama = scan.nextLine();
		System.out.println("Masukkan jumlah roda : ");
		int roda = scan.nextInt();
		scan.nextLine();
		System.out.println("Masukkan Aksesoris : ");
		String aksesoris = scan.nextLine();
		DetailKendaraan kendaraan = new DetailKendaraan(roda, nama, aksesoris);
		System.out.println(kendaraan.getAccessories());
	}

	public static void main(String[] args) {
		new Main();

	}

}
