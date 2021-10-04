import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    System.out.println(numbers.remove(2));
    System.out.println(numbers.size());
    System.out.println(numbers.get(2));
  }
}
