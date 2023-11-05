package bities;

public class Gold {
	protected String nama;
	protected int jumlahTiket;
	protected String status;
	private int harga;
	
	// Constructor
	public Gold(String nama, int jumlahTiket) {
		this.nama = nama;
		this.jumlahTiket = jumlahTiket;
		this.status = "belum lunas";
		this.harga = 2500000 * jumlahTiket;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getJumlahTiket() {
		return jumlahTiket;
	}

	public void setJumlahTiket(int jumlahTiket) {
		this.jumlahTiket = jumlahTiket;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public void printData() {
		System.out.println(". nama = "+ nama);
		System.out.println("   jumlah tiket = "+ jumlahTiket);
		System.out.println("   total = "+ harga);
		System.out.println("   status = " + status);
	}
}
