public class Execute {

    public static void main(String[] args) {

        System.out.println("*****************************");
        System.out.println("           Stacks            ");
        System.out.println("*****************************");
        System.out.println();

        // Array list
        StackA S1 = new StackA(5);
        S1.push(1);
        S1.push(2);
        S1.push(3);
        S1.push(4);
        S1.push(5);
        S1.print();

        System.out.println("Is the Array Stack Full?: " + S1.isFull());
        System.out.println();

        System.out.println("Array Stack Poped");
        S1.pop();
        S1.print();
        System.out.println();

        System.out.println("Peek is: " + S1.peek());
        System.out.println();

        System.out.println("Array is cleared");
        S1.clear();
        System.out.println();

        System.out.println("Is the Array empty? " + S1.isEmpty());
        System.out.println();

        System.out.println("*****************************");
        System.out.println();

        // Linked list
        Node<Integer> iter = new Node<Integer>(1);
        Node<Integer> iter2 = new Node<Integer>(2);
        Node<Integer> iter3 = new Node<Integer>(3);
        Node<Integer> iter4 = new Node<Integer>(4);
        Node<Integer> iter5 = new Node<Integer>(5);

        StackL S2 = new StackL(iter);
        S2.push(iter2);
        S2.push(iter3);
        S2.push(iter4);
        S2.push(iter5);
        S2.print();
        System.out.println();

        System.out.println("Linked List Stack Poped");
        System.out.println();
        S2.pop();
        S2.print();
        System.out.println();

        System.out.println("Peek is: " + S2.peek().getNum());
        System.out.println();

        System.out.println("Linked List Stack is cleared");
        S2.clear();
        System.out.println();

        System.out.println("Is the Linked List Stack empty? " + S2.isEmpty());
        System.out.println();

        System.out.println("*****************************");
        System.out.println("           Queues            ");
        System.out.println("*****************************");
        System.out.println();

        QueueA S3 = new QueueA(5);
        S3.Enqueue(1);
        S3.Enqueue(2);
        S3.Enqueue(3);
        S3.Enqueue(4);
        S3.Enqueue(5);
        S3.print();
        System.out.println();

        System.out.println("Is the Queue Full?: " + S3.isFull());
        System.out.println();

        System.out.println("Queue Dequeue'd");
        S3.Dequeue();
        S3.print();
        System.out.println();

        System.out.println("Peek is: " + S3.peek());
        System.out.println();

        System.out.println("Queue is cleared");
        S3.clear();
        System.out.println();

        System.out.println("Is the Queue empty? " + S3.isEmpty());
        System.out.println();

        System.out.println("*****************************");
        System.out.println();

        // Linked list

        QueueL S4 = new QueueL(iter);
        S4.Enqueue(iter2);
        S4.Enqueue(iter3);
        S4.Enqueue(iter4);
        S4.Enqueue(iter5);
        S4.print();
        System.out.println();

        System.out.println("Linked List Queue Dequeue'd");
        System.out.println();
        S4.Dequeue();
        S4.print();
        System.out.println();

        System.out.println("Peek is: " + S4.peek().getNum());
        System.out.println();

        System.out.println("Linked List Queue is cleared");
        S4.clear();
        System.out.println();

        System.out.println("Is the Linked List Queue empty? " + S4.isEmpty());
        System.out.println();
    }
}