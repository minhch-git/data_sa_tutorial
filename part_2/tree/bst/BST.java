package bst;

public class BST {
    private Node root;

    public void insert2(int value) {
        if (root == null) {
            this.root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void traversePostOrder() {
        if (root != null) {
            root.traversePostOrder();
        }
    }

    public void insert(int value) {
        var newNode = new Node(value);
        if (root == null) {
            this.root = newNode;
            return;
        }
        var temp = this.root;
        while (true) {
            if (temp.value == newNode.value)
                return;
            if (temp.value > newNode.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return;
                }
                temp = temp.right;
            }
        }
    }

    public boolean search(int value) {
        if (root == null)
            return false;
        if (root.value == value)
            return true;
        var temp = this.root;
        while (true) {
            if (temp.value == value) {
                return true;
            } else {
                return false;
            }
        }
    }
}
