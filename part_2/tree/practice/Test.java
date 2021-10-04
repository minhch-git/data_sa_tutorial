package practice;

public class Test {
    public static void main(String[] args) {
        Tree myTree = new Tree();
        // myTree.insertByLoop(40);
        // myTree.insertByLoop(20);
        // myTree.insertByLoop(50);
        // myTree.insertByLoop(60);
        // myTree.insertByLoop(10);

        // myTree.insert(30);
        // myTree.insert(20);
        // myTree.insert(50);
        // myTree.insert(560);
        // myTree.insert(10);
        // myTree.insert(8);
        // myTree.insert(18);

        myTree.insert(25);
        myTree.insert(20);
        myTree.insert(15);
        myTree.insert(27);
        myTree.insert(30);
        myTree.insert(29);
        myTree.insert(26);
        myTree.insert(22);
        myTree.insert(32);

        System.out.println("search: " + myTree.get(29));
        System.out.println("max: " + myTree.max());
        System.out.println("min: " + myTree.min());

        // System.out.println(myTree.searchByLoop(30));
        // System.out.println(myTree.searchByLoop(20));
        // System.out.println(myTree.searchByLoop(50));
        // System.out.println(myTree.searchByLoop(10));
        // System.out.println(myTree.searchByLoop(560));

        System.out.println("Tree Start: 30,20,50,560,10,8,18");

        System.out.println("Pre-order: ");
        myTree.traversePreOrder();

        System.out.println("\nIn-order: ");
        myTree.traverseInOrder();

        System.out.println("\nPost-order: ");
        myTree.traversePostOrder();

    }
}
