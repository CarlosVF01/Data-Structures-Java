package datastructures.linkedlist.models.single;

public class SingleLinkedListNode<T> {

    protected T value;

    protected SingleLinkedListNode<T> next;

    public SingleLinkedListNode(T value) {
        this.value = value;
    }
}
