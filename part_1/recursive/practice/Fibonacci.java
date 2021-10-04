package practice;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("How many fibonacy do you to print?");
    var input = new Scanner(System.in);
    int index = input.nextInt();
    for (int i = 0; i < index; i++) {
      System.out.print(calFib(i) + "  ");
    }
  }

  public static int calFib(int index) {
    if (index < 2)
      return index;
    return calFib(index - 1) + calFib(index - 2);
  }
}
