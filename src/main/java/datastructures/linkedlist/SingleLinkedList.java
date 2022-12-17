package datastructures.linkedlist;

public class SingleLinkedList<T> {

    public int count;

    protected SingleLinkedListNode<T> head;

    public void insertAtStart(T value){
        if (count == 0){
            head = new SingleLinkedListNode<>(value);
        } else {
            SingleLinkedListNode<T> temp = head;
            head = new SingleLinkedListNode<>(value);
            head.next = temp;

        }
        count++;
    }
    public void insertAt(T value, int index){
        if (index == 0){
            insertAtStart(value);
            return;
        }

        SingleLinkedListNode<T> newNode = new SingleLinkedListNode<>(value);
        SingleLinkedListNode<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        count++;
    }
    public SingleLinkedListNode<T> find(T value){
        if (head == null){
            return null;
        }

        SingleLinkedListNode<T> current = head;

        while(current != null){
            if (current.value.equals(value)){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public boolean remove(T value){
        if (find(value) == null){
            return false;
        }
        if (head.value.equals(value)){
            head = head.next;
        } else {
            SingleLinkedListNode<T> previous = head;
            SingleLinkedListNode<T> current = head.next;
            SingleLinkedListNode<T> next = current.next;

            for (int i = 0; i < count-1; i++) {
                if (current.value.equals(value)){
                    previous.next = next;
                } else {
                    next = next.next;
                    current = current.next;
                    previous = previous.next;
                }
            }
        }

        count--;

        return true;
    }

    public void clear(){
        head = null;
        count = 0;
    }

    public void show(){
        if (count == 0){
            System.out.println("No values");
            return;
        }

        SingleLinkedListNode<T> current = head;

        for (int i = 0; i < count; i++) {
            System.out.println("Index: " + i + ", Node value: " + current.value);
            current = current.next;
        }
    }
}
