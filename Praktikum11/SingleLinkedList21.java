package Praktikum11;

public class SingleLinkedList21 {
    NodeMahasiswa21 head;
    NodeMahasiswa21 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if(!isEmpty()) {
            NodeMahasiswa21 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else{
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa21 input) {
        NodeMahasiswa21 ndInput = new NodeMahasiswa21(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa21 input) {
        NodeMahasiswa21 ndInput = new NodeMahasiswa21(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa21 input) {
        NodeMahasiswa21 ndInput = new NodeMahasiswa21(input, null);
        NodeMahasiswa21 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa21 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa21 temp = head;
            for (int i = 0; i < index -1;i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa21(input, temp.next);
            if(temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
