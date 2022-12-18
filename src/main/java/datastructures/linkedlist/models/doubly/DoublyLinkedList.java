package datastructures.linkedlist.models.doubly;

import datastructures.linkedlist.IDoublyLinkedList;

public class DoublyLinkedList<T> implements IDoublyLinkedList<BaseDoublyLinkedListNode<T>, T> {
    public int count;
    protected BaseDoublyLinkedListNode<T> head;
    protected BaseDoublyLinkedListNode<T> tail;

    @Override
    public void add(T value) {
        BaseDoublyLinkedListNode<T> node = new DoublyLinkedListNode<>(value);
        BaseDoublyLinkedListNode<T> oldHead = head;

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
        if (index==0){
            add(value);
            return;
        }

        BaseDoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(value);
        BaseDoublyLinkedListNode<T> currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        newNode.next = currentNode;
        newNode.previous = currentNode.previous;
        currentNode.previous.next = newNode;
        currentNode.previous = newNode;

        count++;
    }

    @Override
    public BaseDoublyLinkedListNode<T> getHead() {
        return head;
    }

    @Override
    public BaseDoublyLinkedListNode<T> getTail() {
        return tail;
    }

    @Override
    public void addTail(T value) {
        BaseDoublyLinkedListNode<T> node = new DoublyLinkedListNode<>(value);
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
    public BaseDoublyLinkedListNode<T> find(T value) {
        BaseDoublyLinkedListNode<T> current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public BaseDoublyLinkedListNode<T> findReverse(T value) {
        BaseDoublyLinkedListNode<T> current = tail;
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

        count--;

        return true;
    }

    @Override
    public boolean removeAt(int index) {
        if (index - 1 > count || count == 0) {
            return false;
        }
        if (index == 0) {
            remove(head.value);
        }

        BaseDoublyLinkedListNode<T> currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            throw new IllegalArgumentException("Index " + index + " is out of reach, current size is: " + count);
        }
        return remove(currentNode.value);
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    @Override
    public void show() {
        BaseDoublyLinkedListNode<T> currentNode = head;

        for (int i = 0; i < count; i++) {
            System.out.println("Index: " + i + ", Value: " + currentNode.value);
            currentNode = currentNode.next;
        }
    }

}
