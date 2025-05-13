package Praktikum11;

public class Mahasiswa21 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa21() {

    }

    Mahasiswa21(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.printf("%-15s %-15s %-10s %.1f\n", nama, nim, kelas, ipk);
    }
}
