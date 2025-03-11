package Week3;

public class brute2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci ke-" + n + " (iteratif): " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int a = 0, b=1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;

    }


}
