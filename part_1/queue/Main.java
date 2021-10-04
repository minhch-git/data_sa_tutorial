public class Main {
  private static void main(String[] args) {
    MyQueue myQueue = new MyQueue(6);
    myQueue.add(new Employee("minh", "chiu", 1));
    myQueue.add(new Employee("minh", "chiu", 2));
    myQueue.add(new Employee("minh", "chiu", 3));
    myQueue.add(new Employee("minh", "chiu", 4));
    myQueue.add(new Employee("minh", "chiu", 5));
    myQueue.show();
  }
}
