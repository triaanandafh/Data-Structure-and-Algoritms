package Praktikum7;
import java.util.ArrayList;
import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah data dosen: ");
        int jumlah = sc.nextInt();
        DataDosen21 dataDosen = new DataDosen21(jumlah);

        for(int i = 0; i<jumlah; i++){
            System.out.println("Masukkan data dosen ke-" + (i+1));
            sc.nextLine();
            System.out.print("Masukkan kode dosen: ");
            String kode = sc.nextLine();
            System.out.print("Masukkan nama dosen: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan jenis kelamin dosen (true = L, false = P): ");
            boolean jk = sc.nextBoolean();
            System.out.print("Masukkan usia: ");
            int usia = sc.nextInt();
            sc.nextLine();

            System.out.println("-------------------------");

            Dosen21 dsn = new Dosen21(kode, nama, jk, usia);
            if(dsn != null){
                dataDosen.tambah(dsn);
            }
        }

        System.out.println("-------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------");
        System.out.println("Masukkan usia dosen yang dicari: ");
        System.out.print("Usia: ");
        String cari = sc.nextLine();

        System.out.println("----------------------------------");
        System.out.println("menggunakan Binary Searching");
        System.out.println("----------------------------------");
        // int posisi2 = dataDosen.findBinarySearch(34, 0, jumlah-1);
        // int pss2 = (int)posisi2;
        // dataDosen.sortingASC();
        int usiaCari = Integer.parseInt(cari);
        ArrayList<Integer> hasil = new ArrayList<>();
        hasil = dataDosen.findBinarySearch(40, 0, jumlah-1);
        dataDosen.tampilPosisi(cari, hasil);
        dataDosen.tampilDataSearch(cari, hasil);

        // System.out.println("Data dosen sebelum sorting");
        // dataDosen.tampil();

        // System.out.println("Data dosen setelah sorting secara ASC (termuda ke tertua): ");
        // dataDosen.sortingASC();
        // dataDosen.tampil();

        // System.out.println("Data dosen setelah sorting secara DSC (tertua ke termuda): ");
        // dataDosen.sortingDSC();
        // dataDosen.tampil();
    }
    }
    



