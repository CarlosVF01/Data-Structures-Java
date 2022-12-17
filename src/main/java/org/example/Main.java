package org.example;

import org.example.linkedlist.DoublyLinkedList;
import org.example.linkedlist.DoublyLinkedListNode;

public class Main {
    public static void main(String[] args) {
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
}