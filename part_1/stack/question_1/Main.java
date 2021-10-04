public class Main {
  public static void main(String[] args) {
    StackInteger myStack = new StackInteger(8);

    myStack.decToBin(200);

    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(4);
    myStack.push(5);
    myStack.push(6);
    myStack.push(7);
    myStack.push(8);
    myStack.pop();
    myStack.pop();
    System.out.println("Top: " + myStack.top());
    myStack.show();
    System.out.println("Traverse: ");
    myStack.traverse();
  }
}
