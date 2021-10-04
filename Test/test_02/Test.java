package test_02;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CourseLinkedList courseList = new CourseLinkedList();
    int choice;
    do {
      showMenu();
      choice = Integer.parseInt(sc.nextLine());
      switch (choice) {
        case 1:
          var newCourse = createCourse(sc);
          courseList.addToTop(newCourse);
          System.out.println("Successfully added!");
          break;
        case 2:
          var newCourseLast = createCourse(sc);
          courseList.addToLast(newCourseLast);
          System.out.println("Successfully added!");
          break;
        case 3:
          System.out.println("Successfully deleted course: " + courseList.removeFromFirst());
          break;
        case 4:
          courseList.showReverse();
          break;
        case 5:
          courseList.showCourses();
          break;
        case 6:
          System.out.println("Good bye!!!");
          break;
        default:
          System.err.println("Please choose 1 - 6!");
          break;
      }
    } while (choice != 6);
  }

  // Hiển thị menu
  public static void showMenu() {
    System.out.println("----------------------------------");
    System.out.println("1. Thêm phần tử vào đầu danh sách.");
    System.out.println("2. Thêm phần tử vào đuôi danh sách.");
    System.out.println("3. Xóa phần tử từ đầu danh sách.");
    System.out.println("4. In danh sách liên kết theo thứ tự đảo ngược.");
    System.out.println("5. Hiển thị danh sách.");
    System.out.println("6. Thoát ");
    System.out.print("--- Chọn: ");
  }

  // Tạo một khóa học mới với:
  // Thuộc tính id, name, price và author
  public static Course createCourse(Scanner sc) {
    System.out.println("Enter the courseId: ");
    int id = Integer.parseInt(sc.nextLine());

    System.out.println("Enter course's name: ");
    String name = sc.nextLine();

    System.out.println("Enter author's name: ");
    String author = sc.nextLine();

    System.out.println("Enter the price: ");
    int price = Integer.parseInt(sc.nextLine());

    return new Course(id, name, author, price);
  }
}
