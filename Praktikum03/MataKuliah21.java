package Praktikum03;
import java.util.Scanner;


public class MataKuliah21 {
    Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    
    public MataKuliah21() {
    
    }

    public MataKuliah21(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData() {
        System.out.print("Kode      : ");
        this.kode = sc.nextLine();
        System.out.print("Nama      : ");
        this.nama = sc.nextLine();
        System.out.print("SKS       : ");
        String dummy = sc.nextLine();
        this.sks = Integer.parseInt(dummy);
        System.out.print("Jumlah jam: ");
        dummy = sc.nextLine();
        this.jumlahJam = Integer.parseInt(dummy);
    }
    
    public void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah jam  : " + jumlahJam);
    }
}
