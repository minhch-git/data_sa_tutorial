package question_0;

import java.util.SortedSet;

public class Main {

  public static void main(String[] args) {
    SortedSet<String> fruits = new java.util.TreeSet<>();

    // Adding new elements to a TreeSet
    fruits.add("Banana");
    fruits.add("Apple");
    fruits.add("Pineapple");
    fruits.add("Orange");

    System.out.println("Fruits Set : " + fruits);

    fruits.add("Apple");
    System.out.println("After adding duplicate element \"Apple\" : " + fruits);

    fruits.add("banana");
    System.out.println("After adding \"banana\" : " + fruits);
  }
}
