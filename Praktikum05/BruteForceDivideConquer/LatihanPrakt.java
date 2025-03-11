package Praktikum05.BruteForceDivideConquer;

public class LatihanPrakt {
    public static void main(String[] args) {
        int nilaiUTS [] = {78, 85, 90, 92, 88, 80, 82};
        int nilaiUAS [] = {82, 88, 87, 79, 95, 85, 83, 84};

        int utsTertinggi = cariMax(nilaiUTS, 0, nilaiUTS.length-1);
        int utsTerendah = cariMin(nilaiUTS, 0, nilaiUTS.length-1);

        double rataRataUAS =  hitungRataRata(nilaiUAS);

        System.out.println("Nilai UTS tertinggi: " + utsTertinggi);
        System.out.println("Nilai UTS terendah: " + utsTerendah);
        System.out.println("Rata-rata nilai UAS: "+ rataRataUAS);
    }

    public static int cariMax(int arr [], int kiri, int kanan) {
        if(kiri == kanan) {
            return arr[kiri];
        }
        int tengah = (kiri + kanan)/2;
        int kiriMax = cariMax(arr, kiri, tengah);
        int kananMax = cariMax(arr, tengah + 1, kanan);
        return Math.max(kiriMax, kananMax);
    }
    public static int cariMin(int arr [], int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri];
        }
        int tengah = (kiri + kanan)/2;
        int kiriMin = cariMin(arr, kiri, tengah);
        int kananMin = cariMin(arr, tengah+1, kanan);
        return Math.min(kiriMin, kananMin);
    }

    public static double hitungRataRata(int arr []) {
        int total = 0;
        for(int nilai : arr) {
            total += nilai;
        }
        return (double) total /arr.length;
    }

}
