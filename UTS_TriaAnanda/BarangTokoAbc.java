package UTS_TriaAnanda;

public class BarangTokoAbc {
    String kode;
    String nama;
    int stok;
    int hargaSatuan;
    int jumTerjual, jumBeli;

    public BarangTokoAbc(String kode, String nama, int stok, int hargaSatuan){
        this.kode = kode;
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }

    public void kurangiStok(int total){
        stok -= total;
        jumTerjual += total;
    }
}
