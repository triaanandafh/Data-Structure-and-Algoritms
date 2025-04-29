package Praktikum7;
import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21(jumMhs);


        for(int i = 0; i<jumMhs; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1) + ": ");
            // sc. nextLine();
            sc.nextLine();
            System.out.print("NIM  : ");
            String nim = sc.nextLine();
            // sc.nextInt();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK  : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            System.out.println("-------------------------");

            Mahasiswa21 m = new Mahasiswa21(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();

        System.out.println("-------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan binary search");
        double posisi2 = list.sequentialSearching(cari);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        // Mahasiswa21 m1 = new Mahasiswa21("123", "Zidan", "2A", 3.2);
        // Mahasiswa21 m2 = new Mahasiswa21("124", "Ayu", "2A", 3.5);
        // Mahasiswa21 m3 = new Mahasiswa21("125", "Sofi", "2A", 3.1);
        // Mahasiswa21 m4 = new Mahasiswa21("126", "Sita", "2A", 3.9);
        // Mahasiswa21 m5 = new Mahasiswa21("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        // System.out.println("Data mahasiswa sebelum sorting");
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionSort();
        // list.tampil();
    }
}


