package test;

public class Test {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Fruit(111, "Orange", "DN", 20.14);
        fruits[1] = new Fruit(444, "Orange 4", "HCM", 20.44);
        fruits[2] = new Fruit(555, "Orange 5", "HN", 20.54);
        fruits[3] = new Fruit(222, "Orange 2", "DL", 20.24);
        fruits[4] = new Fruit(333, "Orange 3", "HP", 20.34);
        System.out.println("Unsorted by fruits code: ");
        show(fruits);
        System.out.println("Sorted by fruits code: ");
        quickSort(fruits, 0, fruits.length - 1);
        show(fruits);
        
        System.out.println("Sorted fruits code: ");
        quickSort(fruits, 0, fruits.length - 1);
        show(fruits);
        
        System.out.println("Sorted by fruits code: ");
        quickSort(fruits, 0, fruits.length - 1);
        show(fruits);
    }


    public static void sortBuble(Fruit[] arr) {
        for (int i = 0; i < arr.length; i++) 
            for (int j = 1; j < arr.length - i; j++) {
                int prevId = arr[j - 1].getCode();
                int currId = arr[j].getCode();
                if(prevId > currId)
                    swap(arr, j - 1, j);
            }
    }

    public static void sortByDescending(Fruit[] arr) {
        for (int i = 0; i < arr.length; i++) 
            for (int j = 1; j < arr.length - i; j++) {
                int prevId = arr[j - 1].getCode();
                int currId = arr[j].getCode();
                if(prevId < currId)
                    swap(arr, j - 1, j);
            }
    }

    public static void show(Fruit[] fruits){
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].toString());
        }
    }
    public static void quickSort(Fruit[] arr, int left, int right) {
        if( left >= right)
            return;
        int index = partition(arr, left, right);
        if(left < index-1)
            quickSort(arr, left, index-1);
        
        if(index < right)
            quickSort(arr, index, right);
    }

    private static  int partition(Fruit[] arr, int left, int right) {
        Fruit pivot = arr[(left+right)/2];
        int low = left;
        int hight = right;
        while(low <= hight) {
            while(pivot.getCode() > arr[low].getCode())
                low++;
            while(pivot.getCode() < arr[hight].getCode())
                hight--;
            if(low <= hight) {
                swap(arr, low, hight);
                low++;
                hight--;
            }
        }
        return low;
    }

    private static  void swap(Fruit[] arr, int index1, int index2) {
        Fruit temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}




