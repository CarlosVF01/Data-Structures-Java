package datastructures.linkedlist.models.doubly;

import datastructures.linkedlist.ILinkedList;

public class SortedDoublyLinkedList<T extends Comparable<T>> implements ILinkedList<BaseDoublyLinkedListNode<T>, T> {
    public int count;
    protected BaseDoublyLinkedListNode<T> head;
    protected BaseDoublyLinkedListNode<T> tail;

    public void add(T value) {
        BaseDoublyLinkedListNode<T> newNode = new SortedDoublyLinkedListNode<>(value);

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
            BaseDoublyLinkedListNode<T> tempNode = head;

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

    @Override
    public BaseDoublyLinkedListNode<T> find(T value) {
        if (head == null){
            return null;
        }
        BaseDoublyLinkedListNode<T> currentNode = head;

        while (currentNode != null){
            if (currentNode.value.equals(value)){
                return currentNode;
            }
            currentNode = currentNode.next;
        }

        return null;
    }

    @Override
    public boolean remove(T value) {
        BaseDoublyLinkedListNode<T> found = find(value);
        if (found == null) {
            return false;
        }

        BaseDoublyLinkedListNode<T> foundPrevious = found.previous;
        BaseDoublyLinkedListNode<T> foundNext = found.next;

        if (foundPrevious == null) {
            head = foundNext;
            if (head != null) {
                head.previous = null;
            }
        } else {
            foundPrevious.next = foundNext;
        }

        if (foundNext == null) {
            tail = foundPrevious;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            foundNext.previous = foundPrevious;
        }



        //TODO
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        //TODO
        return false;
    }

    @Override
    public boolean contains(T value) {
        //TODO
        return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        count = 0;
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

        BaseDoublyLinkedListNode<T> current = head;

        for (int i = 0; i < count; i++) {
            System.out.println("Index: " + i + ", value: " + current.value);
            current = current.next;
        }
    }
}



