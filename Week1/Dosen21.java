package Week1;
public class Dosen21 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        if(statusAktif == true){
            System.out.println("Status aktif: Aktif");
        } else{
            System.out.println("Status aktif: Tidak aktif");
        }
        System.out.println("Tahun Gabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println();
    }

    void setStatusAktif(boolean status) {
            statusAktif = status;
    } 

    void hitungMasaKerja(int tahunsekarang) {
        int masaKerja = tahunsekarang - tahunBergabung;
        // System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }

    void ubahKeahlian(String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
    }

    public Dosen21() {

    }   
   
    public Dosen21(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
       this.idDosen = idDosen;
       this.nama = nama;
       this.statusAktif = statusAktif;
       this.tahunBergabung = tahunBergabung;
   }
}
