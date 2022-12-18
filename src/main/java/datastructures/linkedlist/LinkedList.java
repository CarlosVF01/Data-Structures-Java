package datastructures.linkedlist;

import java.util.Collection;

public interface LinkedList<N, T> {
    void add(T value);

    default void addAll(T[] values){
        for (T value: values) {
            add(value);
        }
    }

    default void addAll(Collection<T> values){
        for (T value: values) {
            add(value);
        }
    }

    N find(T value);

    boolean remove(T value);

    boolean removeAt(int index);

    boolean contains(T value);
    void clear();


    void show();
}

