package datastructures.linkedlist;

public class DoublyLinkedListNode<T> {

    protected T value;
    protected DoublyLinkedListNode<T> next;
    protected DoublyLinkedListNode<T> previous;

    public DoublyLinkedListNode(T value) {
        this.value = value;
    }
}
