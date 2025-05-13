package Praktikum10.P2Jobsheet10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan(int max) {
        this.max= max;
        this.data = new Mahasiswa[max];
        this.size=0;
        this.front = 0;
        this.rear = -1;
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if(isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masih ke antrian.");
    }

    public Mahasiswa layaniMahasiswa() {
        if(isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size --;
        return mhs;
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
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
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
    // public void Enqueue(int dt){
    //     if(isFull()) {
    //         System.out.println("Queue sudah penuh");
    //     } else{
    //         if(isEmpty()) {
    //             front = rear = 0;
    //         } else{
    //             if(rear == max -1) {
    //                 rear =0;
    //             } else{
    //                 rear++;
    //             }
    //         }
    //         data[rear] = dt;
    //         size++;
    //     }
    // }

    // public int Dequeue() {
    //     int dt=0;
    //     if (isEmpty()) {
    //         System.out.println("Queue masih kosong");
    //     } else{
    //         dt= data[front];
    //         size--;
    //         if(isEmpty()) {
    //             front = rear =-1;
    //         } else{
    //             if(front == max-1) {
    //                 front =0;
    //             } else {
    //                 front++;
    //             }
    //         }
    //     }
    //     return dt;
    // }
}

