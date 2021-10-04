import java.util.EmptyStackException;

class StackInteger implements IStack {
  private int[] stack;
  private int topIndex;
  private int SIZE;

  public StackInteger(int size) {
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
    return topIndex == SIZE;
  }

  @Override
  public int top() {
    return stack[topIndex];
  }

  @Override
  public void traverse() {
    if (isEmpty()) {
      System.out.println("Stack is Empty!");
      return;
    }

    for (int i = topIndex; i >= 0; i--) {
      System.out.print(stack[i] + "  ");
    }
    System.out.println();
  }

  @Override
  public void decToBin(int k) {
    System.out.print(k + " in binary system is: ");
    while (k > 0) {
      push(k % 2);
      k = k / 2;
    }
    while (!isEmpty()) {
      System.out.print(pop());
    }
    System.out.println();
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
