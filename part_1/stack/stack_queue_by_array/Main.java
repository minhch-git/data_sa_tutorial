class Main {
  public static void main(String[] args) {
    MyQueue myQueue = new MyQueue(8);
    myQueue.push(1);
    myQueue.pop();
    myQueue.show();

    myQueue.push(2);
    myQueue.push(3);
    myQueue.push(4);
    myQueue.show();

    myQueue.pop();
    myQueue.show();

    myQueue.pop();
    myQueue.show();

    myQueue.pop();
    myQueue.show();

    MyStack myStack = new MyStack(8);
    myStack.push(1);
    myStack.pop();
    myStack.show();

    myStack.push(2);
    myStack.push(3);
    myStack.push(4);
    myStack.show();

    myStack.pop();
    myStack.show();

    myStack.pop();
    myStack.show();

    myStack.pop();
    myStack.show();
  }
}
