package bities;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	static Vector<Diamond> vDiamond = new Vector<>();
	static Vector<Gold> vGold = new Vector<>();
	
	public static void addData() {
		int jumlahTiket, foto;
		String nama, jenis;
		
		try {
			do {
				System.out.print("Masukan nama: ");
				nama = sc.nextLine();
			}while(nama.length() < 3);
			
			do {
				System.out.print("Masukan jumlah tiket [min 1 || max 5]: ");
				jumlahTiket = sc.nextInt();
				sc.nextLine();
			}while(jumlahTiket > 5 || jumlahTiket < 1);
			
			do {
				System.out.print("Masukan jenis tiket [diamond || gold]: ");
				jenis = sc.nextLine().toLowerCase();
			}while(!jenis.equalsIgnoreCase("diamond") && !jenis.equalsIgnoreCase("gold"));
			
			if(jenis.equalsIgnoreCase("diamond")) {
				Random rd = new Random();
				foto = rd.nextInt()*2;
				
				vDiamond.add(new Diamond(nama, jumlahTiket, foto));
				System.out.println("add diamond tiket berhasil");
			}
			else
				vGold.add(new Gold(nama, jumlahTiket));
				System.out.println("add gold tiket berhasil");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
	}
	
	public static void showUpdate() {
		String jenis, nama;
		char hapus;
		int counter = 1;
		
		//show gold data
		for(int i = 0; i < vGold.size(); i++) {
			System.out.println("Gold");
			System.out.print(counter);
			vGold.get(i).printData();
			counter++;
		}
		
		//show diamond data
		for(int i = 0; i < vDiamond.size(); i++) {
			System.out.println("Diamond");
			System.out.print(counter);
			vDiamond.get(i).printData();
			counter++;
		}
		
		if(vDiamond.isEmpty() == false || vGold.isEmpty() == false) {
			System.out.print("apakah anda mau melakukan update? [Y/T]: ");
			hapus = sc.nextLine().toLowerCase().charAt(0);
			
			switch(hapus) {
			case 'y':
				
				do {
					System.out.print("Masukan nama: ");
					nama = sc.nextLine();
				}while(nama.length() < 3);
				
				do {
					System.out.print("Masukan jenis tiket [diamond || gold]: ");
					jenis = sc.nextLine();
				}while(!jenis.equalsIgnoreCase("diamond") && !jenis.equalsIgnoreCase("gold"));
				
				
				if(jenis.equalsIgnoreCase("diamond")) {
					boolean ketemu = false;
					for(int i = 0; i < vDiamond.size(); i++) {
						if(vDiamond.get(i).getNama().equalsIgnoreCase(nama)) {
							ketemu = true;
							if(vDiamond.get(i).getStatus().equalsIgnoreCase("belum lunas")) {
								vDiamond.get(i).setStatus("sudah lunas");
								System.out.println("berhasil update status lunas");
							}
							else
								System.out.println("sudah lunas lo");
						}
					}
					if(!ketemu) {
						System.out.println("nama tidak ditemukan");
					}
				}
				else {
					boolean ketemu = false;
					for(int i = 0; i < vGold.size(); i++) {
						if(vGold.get(i).getNama().equalsIgnoreCase(nama)) {
							ketemu = true;
							if(vGold.get(i).getStatus().equalsIgnoreCase("belum lunas")) {
								vGold.get(i).setStatus("sudah lunas");
								System.out.println("berhasil update status lunas");
							}
							else
								System.out.println("sudah lunas lo");
						}
					}
					if(!ketemu) {
						System.out.println("nama tidak ditemukan");
					}
				}
				break;
				
			case 't':
				System.out.println("Baiklah");
				break;
			}
		}
		else {
			System.out.println("there is no data");
		}
	}
	
	public static void delete() {
		String jenis, nama;
		int counter = 1;
		
		//show gold data
		for(int i = 0; i < vGold.size(); i++) {
			System.out.println("Gold");
			System.out.print(counter);
			vGold.get(i).printData();
			counter++;
		}
		
		//show diamond data
		for(int i = 0; i < vDiamond.size(); i++) {
			System.out.println("Diamond");
			System.out.print(counter);
			vDiamond.get(i).printData();
			counter++;
		}
		
		if(vDiamond.isEmpty() == false || vGold.isEmpty() == false) {
			do {
				System.out.print("Masukan nama yang akan di delete: ");
				nama = sc.nextLine();
			}while(nama.length() < 3);
			
			do {
				System.out.print("Masukan jenis tiket [diamond || gold]: ");
				jenis = sc.nextLine();
			}while(!jenis.equalsIgnoreCase("diamond") && !jenis.equalsIgnoreCase("gold"));
			
			
			if(jenis.equalsIgnoreCase("diamond")) {
				boolean ketemu = false;
				for(int i = 0; i < vDiamond.size(); i++) {
					if(vDiamond.get(i).getNama().equalsIgnoreCase(nama)) {
						ketemu = true;
						vDiamond.remove(i);
						System.out.println("delete telah berhasil");
					}
				}
				if(!ketemu) {
					System.out.println("nama tidak ditemukan");
				}
			}
			else {
				boolean ketemu = false;
				for(int i = 0; i < vGold.size(); i++) {
					if(vGold.get(i).getNama().equalsIgnoreCase(nama)) {
						ketemu = true;
						vGold.remove(i);
						System.out.println("delete telah berhasil");
					}
				}
				if(!ketemu) {
					System.out.println("nama tidak ditemukan");
				}
			}
		}
		else {
			System.out.println("there is no data");
		}
		
	}
	
	public static void Menu() {
		int pilihan;
		do {
			System.out.println("1. add data");
			System.out.println("2. show and update");
			System.out.println("3. delete");
			System.out.println("4. exit");
			do {
				System.out.print("pilihan [1-4]: ");
				pilihan = sc.nextInt();
				sc.nextLine();
			}while(pilihan < 1 || pilihan > 4);
			
			if(pilihan == 1) {
				System.out.println("add");
				addData();
			}
			
			else if(pilihan == 2) {
				System.out.println("show and update");
				showUpdate();
			}
			else if(pilihan == 3) {
				System.out.println("delete");
				delete();
			}
			else
				System.out.println("Thankyou");
		}while(pilihan != 4);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
	}

}
