package Week3;

public class divide {
    public static void main(String[] args) {
        int [] angka = {2,4,6,8,10,12,14,16,18};

        int hasil [] = cariMinMax(angka, 0, angka.length -1);

        System.out.println("Min: " + hasil[0] + ", Max: " + hasil[1]);
    }

    public static int [] cariMinMax(int [] arr, int kanan, int kiri) {
        int bagiDua = (kanan + kiri) / 2;

        if(kiri >= kanan){
            return new int []{arr[kiri], arr[kanan]};
        }

        int[] kiriMinMax = cariMinMax(arr, kiri, bagiDua);
        int[] kananMinMax = cariMinMax(arr, bagiDua + 1, kanan);

        int min = Math.min(kiriMinMax[0], kananMinMax[0]);
        int max = Math.max(kiriMinMax[1], kananMinMax[1]);

        return new int[] {min, max};
    }
}
