package datastructures.linkedlist.models.doubly;

public class DoublyLinkedListNode<T> extends BaseDoublyLinkedListNode<T> {
    protected BaseDoublyLinkedListNode<T> next;
    protected BaseDoublyLinkedListNode<T> previous;

    public DoublyLinkedListNode(T value) {
        super.value = value;
    }

    public T getValue() {
        return super.getValue();
    }
}
