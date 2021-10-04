package practice;

public class Node {
    public int value;
    public Node leftChild;
    public Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node = " + value;
    }

    // Find min
    public int max() {
        if (rightChild == null) {
            return this.value;
        }
        return rightChild.max();
    }

    // Find min
    public int min() {
        if (leftChild == null) {
            return this.value;
        }
        return leftChild.min();
    }

    public Node get(int value) {
        if (this.value == value) {
            return this;
        }
        if (value < this.value) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public void insert(int value) {
        if (this.value == value)
            return;
        if (this.value > value) {
            // insert left
            // check left
            if (leftChild == null) {
                leftChild = new Node(value);
            } else {
                // insert value from root = leftChild
                leftChild.insert(value);
            }
        } else {
            // insert right
            if (rightChild == null) {
                rightChild = new Node(value);
            } else {
                // insert value from root = rightChild
                rightChild.insert(value);
            }
        }
    }
}
