package UTS_TriaAnanda;
import java.util.Scanner;
import java.util.ArrayList;

public class TokoAbc {
    static ArrayList<BarangTokoAbc> daftarBarang = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int nomor = 0;
        while (nomor != 6) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Input Data Barang");
            System.out.println("2. Penjualan Barang");
            System.out.println("3. Urutkan Data Berdasarkan Stok");
            System.out.println("4. Tampilkan Barang Terlaris");
            System.out.println("5. Tampilkan Semua Data");
            System.out.println("6. Keluar");
            System.out.print("Pilih angka: ");
            nomor = input.nextInt();

            switch (nomor){
                case 1 :
                    inputBarang();
                    break;
                case 2:
                    penjualan();
                    break;
                case 3:
                    cekStokTerbanyak();
                    break;
                case 4:
                    cekBarangTerlaris();
                    break;
                case 5:
                    tampilkanBarang();
                    break;
                case 6:
                    System.out.println("========== SELESAI ==========");
                    break;
            }
        }
    }

    static void inputBarang(){
        input.nextLine();
        System.out.print("\nMasukkan kode barang: ");
        String kode = input.nextLine();
        System.out.print("Masukkan nama barang: ");
        String nama = input.nextLine();
        System.out.print("Masukkan stok barang: ");
        int stok = input.nextInt();
        System.out.print("Masukkan harga satuan: ");
        int hargaSatuan = input.nextInt();

        daftarBarang.add(new BarangTokoAbc(kode, nama, stok, hargaSatuan));
        System.out.println("Barang berhasil ditambahkan.");
    }

    static void penjualan() {
        if(daftarBarang.isEmpty()) {
            System.out.println("Belum ada data barang.");
            return;
        }

        tampilkanBarang();
        ArrayList<String> kodebeli = new ArrayList<>();
        ArrayList<Integer> jumlahbeli = new ArrayList<>();
        String tambah = "Y";

        while (tambah.equalsIgnoreCase("Y")) {
            input.nextLine();
            System.out.print("\nMasukkan kode barang yang akan dibeli : ");
            String kode = input.nextLine();
            System.out.print("Masukkan jumlah barang yang dibeli : ");
            int jumlah = input.nextInt();
            input.nextLine();

            BarangTokoAbc barang = cariBarang(kode);
            if (barang != null && barang.stok >= jumlah){
                barang.stok -= jumlah;
                barang.jumTerjual += jumlah;
                kodebeli.add(kode);
                jumlahbeli.add(jumlah);
            }else{
                System.out.println("Stok tidak cukup atau barang tidak ditemukan.");
            }

            System.out.println("Apakah anda ingin menambahkan barang yang dibeli?");
            tambah = input.nextLine();
        }

        int totalBayar = 0;
        for(int i = 0; i< kodebeli.size(); i++){
            BarangTokoAbc barang = cariBarang(kodebeli.get(i));
            int jumlah = jumlahbeli.get(i);
            int total = barang.hargaSatuan * jumlah;
            totalBayar += total;
            System.out.println("----------------------------");
            System.out.printf("kode | Nama            | Jumlah | Harga | Total Harga\n");
            System.out.println("-------------------------------------------");
            System.out.printf("%-4s | %-15s| %-7d| %-6d| %-12d\n", barang.kode, barang.nama, jumlah, barang.hargaSatuan, total);

        }
        System.out.println("Total bayar adalah = " + totalBayar);
    }

    static void cekStokTerbanyak() {
      
        for(int i = 0; i <daftarBarang.size(); i++){
            for(int j = 0; j < daftarBarang.size() - 1 - i; j++) {
                if(daftarBarang.get(j).stok < daftarBarang.get(j+1).stok) {
                    BarangTokoAbc temp = daftarBarang.get(j);
                    daftarBarang.set(j, daftarBarang.get(j + 1));
                    daftarBarang.set(j + 1, temp);
                }
            }
        }
        System.out.println("Berikut ini adalah List Daftar Barang dengan stok terbanyak ke sedikit : "); 
        for( BarangTokoAbc b : daftarBarang) {
            System.out.printf("Kode: %-4s, Nama: %-15s, Stok: %-7d, Harga: %-6d\n", b.kode, b.nama, b.stok, b.hargaSatuan);
        }
    }

    static void cekBarangTerlaris() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Belum ada data barang.");
            return;
        }

        for (int i = 0; i < daftarBarang.size(); i++) {
            for (int j = 0; j < daftarBarang.size() - 1 - i; j++) {
                if (daftarBarang.get(j).jumTerjual < daftarBarang.get(j + 1).jumTerjual) {
                    BarangTokoAbc temp = daftarBarang.get(j);
                    daftarBarang.set(j, daftarBarang.get(j + 1));
                    daftarBarang.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nBarang terlaris adalah :");
        for (BarangTokoAbc b : daftarBarang) {
            System.out.printf("Kode: %s, Nama: %s, Terjual: %d\n", b.kode, b.nama, b.jumTerjual);
        }
    }

    static void tampilkanBarang() {
        System.out.println("\nData barang yang ada:");
        for (BarangTokoAbc b : daftarBarang) {
            System.out.printf("Kode: %s, Nama: %s, Stok: %d, Harga: %d\n", b.kode, b.nama, b.stok, b.hargaSatuan);
        }
    }

    static BarangTokoAbc cariBarang (String kode) {
        for (BarangTokoAbc brg : daftarBarang) {
            if(brg.kode.equalsIgnoreCase(kode)) {
                return brg;
            }
        }
        return null;
    }
}
