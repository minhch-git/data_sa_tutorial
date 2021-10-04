import java.util.EmptyStackException;

class MyStack implements IStackQueue {
  private int[] stack;
  private int topIndex;
  private int SIZE;

  public MyStack(int size) {
    SIZE = size;
    stack = new int[SIZE];
    topIndex = -1;
  }

  @Override
  public boolean push(int value) {
    if (isFull())
      throw new IndexOutOfBoundsException();

    topIndex++;
    stack[topIndex] = value;
    SIZE--;
    return true;
  }

  @Override
  public int pop() {
    if (isEmpty())
      throw new EmptyStackException();

    int result = stack[topIndex];
    topIndex--;
    SIZE++;
    return result;
  }

  @Override
  public boolean isFull() {
    return topIndex == SIZE - 1;
  }

  @Override
  public boolean isEmpty() {
    return topIndex == -1;
  }

  @Override
  public void show() {
    if (isEmpty()) {
      System.out.println("Stack is Empty!");
      return;
    }

    for (int i = 0; i <= topIndex; i++) {
      System.out.print(stack[i] + "  ");
    }
    System.out.println();
  }
}
