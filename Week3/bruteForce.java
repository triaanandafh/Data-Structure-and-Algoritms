package Week3;

public class bruteForce {
    public static void main(String[] args) {
        int [] angka = {2,4,6,8,10,12,14,16,18};

        cariMinMax(angka);

    }

    public static void cariMinMax(int [] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Min: " + min + ", Max: " + max);
    }
}
