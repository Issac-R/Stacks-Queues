public class QueueL {

    private Node<Integer> Head;
    private Node<Integer> Tail;
    private int Size;

    public QueueL() {
    }

    public QueueL(Node<Integer> N) {
        Head = N;
        Tail = N;
        Size = 1;
    }

    public int getSize() {
        return Size;
    }

    public void Enqueue(Node<Integer> N) {
        Node<Integer> iter = Tail;
        iter.setNext(N);
        iter = iter.getNext();
        Tail = iter;
        Size++;

    }

    public void Dequeue() {
        if (isEmpty()) {
        } else {
            Node<Integer> iter = Head.getNext();
            Head = iter;
            Size--;
        }
    }

    public Node<Integer> peek() {
        return Head;
    }

    public void clear() {
        Head = null;
        Tail = null;
        Size = 0;
    }

    public boolean isEmpty() {
        if (Head == null) {
            return true;
        }
        return false;
    }

    public void print() {
        Node<Integer> iter = Head;
        for (int i = 0; i < Size; i++) {
            System.out.println("Queue " + i + ": " + iter.getNum());
            iter = iter.getNext();
        }
    }
}