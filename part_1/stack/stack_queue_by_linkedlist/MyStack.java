import java.util.EmptyStackException;

class MyStack implements IStackQueue {

  public class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node topNode;

  @Override
  public boolean push(int value) {
    Node newNode = new Node(value);
    newNode.next = topNode;
    topNode = newNode;
    return true;
  }

  @Override
  public int pop() {
    if (isEmpty())
      throw new EmptyStackException();

    int result = topNode.value;
    topNode = topNode.next;
    return result;
  }

  @Override
  public boolean isFull() {
    return true;
  }

  @Override
  public boolean isEmpty() {
    return topNode == null;
  }

  @Override
  public void show() {
    if (isEmpty()) {
      System.err.println("Stack is Empty");
      return;
    }
    var currentNode = topNode;
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
      return topNode.value;
    }
  }
}
