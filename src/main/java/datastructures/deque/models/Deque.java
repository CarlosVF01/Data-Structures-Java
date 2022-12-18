package datastructures.deque.models;

import datastructures.deque.IDeque;
import datastructures.linkedlist.models.doubly.DoublyLinkedList;
import datastructures.linkedlist.models.doubly.DoublyLinkedListNode;

public class Deque<T> implements IDeque<T> {
    protected DoublyLinkedList<T> storage = new DoublyLinkedList<>();

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
        DoublyLinkedListNode<T> head = storage.getHead();
        if (head != null) {
            T value = head.getValue();
            storage.remove(value);
            return value;
        }
        throw new IllegalStateException("There are no items in the deque");
    }

    @Override
    public T dequeueTail() {
        DoublyLinkedListNode<T> tail = storage.getTail();
        if (tail != null) {
            T value = tail.getValue();
            storage.remove(value);
            return value;
        }
        throw new IllegalStateException("There are no items in the deque");
    }

    @Override
    public boolean peekHead() {
        return storage.getHead() != null;
    }

    @Override
    public boolean peekTail() {
        return storage.getTail() != null;
    }

    @Override
    public void show() {
        storage.show();
    }
}
