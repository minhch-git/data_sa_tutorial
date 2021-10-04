public class MyQueue {
  private Employee[] queue;
  private int size;
  private int front;
  private int back;

  public MyQueue(int size) {
    this.size = size;
    queue = new Employee[size];
    front = back = -1;
  }

  public void add(Employee employee) {
    if (isFull())
      throw new IndexOutOfBoundsException();
    if (isEmpty()) {
      front++;
    }
    back++;
    queue[back] = employee;
    size--;
  }

  public boolean isFull() {
    return size == -1;
  }

  public boolean isEmpty() {
    return front == 0;
  }

  public void show() {
    if (isEmpty()) {
      System.out.println("Queue is Empty!");
      return;
    }
    for (int i = front; i < back; i++) {
      System.out.print(queue[i].toString());
    }
    System.out.println();
  }

}
