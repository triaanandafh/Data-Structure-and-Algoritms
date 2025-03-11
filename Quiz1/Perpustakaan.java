package Quiz1;

public class Perpustakaan {
    Buku[] koleksiBuku = new Buku[10];
    Mahasiswa[] daftarMahasiswa = new Mahasiswa[10];
    int jumlahBuku = 0, jumlahMahasiswa = 0;

    public void tambahBuku(Buku buku) {
        koleksiBuku[jumlahBuku] = buku;
        jumlahBuku++;
    }

    public void tambahAngggota(Mahasiswa mahasiswa) {
        daftarMahasiswa[jumlahMahasiswa] = mahasiswa;
        jumlahMahasiswa++;
    }

    public Buku cariBuku(String kode) {
        for (int i = 0; i<jumlahBuku; i++) {
            if(koleksiBuku[i].kodeBuku.equals(kode)) {
                 return koleksiBuku[i];
            }
        }
        System.out.println("Buku tidak ditemukan.");
        return null;
    }

    public Mahasiswa cariMahasiswa(String nim) {
        for(int i = 0; i < jumlahMahasiswa; i++) {
            if(daftarMahasiswa[i].nim.equals(nim)) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }

    public void displayDaftarPeminjaman() {
        System.out.println("Daftar Peminjaman Buku:");
        for (int i = 0; i < jumlahMahasiswa; i++){
            if(daftarMahasiswa[i].jumlahBuku > 0) {
                for (int j = 0; j< daftarMahasiswa[i].jumlahBuku; j++){
                    System.out.println(daftarMahasiswa[i].nama + " meminjam: " + daftarMahasiswa[i].bukuDipinjam[j].judul);
                }
            }
        }
    }
}
