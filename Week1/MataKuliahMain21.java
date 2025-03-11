package Week1;
public class MataKuliahMain21 {
    public static void main(String[] args) {
        MataKuliah21 daspro = new MataKuliah21() ;
        daspro.kodeMK = "FIFA24";
        daspro.nama = "Dasar Pemrograman";
        daspro.sks = 3;
        daspro.jumlahJam = 4;
        
        daspro.tampilInformasi();
        daspro.ubahSKS(3);
        daspro.tambahJam(5);
        daspro.kurangJam(1);
        daspro.tampilInformasi();

        MataKuliah21 pkn = new MataKuliah21("LAO134", "Pendidikan Kewarganegaraan", 2, 7) ;

        
        pkn.tampilInformasi();
        pkn.ubahSKS(6);
        pkn.tambahJam(3);
        pkn.kurangJam(2);
        pkn.tampilInformasi();

        
    }
}
