import datastructures.linkedlist.doubly.DoublyLinkedList;
import datastructures.linkedlist.doubly.DoublyLinkedListNode;
import datastructures.linkedlist.doubly.SortedDoublyLinkedList;
import datastructures.linkedlist.single.SingleLinkedList;
import datastructures.linkedlist.single.SingleLinkedListNode;

public class Main {
    public static void main(String[] args) {
        SortedDoublyLinkedList<Double> sortedDoublyLinkedList = new SortedDoublyLinkedList<>();

        sortedDoublyLinkedList.add(3.3);
        sortedDoublyLinkedList.add(2.5);
        sortedDoublyLinkedList.add(1.4342);
        sortedDoublyLinkedList.add(1.4343);
        sortedDoublyLinkedList.add(1.4344);

        sortedDoublyLinkedList.addAll(new Double[]{1.5, 2.3, 33.2, 43.3, 0.2, 0.3});
        sortedDoublyLinkedList.show();

    }

    private void doublyLinkedListThings() {
        DoublyLinkedList<String> linkedList = new DoublyLinkedList<>();

        for (int i = 0; i < 100; i++) {
            linkedList.add(i + "te");
        }
        linkedList.remove("4te");

        DoublyLinkedListNode<String> find = linkedList.find("3te");
        DoublyLinkedListNode<String> findReverse = linkedList.findReverse("3te");

        System.out.println(find != null);
        System.out.println(findReverse != null);

    }

    private void singleLinkedListThings() {
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