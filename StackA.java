public class StackA {
    private int[] Array;
    private int Size;

    public StackA(int Size) {
        this.Size = Size;
        this.Array = new int[Size];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = -999;
        }
    }

    // Getters
    public int getSize() {
        return Size;
    }

    // Stack Methods
    public void push(int num) {
        if (!isFull()) {
            int i = 0;
            while (Array[i] != -999) {
                i++;
            }
            Array[i] = num;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (Array[0] == -999) {
            System.out.println("Cannot pop stack is empty");
        } else {
            if (isFull()) {
                Array[Array.length - 1] = -999;
            } else {
                int i = 0;
                while (Array[i] != -999) {
                    i++;
                }
                Array[i - 1] = -999;
            }
        }
    }

    public int peek() {
        if (Array[0] == -999) {
            System.out.println("Stack is empty");
            return -999;
        } else if (isFull()) {
            return Array[Size - 1];
        }
        int peek = 0;
        for (int i = 0; i < Size; i++) {
            if (Array[i] != -999) {
                peek = Array[i];
            }
        }
        return peek;
    }

    public void clear() {
        int i = 0;
        while (Array[i] != -999) {
            Array[i] = -999;
            i++;
        }
    }

    public boolean isEmpty() {
        if (Array[0] != -999) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (Array[Size - 1] != -999) {
            return true;
        }
        return false;
    }

    public void print() {
        if (Array[0] == -999) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] == -999) {
                    break;
                }
                System.out.println("Stack " + i + ": " + Array[i]);
            }
            System.out.println();
        }
    }
}