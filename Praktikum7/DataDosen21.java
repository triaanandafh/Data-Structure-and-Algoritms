package Praktikum7;
import java.util.ArrayList;

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

    ArrayList<Integer> sequentialSearching(int cari){
        ArrayList<Integer> posisiList = new ArrayList<>();
        // int posisi = -1;
        for(int j = 0; j <dataDosen.length; j++) {
            if(dataDosen[j].usia == (cari)){
                posisiList.add(j);
            }
        }
        return posisiList;
    }

    void tampilPosisi(String x, ArrayList<Integer> posList){
        if(posList.isEmpty()){
            System.out.println("data " +x+ " tidak ditemukan");
        } else{
            for(int pos : posList){
                System.out.println("Data dosen dengan usia : " +x+ " ditemukan pada indeks " + pos);
            }
        }
    }

    void tampilDataSearch(String x, ArrayList<Integer> posList){
        if(posList.isEmpty()){
            System.out.println("Data Dosen dengan usia " +x+ " tidak ditemukan");
        }
        else{
            if(posList.size() > 1){
                System.out.println("**Peringatan: Ditemukan lebih dari satu dosen dengan usia " + x);
            }
            for (int pos : posList){
                System.out.println("Kode          : " +dataDosen[pos].kode);
                System.out.println("Nama          : " + dataDosen[pos].nama);
                System.out.println("Jenis Kelamin : " + (dataDosen[pos].jenisKelamin.equals("true") ? "Pria":"Wanita"));
                System.out.println("Usia          : " + dataDosen[pos].usia);
                System.out.println("-------------------------");
            }
           
        }
    }

    ArrayList<Integer> findBinarySearch(int cari, int left, int right){
        ArrayList<Integer> hasil = new ArrayList<>();
        int mid;
        if (left > right){
            return hasil;
        }
        mid = (left + right)/2;
        
            if(cari == dataDosen[mid].usia){
                hasil.add(mid);

                int i = mid - 1;
                while (i >= left && dataDosen[i].usia == cari) {
                    hasil.add(i);
                    i--;
                }

                int j = mid + 1;
                while (j <= right && dataDosen[j].usia == cari) {
                    hasil.add(j);
                    j++;
                }

                return hasil;
            }
            if (dataDosen[mid].usia>cari){
               return findBinarySearch(cari, left, mid-1);
           } else {
               return findBinarySearch(cari, mid + 1, right);
           }

            // return hasil;
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


