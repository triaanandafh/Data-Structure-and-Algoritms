package Praktikum05.BruteForceDivideConquer;

public class Faktorial {
    // int faktorialBF(int n) {
    //     int fakto = 1;
    //     for(int i = 1; i <= n; i++) {
    //         fakto = fakto * i;
    //     }
    //     return fakto;
    // } 

    int faktorialBF(int n) {
        int fakto = 1, i = 1;
        do {
            fakto *= i;
            i++;
        } while (i <= n);
        return fakto;
    }



    int faktorialDC(int n) {
        if(n == 1) {
            return 1;
        }else{
            int fakto = n* faktorialDC(n-1);
            return fakto;
        }
    }
}
