package Praktikum10.P3Jobsheet10;

import java.util.Scanner;

import Praktikum10.P2Jobsheet10.AntrianLayanan;

public class ProgramKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayananKrs antrian = new AntrianLayananKrs(10);
        int pilihan;

        do{
            System.out.println("\n=== Manu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani 2 Mahasiswa");
            System.out.println("3. Lihat 2 Mahasiswa Terdepan");
            System.out.println("4. Lihat Antrian paling belakang");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Cek antrian Kosong");
            System.out.println("8. Cek antrian Penuh");
            System.out.println("9. Kosongkan antrian");
            System.out.println("10. Jumlah Mahasiswa belum KRS");
            System.out.println("11. Jumlah Mahasiswa sudah KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = sc.nextLine();
                    Mhs msh = new Mhs(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(msh);
                    break;
                case 2:
                    antrian.layaniDuaMahasiswa();
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    System.out.println("Mahasiswa yang berada di antrian paling belakang: ");
                    antrian.lihatAkhir();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong" : "Antrian penuh");
                    break;
                case 8:
                    System.out.println(antrian.isFull() ? "Antrian penuh" : "Antrian kosong");
                    break;
                case 9:
                    antrian.clear();
                    System.out.println("Antrian berhasil dikosongkan");
                    break;
                case 10:
                    System.out.println("Jumlah yang belum KRS: "+ antrian.getBelumKrs());
                    break;
                case 11:
                    System.out.println("Jumlah yang sudah KRS: " + antrian.getJumlahSudahKrs());
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while( pilihan != 0);
        sc.close();
    }
}
