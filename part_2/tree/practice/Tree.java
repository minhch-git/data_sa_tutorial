package practice;

public class Tree {
    private Node root;

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    // pre-order: root left right
    private void traversePreOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.value + ",");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    // root 30; left: 20; right: 50
    // root 20; left: 10; right: null
    // root 10; left: 8; right: 18
    // root 8; left: null; right: null
    // traverse(left)
    // traverse(right)
    // return;
    // root 10; left: 8; right: 18
    // root 18; left: null; right: null
    // return;
    // root: 20; left: 10; right: null
    // root: 50; left: null; right: 560
    // root: 560; left: null; right: null

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    // in-order: left root right
    private void traverseInOrder(Node root) {
        if (root == null)
            return;
        traverseInOrder(root.leftChild);
        System.out.print(root.value + ",");
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public int max() {
        if (root == null) {
            throw new NullPointerException();
        }
        return root.max();
    }

    public int min() {
        if (root == null) {
            throw new NullPointerException();
        }
        return root.min();
    }

    // post-order: left right root
    private void traversePostOrder(Node root) {
        if (root == null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value + ",");
    }

    public void insertByLoop(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var temp = root;
        while (true) {
            if (temp.value > value) {
                // insert left
                if (temp.leftChild == null) {
                    temp.leftChild = node;
                    break;
                }
                temp = temp.leftChild;
            } else {
                // insert right
                if (temp.rightChild == null) {
                    temp.rightChild = node;
                    break;
                }
                temp = temp.rightChild;
            }
        }
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        root.insert(value);
    }

    public boolean search(int value) {
        if (root == null)
            return false;
        if (root.value == value)
            return true;
        var temp = root;

        // loop temp != null
        // if temp.value > value => temp = temp.left
        // else if temp.value < value => temp = temp.right
        // else return true

        while (temp != null) {
            if (temp.value > value)
                temp = temp.leftChild;
            else if (temp.value < value)
                temp = temp.rightChild;
            else
                return true;
        }
        return false;

    }
}
