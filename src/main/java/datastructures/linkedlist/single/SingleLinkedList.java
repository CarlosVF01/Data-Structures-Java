package datastructures.linkedlist.single;

import datastructures.linkedlist.LinkedList;

public class SingleLinkedList<T> implements LinkedList<SingleLinkedListNode<T>, T> {

    public int count;

    protected SingleLinkedListNode<T> head;

    @Override
    public void add(T value) {
        if (count == 0) {
            head = new SingleLinkedListNode<>(value);
        } else {
            SingleLinkedListNode<T> temp = head;
            head = new SingleLinkedListNode<>(value);
            head.next = temp;

        }
        count++;
    }

    public void insertAt(T value, int index) {
        if (index == 0) {
            add(value);
            return;
        }

        SingleLinkedListNode<T> newNode = new SingleLinkedListNode<>(value);
        SingleLinkedListNode<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        count++;
    }

    @Override
    public SingleLinkedListNode<T> find(T value) {
        if (head == null) {
            return null;
        }

        SingleLinkedListNode<T> current = head;

        while (current != null) {
            if (current.value.equals(value)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean remove(T value) {
        if (count == 0 | find(value) == null) {
            return false;
        }
        if (head.value.equals(value)) {
            head = head.next;
        } else {
            SingleLinkedListNode<T> previous = head;
            SingleLinkedListNode<T> current = head.next;
            SingleLinkedListNode<T> next = current.next;

            for (int i = 0; i < count - 1; i++) {
                if (current.value.equals(value)) {
                    previous.next = next;
                } else {
                    next = next.next;
                    current = current.next;
                    previous = previous.next;
                }
            }
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
        SingleLinkedListNode<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            throw new IllegalArgumentException("Index " + index + " is out of reach, current size is: " + count);
        }
        return remove(currentNode.value);
    }

    @Override
    public boolean contains(T value) {
        return find(value) != null;
    }

    @Override
    public void clear() {
        head = null;
        count = 0;
    }

    @Override
    public void show() {
        if (count == 0) {
            System.out.println("No values");
            return;
        }

        SingleLinkedListNode<T> current = head;

        for (int i = 0; i < count; i++) {
            System.out.println("Index: " + i + ", Node value: " + current.value);
            current = current.next;
        }
    }
}
