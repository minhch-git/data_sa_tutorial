package sort;
import java.util.Arrays;

/**
 * SelectionSort
 */
public class SelectionSort {

  // 1 ,4,6,2,3,7
  // 1

  public void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      var minIndex = i;
      for (int j = i; j < arr.length; j++)
        if (arr[j] < arr[minIndex])
          minIndex = j;

      swap(arr, minIndex, i);
    }
  }

  // preview
  public void sortPreview(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      var minIndex = i;
      System.out.println("***********************");
      System.out.println("Start minIndex = i = " + minIndex);
      for (int j = i; j < arr.length; j++)
        if (arr[j] < arr[minIndex])
          minIndex = j;
      System.out.println("End minIndex: " + minIndex);
      swap(arr, minIndex, i);
      System.out.println("Swap(" + arr[minIndex] + ", " + arr[i] + ")");
      System.out.println(Arrays.toString(arr));
    }
  }

  public void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}