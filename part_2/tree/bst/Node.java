package bst;

class Node {
    public int value;
    public Node right;
    public Node left;

    public Node(int value) {
        this.value = value;
    }

    public void insert(int value) {
        if (this.value == value)
            return;
        if (this.value > value) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public void traverseInOrder() {
        System.out.print(value + ", ");
        if (left != null) {
            left.traverseInOrder();
        }
        if (right != null) {
            right.traverseInOrder();
        }
    }

    public void traversePostOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        if (right != null) {
            right.traverseInOrder();
        }
        System.out.print(value + ", ");

    }

    @Override
    public String toString() {
        return "Node{value: " + value + "; left: " + left + "; right: " + right + "}";
    }
}