package Praktikum03;

public class DataDosen21 {

    public void dataSemuaDosen(Dosen21[] arrayOfDosen) {
        System.out.println("=== Data Semua Dosen ====");
        for(int i = 0; i<arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen[i].cetakInfo();
        }
        System.out.println();
    }

    public void jumlahDosenPerjenisKelamin(Dosen21[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for(Dosen21 dosen : arrayOfDosen) {
            if(dosen.jenisKelamin == true) {
                pria++;
            }else{
                wanita++;
            }
        }

        System.out.println("=== Jumlah Dosen Berdasarkan Jenis Kelamin ===");
        System.out.println("Pria :" + pria);
        System.out.println("Wanita : " + wanita);
        System.out.println();

    }

    public void rerataUsiaDosenPerjenisKelamin(Dosen21[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int pria = 0, wanita = 0;

        for(Dosen21 dosen : arrayOfDosen) {
            if(dosen.jenisKelamin == true) {
                totalUsiaPria += dosen.usia;
                pria++;
            }else{
                totalUsiaWanita += dosen.usia;
                wanita++;
            }
        }

        double rataUsiaPria = totalUsiaPria / pria;
        double rataUsiaWanita = totalUsiaWanita / wanita;

        System.out.println("=== Rata-rata Usia Dosen Berdasarkan Jenis Kelamin ===");
        System.out.println("Pria : " + rataUsiaPria);
        System.out.println("Wanita : " + rataUsiaWanita);
        System.out.println();
    }

    public void infoDosenPalingTua(Dosen21[] arrayOfDosen) {
        Dosen21 tertua = arrayOfDosen[0];
        for(Dosen21 dosen : arrayOfDosen) {
            if(dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("=== Dosen Paling Tua ===");
        tertua.cetakInfo();
        System.out.println();
    }

    public void infoDosenPalingMuda(Dosen21[] arrayOfDosen) {
        Dosen21 termuda = arrayOfDosen[0];
        for(Dosen21 dosen : arrayOfDosen) {
            if(dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("=== Dosen Paling Muda ===");
        termuda.cetakInfo();
    }
    

}
