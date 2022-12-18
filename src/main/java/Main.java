import datastructures.deque.models.Deque;
import datastructures.deque.models.Queue;
import datastructures.linkedlist.models.doubly.BaseDoublyLinkedListNode;
import datastructures.linkedlist.models.doubly.DoublyLinkedList;
import datastructures.linkedlist.models.doubly.DoublyLinkedListNode;
import datastructures.linkedlist.models.doubly.SortedDoublyLinkedList;
import datastructures.linkedlist.models.single.SingleLinkedList;
import datastructures.linkedlist.models.single.SingleLinkedListNode;

public class Main {
    public static void main(String[] args) {
        queueThings();
        dequeThings();
        doublyLinkedListThings();
        singleLinkedListThings();
        sortedDoublyLinkedListThings();
    }

    private static void queueThings(){
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(125);

        System.out.println("Peek value: " + queue.peek());
        System.out.println("Dequeue value: " + queue.dequeue());

        queue.show();

        System.out.println(queue.dequeue());
    }

    private static void dequeThings(){
        Deque<Integer> deque = new Deque<>();

        deque.enqueueHead(3);
        deque.enqueueHead(3);
        deque.enqueueHead(3);
        deque.enqueueHead(4);
        deque.enqueueHead(3);

        deque.enqueueTail(4);
        deque.enqueueTail(23);
        deque.enqueueTail(7);

        deque.show();
    }

    private static void sortedDoublyLinkedListThings(){
        SortedDoublyLinkedList<Double> sortedDoublyLinkedList = new SortedDoublyLinkedList<>();

        sortedDoublyLinkedList.add(3.3);
        sortedDoublyLinkedList.add(2.5);
        sortedDoublyLinkedList.add(1.4342);
        sortedDoublyLinkedList.add(1.4343);
        sortedDoublyLinkedList.add(1.4344);

        sortedDoublyLinkedList.addAll(new Double[]{1.5, 2.3, 33.2, 43.3, 0.2, 0.3});
        sortedDoublyLinkedList.show();
    }

    private static void doublyLinkedListThings() {
        DoublyLinkedList<String> linkedList = new DoublyLinkedList<>();

        for (int i = 0; i < 100; i++) {
            linkedList.add(i + "te");
        }
        linkedList.remove("4te");

        BaseDoublyLinkedListNode<String> find = linkedList.find("3te");
        BaseDoublyLinkedListNode<String> findReverse = linkedList.findReverse("3te");

        System.out.println(find != null);
        System.out.println(findReverse != null);

    }

    private static void singleLinkedListThings() {
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.insertAt(30, 0);
        singleLinkedList.insertAt(33, 0);
        singleLinkedList.insertAt(37, 1);
        singleLinkedList.insertAt(45, 2);
        singleLinkedList.insertAt(88, 1);
        singleLinkedList.insertAt(123, 4);
        singleLinkedList.insertAt(1, 4);

        SingleLinkedListNode<Integer> integerSingleLinkedListNode = singleLinkedList.find(37);

        System.out.println("Before delete");
        singleLinkedList.show();
        singleLinkedList.remove(37);
        System.out.println("After delete");
        singleLinkedList.show();
        singleLinkedList.removeAt(5);
        System.out.println("After deleteAt");
        singleLinkedList.show();
        System.out.println("After clear");
        singleLinkedList.clear();
        singleLinkedList.show();
    }
}