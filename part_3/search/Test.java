package search;

import java.util.Arrays;
import java.util.Random;

public class Test {

  public static void main(String[] args) {
    var numbers = createRandomArray(8);
    var search = new Search();

    System.out.println("Original array:     " + Arrays.toString(numbers));
    var target = 3;
    System.out.println("Linear search       " + target + " : " + search.linearSearch(numbers, target));

    Arrays.sort(numbers);
    System.out.println("Original array:     " + Arrays.toString(numbers));

    System.out.println("Binary search       " + target + " : " + search.binarySearch(numbers, target));
    System.out.println("Tenary search       " + target + " : " + search.ternarySearch(numbers, target));
    System.out.println("Jump search         " + target + " : " + search.jumpSearch(numbers, target));
    System.out.println("Exponential search  " + target + " : " + search.jumpSearch(numbers, target));
  }

  public static int[] createRandomArray(int n) {
    int[] arr = new int[n];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(8);
    }
    return arr;
  }
}
