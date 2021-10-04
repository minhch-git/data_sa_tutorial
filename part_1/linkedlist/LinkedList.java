import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.spi.CurrencyNameProvider;

public class LinkedList {

  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  private Node first;
  private Node last;
  private int size;

  // addLast
  public void addLast(int item) {
    Node node = new Node(item);
    if (this.empty())
      first = last = node;
    else {
      last.next = node;
      last = node;
    }
    size++;
  }

  // addFirst
  public void addFirst(int item) {
    Node node = new Node(item);
    if (empty())
      first = last = node;
    else {
      node.next = first;
      first = node;
    }
    size++;
  }
  // removeFirst

  // addFirst
  public void removeFirst() {
    if (empty())
      throw new NoSuchElementException();
    if (first == last) {
      first = last = null;
      return;
    }
    Node second = first.next;
    first = second;
    size--;
  }

  // removeLast
  public void removeLast() {
    // [13 -> 53 -> 23]
    // last = 53
    if (empty())
      throw new NoSuchElementException();
    if (first == last) {
      first = last = null;
      return;
    }
    last = this.getPrevious();
    last.next = null;
    size--;
  }

  // indexOf
  public int indexOf(int item) {
    int index = 0;
    var current = first;
    while (current != null) {
      if (current.value == item)
        return index;
      current = current.next;
      index++;
    }
    return -1;
  }

  // contains
  public boolean contains(int item) {
    return this.indexOf(item) != -1;
  }

  // to array
  public int[] toArrays() {
    int[] array = new int[this.size];
    var current = first;
    var index = 0;
    while (current != null) {
      array[index] = current.value;
      current = current.next;
      index++;
    }
    return array;
  }

  // reverse
  public void reverse() {
    // [20 -> 30 -> 40 -> 50 -> 40]
    if (empty())
      return;
    var previous = first;
    var current = first.next;
    while (current != null) {
      var next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    last = first;
    last.next = null;
    first = previous;
  }

  // display
  public void display() {
    Node current = first;
    while (current != null) {
      System.out.println(current.getValue());
      current = current.next;
    }
  }

  // empty
  public boolean empty() {
    return first == null;
  }

  // get previous
  public Node getPrevious() {
    var current = first;
    while (current != null) {
      if (current.next == null)
        return current;
      current = current.next;
    }
    return null;
  }

  // get size
  public int getSize() {
    return size;
  }

}