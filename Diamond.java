package bities;

public class Diamond extends Gold{

	private int foto;
	private int harga;
	
	public Diamond(String nama, int jumlahTiket, int foto) {
		super(nama, jumlahTiket);
		this.foto = foto;
		this.harga = 3500000 * jumlahTiket;
		// TODO Auto-generated constructor stub
	}

	public int getFoto() {
		return foto;
	}

	public void setFoto(int foto) {
		this.foto = foto;
	}
	
	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public void printData() {
		if(foto == 0) {
			System.out.println(". nama = "+ nama);
			System.out.println("   jumlah tiket = "+ jumlahTiket);
			System.out.println("   total = "+ harga);
			System.out.println("   status = " + status);
			System.out.println("   free foto");
		}
		else {
			System.out.println(". nama = "+ nama);
			System.out.println("   jumlah tiket = "+ jumlahTiket);
			System.out.println("   total = "+ harga);
			System.out.println("   status = " + status);
			System.out.println("   no free foto");
		}
	}
}
