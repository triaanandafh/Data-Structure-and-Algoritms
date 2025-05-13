package Praktikum9;

public class StackSurat21 {
    Surat21[] stack;
    int size;
    int top;

    public StackSurat21(int size){
        this.size = size;
        stack = new Surat21[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size -1){
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public void push(Surat21 srt){
        if (!isFull ()) {
            top ++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public Surat21 pop() {
        if (!isEmpty()) {
            Surat21 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dinilai.");
            return null;
        }
    }
    public Surat21 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang diajukan");
            return null;
        }
    }

    void SequentialSearching(String cariNama, StackSurat21 stackSurat){
        boolean found = false;
        for(int i = 0; i <= stackSurat.top; i++){
            if(stackSurat.stack[i].namaMahasiswa.equals(cariNama)) {
                System.out.println("Surat ditemukan!");
                System.out.println("ID Surat    : " + stackSurat.stack[i].idSurat);
                System.out.println("Nama        : " + stackSurat.stack[i].namaMahasiswa);
                System.out.println("Kelas       : " + stackSurat.stack[i].kelas);
                System.out.println("Jenis Izin  : " + stackSurat.stack[i].jenisIzin);
                System.out.println("Durasi      : " + stackSurat.stack[i].durasi);
                found = true;
                break;
            }

        }
        if(!found){
            System.out.println("Surat dengan nama " + cariNama + " tidak ditemukan.");
        }
    }

}
