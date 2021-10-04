package test_02;

import java.util.NoSuchElementException;

public class CourseLinkedList {
    private CourseNode firstNode;
    private CourseNode lastNode;

    public void addToTop(Course course) {
        var newNode = new CourseNode(course);
        if (isEmpty()) {
            firstNode = lastNode = newNode;
            return;
        }

        newNode.setNext(firstNode);
        firstNode.setPrevious(newNode);
        firstNode = newNode;
    }

    public boolean isEmpty() {
        return (firstNode == null) && (lastNode == null);
    }

    public void addToLast(Course course) {
        var newNode = new CourseNode(course);
        if (isEmpty()) {
            firstNode = lastNode = newNode;
            return;
        }

        newNode.setPrevious(lastNode);
        lastNode.setNext(newNode);
        lastNode = newNode;
    }

    public String removeFromFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        var result = firstNode.getCourse().toString();
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
            return result;
        }
        firstNode.getNext().setPrevious(null);
        firstNode = firstNode.getNext();
        return result;
    }

    public void showReverse() {
        if (isEmpty())
            System.out.println("Data is empty!");

        var currentNode = lastNode;
        while (currentNode != null) {
            System.out.println(currentNode.getCourse().toString());
            currentNode = currentNode.getPrevious();
        }
    }

    public void showCourses() {
        if (isEmpty())
            System.out.println("Data is empty!");

        var currentNode = firstNode;
        while (currentNode != null) {
            System.out.println(currentNode.getCourse().toString());
            currentNode = currentNode.getNext();
        }
    }
}
