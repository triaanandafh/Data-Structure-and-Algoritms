package Praktikum11;
import java.util.Scanner;

import java.util.Scanner;

public class AntrianLayanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLL queue = new QueueLL();

        int pilih;
        do {
            System.out.println("\n==== MENU ANTRIAN ====");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Terdepan");
            System.out.println("4. Cek Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // Buang enter

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan kelas: ");
                    String kelas = sc.nextLine();
                    queue.enqueue(new Mahasiswa21(nim, nama, kelas));
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    queue.printQueue();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + queue.getSize());
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilih != 0);
    }
}
    