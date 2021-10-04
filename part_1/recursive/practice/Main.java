package practice;

import java.util.Scanner;

public class Main {

  public static Scanner input = new Scanner(System.in);

  public static long factorialBasedInteration(int number) {
    long result = 1;
    for (int i = 1; i <= number; i++) {
      result = result * i;
    }
    return result;
  }

  public static long factorialBasedRecursive(int number) {
    if (number == 0)
      return 1;
    else {
      return number * factorialBasedRecursive(number - 1);
    }
  }

  private static int sumBasedRecursive(int number) {
    if (number > 0) {
      return number + sumBasedInteration(number - 1);
    }
    return 0;
  }

  private static int sumBasedInteration(int number) {
    int result = 0;
    for (int i = 0; i <= number; i++) {
      result += i;
    }
    return result;
  }

  public static int enterPositiveNumber() {
    // Khong cho nhap so am
    int value;
    System.out.print("Enter a number: ");
    value = input.nextInt();
    return value >= 0 ? value : enterPositiveNumber();
  }

  public static void main(String[] args) {
    int value = enterPositiveNumber();

    System.out.println("Factorial Based Interation of " + value + " is: " + factorialBasedInteration(value));

    System.out.println("Factorial Based Recursive of " + value + " is: " + factorialBasedInteration(value));

    System.out.println("Sum Based Interation of " + value + " is: " + sumBasedInteration(value));

    System.out.println("Sum Based Recursive of " + value + " is: " + sumBasedRecursive(value));
  }
}
