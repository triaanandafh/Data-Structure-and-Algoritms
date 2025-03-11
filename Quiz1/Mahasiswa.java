package Quiz1;

public class Mahasiswa {
    String nim;
    String nama;
    int jumlahBuku = 0;
    Buku [] bukuDipinjam = new Buku[2];

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public boolean pinjamBuku(Buku buku) {
        if(jumlahBuku >= 2) {
            System.out.println("Maksimal hanya 2 buku yang boleh dipinjam.");
            return false;
        } else if (buku.status) {
            System.out.println("Gagal meminjam buku: " + buku.judul + " karena sudah dipinjam orang lain.");
            return false;
        }
        bukuDipinjam[jumlahBuku] = buku;
        buku.status = true;
        jumlahBuku++;
        System.out.println(nama + " berhasil meminjam " + buku.judul);
        return true;
    }

    public boolean kembalikanBuku(String kodeBuku) {
        for(int i = 0; i<jumlahBuku;i++) {
            if(bukuDipinjam[i] != null && bukuDipinjam[i].kodeBuku.equals(kodeBuku)) {
                bukuDipinjam[i].status = false;
                for(int j = i ; j< jumlahBuku-1; j++) {
                    bukuDipinjam[j] = bukuDipinjam[j+1];
                }
                bukuDipinjam[jumlahBuku - 1] = null;
                jumlahBuku--;
                System.out.println("Buku berhasil dikembalikan.");
                return true;
            }
        }
        return false;
    }

}
