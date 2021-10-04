package sort;

import java.util.Arrays;

public class Sort {

    public void selection(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = array.length - 1; j > i; i++)
                if (array[i] > array[j])
                    swap(array, i, j);
    }

    public void selection2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                    swap(array, i, smallest);
                }
            }
        }
    }

    public void selection3(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int small = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[i] > arr[small])
                    small = i;
            }
            swap(arr, small, i);

        }
    }

    public void buble(int[] array) {
        int lastIndex = array.length - 1;
        for (int last = lastIndex; last >= 0; last--) {
            for (int i = 0; i < last; i++) {
                System.out.println("Tại: ");
                System.out.println("  i = " + i);
                String digist = "";
                if (array[i] > array[i + 1])
                    digist = " > ";
                else if (array[i] == array[i + 1])
                    digist = " = ";
                else
                    digist = " < ";
                int next = i + 1;
                System.out.println(" vì: array[" + i + "]" + digist + "array[" + next + "]: " + "(" + array[i] + digist
                        + array[i + 1] + ")");
                if (array[i] < array[i + 1]) {
                    System.out.println("    => swap(" + array[i] + " và " + array[i + 1] + ")");
                    swap(array, i, i + 1);
                } else {
                    System.out.println("    => No swap");
                }
                System.out.println("=> array = " + Arrays.toString(array));
            }
        }
    }

    // [3, 8, 4, 9, 1, 2]
    // i =
    // v1:

    public void bubleDesc(int[] array) {
        int lastIndex = array.length - 1;
        for (int last = lastIndex; last >= 0; last--) {
            for (int i = 0; i < last; i++) {
                if (array[i] < array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    public void swap(int[] array, int position1, int position2) {
        int temp = array[position1];
        array[position1] = array[position2];
        array[position2] = temp;
    }
}
