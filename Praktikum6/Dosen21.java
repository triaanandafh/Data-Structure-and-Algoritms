package Praktikum6;

public class Dosen21 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen21(String kd, String name, Boolean jk, int usia){
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = usia;
    }

    void tampil(){
        System.out.println("Kode: "+ kode);
        System.out.println("Nama: "+ nama);
        System.out.println("Jenis kelamin: "+ (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("usia: "+ usia);
    }
}
