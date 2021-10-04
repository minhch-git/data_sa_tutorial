package sort;

import java.util.Arrays;

public class BubbleSort {

  public void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++)
      for (int j = 1; j < arr.length - i; j++)
        if (arr[j - 1] > arr[j])
          swap(arr, j - 1, j);
  }

  // Preview
  public void sortPreview(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        System.out.println("j = " + j + ": " + arr[j - 1] + " - " + arr[j]);
        if (arr[j - 1] > arr[j]) {
          System.out.println("Swap(" + arr[j - 1] + ", " + arr[j] + ")");
          swap(arr, j - 1, j);
        } else {
          System.out.println("No Swap");
        }
        System.out.println("End j = " + j + ": " + Arrays.toString(arr));
      }
      System.out.println("********************************");
      System.out.println("i = " + i + ": " + Arrays.toString(arr));
      System.out.println("********************************");

    }
  }

  public void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
