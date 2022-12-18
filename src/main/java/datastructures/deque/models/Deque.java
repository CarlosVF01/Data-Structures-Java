package datastructures.deque.models;

import datastructures.deque.IDeque;
import datastructures.linkedlist.models.doubly.BaseDoublyLinkedListNode;
import datastructures.linkedlist.models.doubly.DoublyLinkedList;

public class Deque<T> implements IDeque<T> {
    private final DoublyLinkedList<T> storage = new DoublyLinkedList<>();

    @Override
    public void enqueueHead(T value) {
        storage.add(value);
    }

    @Override
    public void enqueueTail(T value) {
        storage.addTail(value);
    }

    @Override
    public T dequeueHead() {
        BaseDoublyLinkedListNode<T> head = storage.getHead();
        if (head != null) {
            T value = head.getValue();
            storage.remove(value);
            return value;
        }
        throw new IllegalStateException("There are no items in the deque");
    }

    @Override
    public T dequeueTail() {
        BaseDoublyLinkedListNode<T> tail = storage.getTail();
        if (tail != null) {
            T value = tail.getValue();
            storage.remove(value);
            return value;
        }
        throw new IllegalStateException("There are no items in the deque");
    }

    @Override
    public T peekHead() {
        BaseDoublyLinkedListNode<T> head = storage.getHead();
        if (head != null) {
            return head.getValue();
        }
        return null;
    }

    @Override
    public T peekTail() {
        BaseDoublyLinkedListNode<T> tail = storage.getTail();
        if (tail != null) {
            return tail.getValue();
        }
        return null;
    }

    @Override
    public void show() {
        storage.show();
    }

    @Override
    public int count() {
        return storage.count;
    }
}
