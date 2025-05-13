package Praktikum9;
import java.util.Scanner;

public class SuratDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat21 stack = new StackSurat21(5);
        int pilih;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis izin Surat (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi(hari): ");
                    int durasi = sc.nextInt();

                    Surat21 surat = new Surat21(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.printf("Surat %s berhasil diajukan\n", surat.namaMahasiswa);
                    break;
                case 2:
                    Surat21 diproses = stack.pop();
                    if(diproses != null) {
                        System.out.println("Surat atas nama " + diproses.namaMahasiswa + " diproses.");
                    }
                    break;
                case 3:
                    Surat21 intip = stack.peek();
                    if (intip != null) {
                        System.out.println("Surat terakhir diajukan oleh " + intip.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama Mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stack.SequentialSearching(cariNama, stack);
                    break;
                case 5:
                    System.out.println("Terima kasih.");
                    sc.close();
                    return;
                default:
                    break;
            }
        }while (pilih >= 1 && pilih <= 5);
        sc.close();
    }
}
