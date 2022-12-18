package datastructures.deque.models;

public class Queue<T> {
    private final Deque<T> storage = new Deque<>();

    public void enqueue(T value){
        storage.enqueueTail(value);
    }

    public T dequeue(){
        return storage.dequeueHead();
    }

    public int count(){
        return storage.count();
    }

    public T peek(){
        return storage.peekHead();
    }

    public void show(){
        storage.show();
    }
}
