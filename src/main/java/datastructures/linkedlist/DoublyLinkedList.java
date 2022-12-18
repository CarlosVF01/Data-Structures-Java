package datastructures.linkedlist;

public interface DoublyLinkedList<N,T> extends LinkedList<N, T>{
    void addTail(T value);


    N findReverse(T value);
}
