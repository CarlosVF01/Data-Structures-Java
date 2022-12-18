package datastructures.deque;

public interface IDeque<T> {
    void enqueueHead(T value);

    void enqueueTail(T value);

    T dequeueHead();

    T dequeueTail();

    boolean peekHead();

    boolean peekTail();

    void show();
}
