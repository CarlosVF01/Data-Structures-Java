package datastructures.linkedlist.models.doubly;

public class SortedDoublyLinkedListNode<T extends Comparable<T>> extends BaseDoublyLinkedListNode<T> {
        protected BaseDoublyLinkedListNode<T> next;
        protected BaseDoublyLinkedListNode<T> previous;

    public SortedDoublyLinkedListNode(T value) {
        super.value = value;
    }

    public T getValue() {
        return super.getValue();
    }
}
