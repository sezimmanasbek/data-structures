public class Node<T> {
    private T val;
    private Node<T> next;

    public Node(T val) {
        this.val = val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getVal() {
        return val;
    }

    public Node<T> getNext() {
        return next;
    }
}
