package org.example.linkedlist;

public class DoublyLinkedList<T> {
    public int count;
    private DoublyLinkedListNode<T> head;
    private DoublyLinkedListNode<T> tail;


    public void add(T item) {
        addHead(new DoublyLinkedListNode<>(item));
    }

    public void addHead(DoublyLinkedListNode<T> node) {
        DoublyLinkedListNode<T> oldHead = head;

        head = node;

        head.next = oldHead;

        if (count == 0) {
            tail = head;
        } else {
            oldHead.previous = node;
        }
        count++;
    }

    public void addTail(DoublyLinkedListNode<T> node) {
        if (count == 0) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        count++;
    }

    public DoublyLinkedListNode<T> find(T value) {
        DoublyLinkedListNode<T> current = head;
        int i = 0;
        while (current != null) {
            System.out.println("iteration n: " + i++);
            if (current.value.equals(value)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public DoublyLinkedListNode<T> findReverse(T value) {
        DoublyLinkedListNode<T> current = tail;
        int i = 0;
        while (current != null) {
            System.out.println("iteration n: " + i++);
            if (current.value.equals(value)) {
                return current;
            }
            current = current.previous;
        }
        return null;
    }

    public boolean contains(T value) {
        return find(value) != null;
    }

    public boolean remove(T value) {
        DoublyLinkedListNode<T> found = find(value);
        if (found == null) {
            return false;
        }

        DoublyLinkedListNode<T> foundPrevious = found.previous;
        DoublyLinkedListNode<T> foundNext = found.next;

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

        count--;

        return true;
    }

    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

}
