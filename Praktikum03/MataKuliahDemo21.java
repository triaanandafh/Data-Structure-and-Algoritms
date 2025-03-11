package Praktikum03;
import java.util.Scanner;

public class MataKuliahDemo21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlahMK = sc.nextInt();
        MataKuliah21[] arrayOfMataKuliah = new MataKuliah21[jumlahMK];
        String kode, nama, dummy;
        int sks, jumlahJam;
    
    
        for(int i = 0; i < jumlahMK; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i] = new MataKuliah21();
            arrayOfMataKuliah[i].tambahData();
            System.out.println("---------------------------");
        }
        
        for(int i = 0; i < jumlahMK; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("---------------------------");
        }
    }
}
