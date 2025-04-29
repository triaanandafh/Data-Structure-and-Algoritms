package Praktikum6;

public class DataDosen21 {
    Dosen21 [] dataDosen = new Dosen21[10];
    int idx;

    DataDosen21(int jumlah) {
        dataDosen = new Dosen21[jumlah];
        idx = 0;
    }

    void tambah (Dosen21 dsn){
        if(idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++;
        }else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for(int i = 0; i < idx; i++){
            dataDosen[i].tampil();
            System.out.println("-----------------------");
        }
    }

    void sortingASC() {
        for (int i = 0; i<idx-1; i++){
            for(int j = 0; j < idx - i -1; j++){
                if(dataDosen[j].usia > dataDosen[j+1].usia) {
                    Dosen21 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC(){
        for(int i = 0; i < idx -1; i++){
            int maxIdx = i;
            for(int j = i +1; j< idx; j++){
                if(dataDosen[j].usia > dataDosen[maxIdx].usia){
                    maxIdx = j;
                }
            }
            Dosen21 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}
