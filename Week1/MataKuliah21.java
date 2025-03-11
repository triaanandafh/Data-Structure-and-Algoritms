package Week1;
public class MataKuliah21 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode Matakuliah: " + kodeMK);
        System.out.println("Nama Matakuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
        System.out.println();
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int tambahi) {
        jumlahJam += tambahi;
    }

    void kurangJam(int kurangi) {
        if(jumlahJam >= kurangi) {
            jumlahJam -= kurangi;
        } else {
            System.out.println("Jumlah jam tidak bisa dikurangi lagi.");
        }
    }

 public MataKuliah21() {

 }   

 public MataKuliah21(String kode, String nama, int sks, int jam) {
    kodeMK = kode;
    this.nama = nama;
    this.sks = sks;
    jumlahJam = jam;
}
}
