import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    var list = new LinkedList();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addFirst(80);
    list.addFirst(390);
    list.reverse();
    System.out.println(Arrays.toString(list.toArrays()));
    System.out.println(list.indexOf(30));
    System.out.println(list.getSize());
    System.out.println(list.contains(0));
    System.out.println(Arrays.toString(list.toArrays()));
    list.display();
  }
}