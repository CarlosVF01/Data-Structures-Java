package datastructures.deque;

public interface IDeque<T> {
    void enqueueHead(T value);

    void enqueueTail(T value);

    T dequeueHead();

    T dequeueTail();

    T peekHead();

    T peekTail();

    void show();

    int count();
}
