public class Node {
    private Tutor value;
    private Node next;
    private Node previous;

    public Node(Tutor value) {
        this.value = value;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return next;
    }
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    public Node getPrevious() {
        return previous;
    }
    public Tutor getValue() {
        return value;
    }
}
