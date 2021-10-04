import java.util.Scanner;

//  Question 3: ArrayList using from the Collections in Java
public class test {

  public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
      showMenu();
      choice = Integer.parseInt(sc.nextLine());
      switch (choice) {
        case 1:
          var newTutorHead = getNewTutor(sc);
          myLinkedList.addFirst(newTutorHead);  
          break;
        case 2:
          var newTutorTail = getNewTutor(sc);
          myLinkedList.addLast(newTutorTail);  
          break;
        case 3:
            System.out.println("Removed "+myLinkedList.removeFirst()+" successfully!");
          break;
        case 4:
            myLinkedList.printReverse();
            break;
        case 6:
          System.out.println("Good bye!!!");
          break;
        case 5: 
          myLinkedList.printList();
          break;
        default:
          System.err.println("Please choose 1 - 4!");
          return;
      }
    } while (choice != 6);
  }

  public static void showMenu() {
    System.out.println("----------------------------------");
    System.out.println("1. Thêm phần tử vào đầu danh sách.");
    System.out.println("2. Thêm phần tử vào đuôi danh sách.");
    System.out.println("3. Xóa phần tử đầu danh sách.");
    System.out.println("4. In danh sách theo thứ tự đảo ngược.");
    System.out.println("5. Print list.");
    System.out.println("6. Thoát ");
    System.out.print(" Chọn: ");
  }

  public static Tutor getNewTutor(Scanner sc) {
    System.out.println("Enter id: ");
    String id = sc.nextLine();

    System.out.println("Enter name: ");
    String name = sc.nextLine();

    System.out.println("Enter address: ");
    String address = sc.nextLine();

    System.out.println("Enter department: ");
    String department = sc.nextLine();

    return new Tutor(Integer.parseInt(id), name, department, address);
  }
}
