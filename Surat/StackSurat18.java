package Surat;

public class StackSurat18 {
    Surat18[] stack;
    int top;
    int size;

    public StackSurat18(int size) {
        this.size = size;
        stack = new Surat18[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat18 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat18 pop() {
        if (!isEmpty()) {
            Surat18 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat18 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampil();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan!");
        }
    }
}
