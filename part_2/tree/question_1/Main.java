package question_1;

public class Main {
  public static void main(String[] args) {
    Tree intTree = new Tree();
    intTree.insert(45);
    intTree.insert(50);
    intTree.insert(65);
    intTree.insert(77);
    intTree.insert(320);
    intTree.insert(29);
    intTree.insert(36);
    intTree.insert(62);
    intTree.insert(12);
    intTree.insert(87);
    intTree.traverseInOrder();
    System.out.println();
    intTree.traversePreOrder();
    System.out.println();
    System.out.println(intTree.min());
    System.out.println(intTree.max());
  }
}
