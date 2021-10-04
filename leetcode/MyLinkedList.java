import java.util.NoSuchElementException;

public class MyLinkedList {
  private Node head;
  private Node tail;
  private int size;

  
  public void addFirst(Tutor tutor) {
    var newNode = new Node(tutor);
    if (isEmpty()) {
      head = tail = newNode;
      size++;
      return;
    }
    newNode.setNext(head);
    head.setPrevious(newNode);
    head = newNode;
    size++;
  }

  
  public void addLast(Tutor tutor) {
    var newNode = new Node(tutor);
    if (isEmpty()) {
      head = tail = newNode;
      size++;
      return;
    }
    newNode.setPrevious(tail);
    tail.setNext(newNode);
    tail = newNode;
    size++;
  }

  public String removeFirst() {
    if(isEmpty())
      throw new NoSuchElementException();

    if(head == tail){
      String result = head.getValue().getTutor();
      head = tail = null;
      size--;
      return result;
    }
    String result = head.getValue().getTutor();
    head.getNext().setPrevious(null);;
    head = head.getNext();
    size--;
    return result;
  }
  
  public void printList() {
    if(isEmpty()) 
      System.out.println("Data is empty!");
    
    var currentNode = head;
    while(currentNode != null) {
          System.out.println(currentNode.getValue().getTutor());
          currentNode = currentNode.getNext();
    }
  }

  public void printReverse() {
    if(isEmpty()) 
      System.out.println("Data is empty!");
    
    var currentNode = tail;
    while(currentNode != null) {
          System.out.println(currentNode.getValue().getTutor());
          currentNode = currentNode.getPrevious();
    }
  }
  public boolean isEmpty() {
    return head == null;
  }
  
  public int getSize() {
    return size;
  }
  
}