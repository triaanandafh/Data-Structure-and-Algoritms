package Praktikum6;
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

        System.out.println("Data dosen sebelum sorting");
        dataDosen.tampil();

        System.out.println("Data dosen setelah sorting secara ASC (termuda ke tertua): ");
        dataDosen.sortingASC();
        dataDosen.tampil();

        System.out.println("Data dosen setelah sorting secara DSC (tertua ke termuda): ");
        dataDosen.sortingDSC();
        dataDosen.tampil();
    }
    }
    

