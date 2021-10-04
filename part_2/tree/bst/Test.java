package bst;

public class Test {
    public static void main(String[] args) {
        BST myTree = new BST();
        myTree.insert2(25);
        myTree.insert2(20);
        myTree.insert2(15);
        myTree.insert2(27);
        myTree.insert2(30);
        myTree.insert2(29);
        myTree.insert2(26);
        myTree.insert2(22);
        myTree.insert2(32);
        myTree.traverseInOrder();
    }
}
