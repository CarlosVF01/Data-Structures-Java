package datastructures.linkedlist.doubly;

import java.util.Collection;

public class SortedDoublyLinkedList<T extends Comparable<T>> {
    public int count;
    protected SortedDoublyLinkedListNode<T> head;
    protected SortedDoublyLinkedListNode<T> tail;

    public void add(T value) {
        SortedDoublyLinkedListNode<T> newNode = new SortedDoublyLinkedListNode<>(value);
        if (head == null) {
            head = newNode;
            tail = head;
        } else if (head.value.compareTo(newNode.value) >= 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;

        } else if (tail.value.compareTo(newNode.value) < 0) {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        } else {

            SortedDoublyLinkedListNode<T> tempNode = head;

            while (tempNode.value.compareTo(newNode.value) < 0) {
                tempNode = tempNode.next;
            }
            newNode.next = tempNode;
            newNode.previous = tempNode.previous;
            tempNode.previous.next = newNode;
            tempNode.previous = newNode;
        }
        count++;
    }

    public void addAll(Collection<T> values) {
        for (T value : values) {
            add(value);
        }
    }

    public void addAll(T[] values) {
        for (T value : values) {
            add(value);
        }
    }

    public void show() {
        if (count == 0) {
            System.out.println("No values");
            return;
        }

        SortedDoublyLinkedListNode<T> current = head;

        for (int i = 0; i < count; i++) {
            System.out.println("Index: " + i + ", value: " + current.value);
            current = current.next;
        }
    }

    public SortedDoublyLinkedListNode<T> getHead() {
        return head;
    }

    public SortedDoublyLinkedListNode<T> getTail() {
        return tail;
    }
}



