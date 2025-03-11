package Praktikum03;
import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Dosen21[] arrayOfDosen = new Dosen21[3];
        
        for(int i = 0; i < 3; i++) {
            arrayOfDosen[i] = new Dosen21();
    
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode            : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama            : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin   : ");
            arrayOfDosen[i].jenisKelamin = sc.nextBoolean();
            System.out.print("Usia            : ");
            arrayOfDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("---------------------------");
        }

        int nomor = 1;
        for (Dosen21 dosen : arrayOfDosen ) {
            System.out.println("Data Dosen ke-" + nomor);
            dosen.cetakInfo();
            System.out.println("---------------------------");
            nomor++;
        }
        
        DataDosen21 dataDosen = new DataDosen21();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerjenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerjenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
