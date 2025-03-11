package Week3;

public class divide2 {
    public static void main(String[] args) {
        int n = 10;
        int hasil = fibonacci(n);
        
        System.out.println("Fibonacci ke-" + n + " (rekursif): " + hasil);
    }

    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
