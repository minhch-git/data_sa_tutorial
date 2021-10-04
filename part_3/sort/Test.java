package sort;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        var numbers = new int[] { 3, 8, 4, 9, 1, 2 };

        System.out.println("Original array  : " + Arrays.toString(numbers));

        // BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.sort(numbers);
        // System.out.println("Buble sort : " + Arrays.toString(numbers));

        // SelectionSort selectionSort = new SelectionSort();
        // selectionSort.sortPreview(numbers);
        // System.out.println("Selection sort : " + Arrays.toString(numbers));
        QuickSort quickSort = new QuickSort();
        quickSort.sort(numbers, 0, numbers.length-1);
        System.out.println("Quick sort : " + Arrays.toString(numbers));
    }
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
              
        System.out.println();
    }
}
