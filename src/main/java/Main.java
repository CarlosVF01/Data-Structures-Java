import datastructures.linkedlist.DoublyLinkedList;
import datastructures.linkedlist.DoublyLinkedListNode;
import datastructures.linkedlist.SingleLinkedList;
import datastructures.linkedlist.SingleLinkedListNode;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> linkedList = new DoublyLinkedList<>();

        for (int i = 0; i < 100; i++) {
            linkedList.add(i + "te");
        }
        linkedList.remove("4te");

        DoublyLinkedListNode<String> find = linkedList.find("3te");
        DoublyLinkedListNode<String> findReverse = linkedList.findReverse("3te");

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