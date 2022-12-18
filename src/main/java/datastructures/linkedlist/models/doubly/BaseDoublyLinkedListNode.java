package datastructures.linkedlist.models.doubly;

public abstract class BaseDoublyLinkedListNode<T> {
    protected T value;
    protected BaseDoublyLinkedListNode<T> next;
    protected BaseDoublyLinkedListNode<T> previous;

    public T getValue() {
        return value;
    }
}
