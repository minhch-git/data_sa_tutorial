package question_2;

public class Main {
  public static void main(String[] args) {
    Tree intTree = new Tree();
    intTree.insert(35);
    intTree.insert(30);
    intTree.insert(25);
    intTree.insert(37);
    intTree.insert(40);
    intTree.insert(39);
    intTree.insert(36);
    intTree.insert(32);
    intTree.insert(42);
    intTree.insert(27);
    intTree.traverseInOrder();
    System.out.println();
    intTree.delete(112);
    intTree.traverseInOrder();
    System.out.println();
  }
}
