import java.util.EmptyStackException;

public class MyQueue implements IStackQueue {

  public class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node head;
  private Node tail;

  @Override
  public boolean push(int value) {
    Node newNode = new Node(value);
    if (isEmpty())
      head = tail = newNode;
    else {
      tail.next = newNode;
      tail = newNode;
    }
    return true;
  }

  @Override
  public int pop() {
    var result = head.value;
    if (isEmpty())
      throw new EmptyStackException();
    else if (head == tail) {
      head = tail = null;
    } else {
      head = head.next;
    }
    return result;
  }

  @Override
  public boolean isFull() {
    return false;
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }

  @Override
  public void show() {
    if (isEmpty()) {
      System.err.println("Queue is Empty!");
      return;
    }
    var currentNode = head;
    while (currentNode != null) {
      System.out.print(currentNode.value + " ");
      currentNode = currentNode.next;
    }
    System.out.println();
  }

  @Override
  public int peek() {
    if (isEmpty())
      throw new EmptyStackException();
    else {
      return head.value;
    }
  }

}
