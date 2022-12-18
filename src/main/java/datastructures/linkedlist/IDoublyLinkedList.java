package datastructures.linkedlist;

public interface IDoublyLinkedList<N,T> extends ILinkedList<N, T> {
    void addTail(T value);

    void insertAt(T value, int index);

    N getHead();

    N getTail();
    N findReverse(T value);
}
