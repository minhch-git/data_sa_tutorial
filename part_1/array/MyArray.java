public class MyArray {
  private int[] items;
  private int count;

  public MyArray(int length) {
    items = new int[length];
  }

  public void insert(int item) {
    if (count == items.length) {
      int[] newItems = new int[count * 2];
      for (int i = 0; i < count; i++) {
        newItems[i] = items[i];
      }
      items = newItems;
    }
    items[count++] = item;
  }

  public void removeAt(int index) {
    if (index < 0 || index >= count) {
      throw new IllegalAccessError();
    }
    for (int i = index; i < count; i++) {
      items[i] = items[i + 1];
    }
    count--;
  }

  public int indexOf(int item) {
    // if we find it, return index
    // Otherwise, return -1
    for (int i = 0; i < count; i++) {
      if (item == items[i]) {
        return i;
      }
    }
    return -1;
  }

  public void print() {
    for (int i = 0; i < count; i++) {
      System.out.println(items[i]);
    }
  }
}