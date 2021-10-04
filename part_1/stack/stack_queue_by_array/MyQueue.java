import java.util.EmptyStackException;

public class MyQueue implements IStackQueue {
  private int[] queue;
  private int headIndex;
  private int tailIndex;
  private int SIZE;

  public MyQueue(int size) {
    SIZE = size;
    queue = new int[SIZE];
    headIndex = tailIndex = -1;
  }

  @Override
  public boolean push(int value) {
    if (isFull())
      throw new IndexOutOfBoundsException();

    if (isEmpty()) {
      headIndex++;
    }
    tailIndex++;
    queue[tailIndex] = value;
    return true;
  }

  @Override
  public int pop() {
    if (isEmpty())
      throw new EmptyStackException();

    int result = queue[headIndex];
    headIndex++;
    if (headIndex > tailIndex) {
      headIndex = tailIndex = -1;
    }
    return result;
  }

  @Override
  public boolean isFull() {
    return tailIndex == SIZE - 1;
  }

  @Override
  public boolean isEmpty() {
    return (headIndex == -1) && (tailIndex == -1);
  }

  @Override
  public void show() {
    if (isEmpty()) {
      System.err.println("Queue is Empty!");
      return;
    }
    for (int i = headIndex; i <= tailIndex; i++) {
      System.out.print(queue[i] + "  ");
    }
    System.out.println();
  }

}
