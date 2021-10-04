public class Main {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    ArrayStack stack = new ArrayStack(10);
    stack.push(new Employee(111, "A", "Ly"));
    stack.push(new Employee(222, "B", "Ly"));
    stack.push(new Employee(333, "C", "Ly"));
    stack.push(new Employee(444, "D", "Ly"));

    stack.push(new Employee(555, "E", "Ly"));
    stack.push(new Employee(666, "F", "Ly"));
    stack.push(new Employee(777, "G", "Ly"));
    stack.printStack();
    System.out.println("" + stack.pop());
  }
}