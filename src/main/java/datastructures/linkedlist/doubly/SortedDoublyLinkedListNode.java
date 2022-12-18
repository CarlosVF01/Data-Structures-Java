package datastructures.linkedlist.doubly;

public class SortedDoublyLinkedListNode<T extends Comparable<T>> {
    protected T value;
    protected SortedDoublyLinkedListNode<T> next;
    protected SortedDoublyLinkedListNode<T> previous;

    public SortedDoublyLinkedListNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
