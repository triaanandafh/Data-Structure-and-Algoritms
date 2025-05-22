package Praktikum12;

import javax.xml.crypto.dsig.keyinfo.KeyName;

public class DoubleLinkedLists {
    Node21 head;
    Node21 tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa21 data) {
        Node21 newNode = new Node21(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa21 data) {
        Node21 newNode = new Node21(data);
        if(isEmpty()) {
        head = tail = newNode;
        } else {
            tail.next = newNode;
            // newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa21 data) {
        Node21 current = head;

        //cari node dengan nim = keynim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        } 
        if(current == null) {
            System.out.println("Node dengan NIM " +keyNim + " tidak ditemukan.");
            return;
        }

        Node21 newNode = new Node21(data);

        //jika current adalah tail, cukup tambahkan di akhir 
        if(current == tail) {
            current.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelha NIM " + keyNim);
    }

    public void print() {
        Node21 current = head;
        while (current != null) {
            Mahasiswa21 mhs = current.data;
            current.data.tampil();
            current = current.next;
        }
    }

    public Mahasiswa21 removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } 

        Mahasiswa21 dataterhapus = head.data;
        if(size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }   
        size--;
        System.out.println("Data yg dihapus dari depan: ");
        dataterhapus.tampil();
        return dataterhapus;
    }


    public Mahasiswa21 removeLast() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } 
        Mahasiswa21 dataterhapus = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            Node21 current = head;
            while ( current.next.next != null){
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        size--;
        System.out.println("Data yang terhapus dari belakang: ");
        dataterhapus.tampil();
        return dataterhapus;
    }

    public Node21 search(String cariNim) {
        Node21 current = head;

        while (current != null) {
            if (current.data.nim.equals(cariNim)) {
                System.out.println("NIM ditemukan: ");
               current.data.tampil();
               return current;
            }
            current = current.next;
        }
        System.out.println("NIM tidak ditemukan.");
        return null;
    }

    public void add(int index, Mahasiswa21 data) {
        if(index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }

        if(index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else{
            Node21 newNode = new Node21(data);
            Node21 current =head;

            for(int i = 0; i < index; i++){
                current = current.next;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }
    public void removeAfter(String key){
        Node21 current = head;
        while (current != null) {
            if (current.data.nim.equals(key)) {
                if (current.next != null) {
                    Node21 toDelete = current.next;
                    current.next = toDelete.next;

                    if (toDelete.next != null) {
                        toDelete.next.prev = current;
                    } else {
                        tail = current; // Jika yang dihapus adalah tail
                    }
                    size--;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Key tidak ditemukan.");
    }

    public void remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node21 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public Mahasiswa21 getFirst() throws Exception{
        if (head == null) {
            throw new Exception("List kosong");
            // return null;
        }
        return head.data;
    }

    public Mahasiswa21 getLast() {
        if (tail == null) {
            System.out.println("List kosong");
            return null;
        }
        return tail.data;
    }

    public Mahasiswa21 getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return null;
        }

        Node21 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int getSize() {
        return size;
    }
}
