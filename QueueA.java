public class QueueA {
    private int[] Array;
    private int Size;
    private int Head;
    private int Tail;

    // Construstors
    public QueueA(int Size) {
        this.Size = Size;
        this.Array = new int[Size];
        for (int i = 0; i < Size; i++) {
            Array[i] = -999;
        }
    }

    // Getters
    public int getSize() {
        return Size;
    }

    // Extra Methods
    public void Enqueue(int num) {
        if (isEmpty()) {
            Array[0] = num;
        } else {
            Array[Tail + 1] = num;
            Tail++;
        }
    }

    public void Dequeue() {
        if (isEmpty()) {
        } else {
            for (int i = 1; i <= Tail; i++) {
                Array[i - 1] = Array[i];
                Array[i] = -999;
            }
            Tail--;
        }
    }

    public int peek() {
        return Array[Head];
    }

    public void clear() {
        for (int i = 0; i <= Tail; i++) {
            Array[i] = -999;
        }
        Head = 0;
        Tail = 0;
    }

    public boolean isEmpty() {
        if (Array[Head] == -999) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (Tail == Size - 1) {
            return true;
        }
        return false;
    }

    public void print() {
        for (int i = Head; i <= Tail; i++) {
            System.out.println("Queue " + i + ": " + Array[i]);
        }
    }
}