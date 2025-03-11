package Quiz1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        System.out.println("=== MENU PERPUSTAKAAN ===");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Tambah Mahasiswa");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("5. Tampilan Peminjaman");
        System.out.println("6. Keluar");
        while(true) {
            System.out.print("\nPilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if(pilihan == 1) {
                System.out.print("Masukkan kode buku: ");
                String kode = sc.nextLine();
                System.out.print("Masukkan judul buku: ");
                String judul = sc.nextLine();
                System.out.print("Masukkan penulis: ");
                String penulis = sc.nextLine();
                perpustakaan.tambahBuku(new Buku(kode, judul, penulis));
            System.out.println("Buku berhasil ditambahkan!");
            } else if(pilihan == 2) {
                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = sc.nextLine();
                System.out.print("Masukkan nama mahasiswa: ");
                String nama = sc.nextLine();
                perpustakaan.tambahAngggota(new Mahasiswa(nim, nama));
                System.out.println("Mahasiswa berhasil ditambahkan!");
            }else if(pilihan == 3) {
                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = sc.nextLine();
                Mahasiswa mahasiswa = perpustakaan.cariMahasiswa(nim);

                if(mahasiswa == null) {
                    System.out.println("Mahasiswa tidak ditemukan.");
                    continue;
                }

                System.out.print("Masukkan kode buku: ");
                String kodeBuku = sc.nextLine();
                Buku buku = perpustakaan.cariBuku(kodeBuku);
                System.out.println();
                if(buku == null) {
                    System.out.println("Buku tidak ditemukan.");
                    continue;
                }
                mahasiswa.pinjamBuku(buku);
            } else if(pilihan == 4) {
                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = sc.nextLine();
                Mahasiswa mahasiswa = perpustakaan.cariMahasiswa(nim);

                if(mahasiswa == null) {
                    System.out.println("Mahasiswa tidak ditemukan.");
                    continue;
                }

                System.out.print("Masukkan kode buku: ");
                String kodeBuku = sc.nextLine();
                mahasiswa.kembalikanBuku(kodeBuku);

            } else if(pilihan == 5) {
                perpustakaan.displayDaftarPeminjaman();
              
            } else if (pilihan == 6) {
                System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                break;
            } else{
                System.out.println("Pilihan tidak valid.");
            }   
        }
    }
}
