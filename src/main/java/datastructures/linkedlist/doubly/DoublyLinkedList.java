package datastructures.linkedlist.doubly;

import java.util.Collection;

public class DoublyLinkedList<T> implements datastructures.linkedlist.DoublyLinkedList<DoublyLinkedListNode<T>, T> {
    public int count;
    private DoublyLinkedListNode<T> head;
    private DoublyLinkedListNode<T> tail;

    @Override
    public void add(T value) {
        DoublyLinkedListNode<T> node = new DoublyLinkedListNode<>(value);
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
    
    public void insertAt(T value, int index) {

    }

    @Override
    public void addTail(T value) {
        DoublyLinkedListNode<T> node = new DoublyLinkedListNode<>(value);
        if (count == 0) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        count++;
    }

    @Override
    public DoublyLinkedListNode<T> find(T value) {
        DoublyLinkedListNode<T> current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public DoublyLinkedListNode<T> findReverse(T value) {
        DoublyLinkedListNode<T> current = tail;
        while (current != null) {
            if (current.value.equals(value)) {
                return current;
            }
            current = current.previous;
        }
        return null;
    }

    @Override
    public boolean contains(T value) {
        return find(value) != null;
    }

    @Override
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

    @Override
    public boolean removeAt(int index) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    @Override
    public void show() {

    }

}
