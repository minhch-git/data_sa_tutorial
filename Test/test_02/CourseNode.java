package test_02;

public class CourseNode {
    private Course course;
    private CourseNode next;
    private CourseNode previous;

    public CourseNode(Course course) {
        this.course = course;
    }
    public CourseNode getNext() {
        return next;
    }
    public CourseNode getPrevious() {
        return previous;
    }
    public Course getCourse() {
        return course;
    }
    public void setNext(CourseNode next) {
        this.next = next;
    }
    public void setPrevious(CourseNode previous) {
        this.previous = previous;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
}
