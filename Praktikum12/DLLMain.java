package Praktikum12;
import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists list = new DoubleLinkedLists();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tampilkan jumlah data");
            System.out.println("8. Tambah data di indeks tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data di indeks tertentu");
            System.out.println("11. Tampilkan data di head, tail, atau indeks tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 : {
                    Mahasiswa21 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                    break;
                }
                case 2: {
                    Mahasiswa21 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                    break;
                }
                case 3: {
                    list.removeFirst();
                    System.out.println("");
                    break;
                }
                case 4: {
                    list.removeLast();
                    break;
                }
                case 5: {
                    list.print();
                    break;
                }
                case 6: {
                    System.out.println("Masukkan NIM yang dicari: ");
                    String cariNim = scan.nextLine();
                    Node21 found = list.search(cariNim);
                    break;
                }
                case 7: {
                    System.out.println("Jumlah data dalam list: " + list.getSize());
                    break;
                }
                case 8: {
                    System.out.println("Masukkan index: ");
                    int index = scan.nextInt(); scan.nextLine();
                    Mahasiswa21 mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                    break;
                }
                case 9: {
                    System.out.println("Masukkan NIM: ");
                    String key = scan.nextLine();
                    list.removeAfter(key);
                    break;
                }
                case 10: {
                    System.out.println("Masukkan indeks: ");
                    int index = scan.nextInt(); scan.nextLine();
                    list.remove(index);
                    break;
                }
                case 11: {
                    System.out.println("Tampilkan data pada: ");
                    System.out.print("Head(H)/Tail(T)/Index tertentu(I) : ");
                    String jawab = scan.nextLine();

                    if (jawab.equals("H")) {
                        System.out.println("Head: " + list.getFirst());
                    } else if (jawab.equals("T")) {
                        System.out.println("Tail: " + list.getLast());
                    } else {
                        System.out.print("Masukkan indeks: ");
                        int index = scan.nextInt(); scan.nextLine();
                        System.out.println("Data: " + list.getIndex(index));
                    }
                }
            
                default:
                    break;
            }
        } while (pilihan != 0);
        scan.close();
    }

    public static Mahasiswa21 inputMahasiswa(Scanner scan) {
    // TODO Auto-generated method stub
System.out.print("Masukkan NIM: ");
String nim = scan.nextLine();
System.out.print("Masukkan nama: ");
String nama = scan.nextLine();
System.out.print("Masukkan Kelas: ");
String kelas = scan.nextLine();
System.out.print("Masukkan IPK:");
double ipk = scan.nextDouble();
// scan.nextLine();

return new Mahasiswa21(nim, nama, kelas,ipk);
}
}


