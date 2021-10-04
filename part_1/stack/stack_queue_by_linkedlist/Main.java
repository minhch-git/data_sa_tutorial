import java.util.Stack;

class Main {
  public static void main(String[] args) {
    MyQueue myQueue = new MyQueue();
    myQueue.push(1);
    myQueue.push(2);
    myQueue.push(3);
    myQueue.push(4);
    myQueue.push(5);
    myQueue.push(6);
    myQueue.show();
    System.out.println("Pop: " + myQueue.pop());
    myQueue.show();
    System.out.println("Peek: " + myQueue.peek());
  }
}
