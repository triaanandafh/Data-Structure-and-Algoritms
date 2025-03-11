package Week1;
public class DosenMain21 {
 public static void main(String[] args) {
    Dosen21 Luluk = new Dosen21();
    Luluk.idDosen = "12345634";
    Luluk.nama = "Luluk Armadini";
    Luluk.statusAktif = true;
    Luluk.tahunBergabung = 2017;
    Luluk.bidangKeahlian = "Data System";

    
    Luluk.tampilInformasi();
    Luluk.setStatusAktif(false);
    Luluk.hitungMasaKerja(2025);
    Luluk.ubahKeahlian("Basis data");
    Luluk.tampilInformasi();

    Dosen21 Eko = new Dosen21("12345634", "Eko Sutono", true, 2019, "Artificial Intelligent") ;
    Eko.tampilInformasi();


 }   
}
