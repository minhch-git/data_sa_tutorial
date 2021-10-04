import java.util.NoSuchElementException;

public class StackCharacter {
  public class StackNode {
    private char value;
    private StackNode next;

    public StackNode(char value) {
      this.value = value;
    }
  }

  private StackNode topNode;

  // push
  public void push(char value) {
    StackNode newNode = new StackNode(value);
    newNode.next = topNode;
    topNode = newNode;
  }

  // pop
  public char pop() {
    if (isEmpty())
      System.out.println("Stack is empty!");

    var result = topNode.value;
    topNode = topNode.next;

    return result;
  }

  // empty
  public boolean isEmpty() {
    return topNode == null;
  }

  // peek
  public char peek() {
    if (isEmpty())
      throw new NoSuchElementException();
    return topNode.value;
  }

  // show
  public void show() {
    var curretNode = topNode;
    while (curretNode != null) {
      System.out.print(curretNode.value);
      curretNode = curretNode.next;
    }
    System.out.println();
  }
}
