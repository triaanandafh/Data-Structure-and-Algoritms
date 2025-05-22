package Praktikum11;

public class QueueLL {
    NodeMahasiswa21 front, rear;
    int size;

    public QueueLL() {
        front = rear = null;
        size = 0;
    }
     
    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Mahasiswa21 mhs) {
        NodeMahasiswa21 tmp = new NodeMahasiswa21(mhs);
        if(isEmpty()) {
            front = rear = tmp;
        } else {
            rear.next = tmp;
            rear = tmp;
        } 
        size++;
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Memanggil: ");
            front.data.tampil();
            front = front.next;
            size--;
            if(front == null) rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Isi Antrian:");
            NodeMahasiswa21 current = front;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }
}
