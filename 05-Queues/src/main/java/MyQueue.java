



import java.util.NoSuchElementException;

public class MyQueue <T>{
    private Node<T> front;
    private Node<T> back;
    private int size;

    public void enqueue(T item) {
        Node<T> node = new Node<>(item);
        if(isEmpty()){
            front = back = node;
        } else {
            back.setNext(node);
            back = node;
        }
        size++;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public T peek() {
        return (T)front.getVal();
    }

    public T dequeue() {
        Node frontNote;
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(back == front){
            frontNote = back;
            front=back = null;
        } else{
            frontNote = front;
            front = front.getNext();

        }
        size--;
        return (T)frontNote.getVal();

    }


    public int size() {
        return size;
    }
}
