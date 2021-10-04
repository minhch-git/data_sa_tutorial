import java.util.Iterator;
import java.util.Stack;

public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Stack<String> stackOfCards = new Stack<>();
    stackOfCards.push("Jack");
    stackOfCards.push("Queen");
    stackOfCards.push("King");
    stackOfCards.push("Ace");
    System.out.println("Stack : " + stackOfCards);
    // Check if the Stack is empty
    System.out.println("Is Stack empty? : " + stackOfCards.isEmpty());
    // Find the size of Stack
    System.out.println("Size of Stack : " + stackOfCards.size());
    // Search for an element
    // The search() method returns the 1-based position of the element fr
    // It returns -1 if the element was not found in the stack
    int position = stackOfCards.search("Queen");
    if (position != -1) {
      System.out.println("Found the element at position : " + position);
    } else {
      System.out.println("Element not found");
    }

    System.out.println("\n=== Iterate over a Stack using iterator() ===");
    Iterator<String> platesIterator = stackOfCards.iterator();
    while (platesIterator.hasNext()) {
      String plate = platesIterator.next();

      System.out.println(plate);
    }
    System.out.println("\n=== Iterate over a Stack using iterator() and J plates");
    platesIterator = stackOfCards.iterator();
    platesIterator.forEachRemaining(plate -> {
      System.out.println(plate);
    });
  }
}