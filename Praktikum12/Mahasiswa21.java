package Praktikum12;

public class Mahasiswa21 {
    public static String nim;
    public static String nama;
    public static String kelas;
    public static double ipk;

    public Mahasiswa21(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public static void tampil() {
        System.out.println("NIM: " +nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }

    public String toString() {
    return "NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk;
}
    // public void inputMahasiswa(scan) {

    // }
}
