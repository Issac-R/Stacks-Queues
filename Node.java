public class Node<Integer> {
    private int num;
    private Node<Integer> next;

    // Constructors
    public Node() {
    }

    public Node(int num) {
        this.num = num;
        next = null;
    }

    // Setters
    public void setNum(int num) {
        this.num = num;
    }

    public void setNext(Node<Integer> N) {
        next = N;
    }

    // Getters
    public int getNum() {
        return num;
    }

    public Node<Integer> getNext() {
        return next;
    }

    // Other methods
    public int sizeFromNode() {
        Node<Integer> iter = this;
        int size = 0;
        while (iter != null) {
            size++;
            iter = iter.getNext();
        }
        return size;
    }
}