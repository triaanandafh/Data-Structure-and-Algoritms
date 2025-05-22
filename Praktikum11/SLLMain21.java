package Praktikum11;
import java.util.Scanner;

public class SLLMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList21 sll = new SingleLinkedList21();

        // String jawab = "";
        // do{
        //     System.out.print("Masukkan NIM: ");
        //     String nim = sc.nextLine();
        //     System.out.print("Masukkan Nama: ");
        //     String nama = sc.nextLine();
        //     System.out.print("Masukkan Kelas: ");
        //     String kelas = sc.nextLine();
        //     System.out.print("Masukkan IPK: ");
        //     double ipk = sc.nextDouble();
        //     sc.nextLine();
        //     System.out.print("Masukkan data lagi? Y/N: ");
        //     jawab = sc.nextLine();

        //     Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas, ipk);
        //     sll.addLast(mhs);
        //     sll.print();
        // } while (jawab.equalsIgnoreCase("Y"));

        Mahasiswa21 mhs1 = new Mahasiswa21("21212203", "Dirga", "4D", 3.6);
        Mahasiswa21 mhs2 = new Mahasiswa21("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa21 mhs3 = new Mahasiswa21("22212202", "Cintia", "3C", 3.5);
        Mahasiswa21 mhs4 = new Mahasiswa21("23212201", "Bimon", "2B", 3.8);

        // Mahasiswa21 
        sll.addFirst(mhs1);
        sll.print();
        sll.addLast(mhs2);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs4);
        sll.print();

        System.out.println("Data index 1 : ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast(); 
        sll.print();
        sll.removeAt(0);
        sll.print();
       }
}
