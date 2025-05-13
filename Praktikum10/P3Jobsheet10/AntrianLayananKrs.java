package Praktikum10.P3Jobsheet10;

public class AntrianLayananKrs {
    Mhs[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKrs = 0;

    public AntrianLayananKrs(int max) {
        this.max= max;
        this.data = new Mhs[max];
        this.size=0;
        this.front = 0;
        this.rear = -1;
    }

    public void tambahAntrian(Mhs mhs) {
        if(isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masih ke antrian.");
    }

    public Mhs[] layaniDuaMahasiswa() {
        Mhs[] layani = new Mhs[2];
        if(isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else if(size == 1){
            layani[0] = data[front];
            front = (front +1) % max;
            size--;
            sudahKrs++;
            System.out.println("Hanya 1 mahasiswa yang dapat dilayani:");
            layani[0].tampilkanData();
        } else{
            layani[0] = data[front];
            front = (front +1) % max;
            size--;
            sudahKrs++;

            layani[1] = data[front];
            front = (front +1) % max;
            size--;
            sudahKrs++;

            System.out.println("2 Mahasiswa berhasil dilayani");
            layani[0].tampilkanData();
            layani[1].tampilkanData();
        }
        return layani;
    }

    public boolean isEmpty(){
        if (size==0) {
            return true;
        } else{
            return false;
        }
    }
    public boolean isFull() {
        if (size==max){
            return true;
        } else{
            return false;
        }
    }
    public void lihatTerdepan() {
        if(!isEmpty()) {
            System.out.println("2 Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            int kedua = (front + 1) % max;
            data[kedua].tampilkanData();
        } else{
            System.out.println("Antrian kosong");
        }
    }

    public void lihatAkhir(){
        if(!isEmpty()) {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        } else{
            System.out.println("Antrian kosong");
        }
    }

    public void tampilkanSemua() {
        if(isEmpty()) {
            System.out.println("Antrian kosong.");
        } 
        System.out.println("Daftar Mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i< size; i++) {
               int index = (front + i) % max;
               System.out.print((i+1) + ". ");
               data[index].tampilkanData();
            }
        }
    
    public int getJumlahAntrian() {
       return size;
    }

    public void clear() {
        if(!isEmpty()) {
            front = rear =-1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else{
            System.out.println("Queue masih kosong");
        }
    }

    public int getBelumKrs(){
        return 30-sudahKrs;
    }

    public int getJumlahSudahKrs(){
        int total = 30;
        return sudahKrs;
    }

}

