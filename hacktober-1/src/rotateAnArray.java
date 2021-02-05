
public class rotateAnArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] arr = {10, 20, 30, 40};
    rotate(arr, 2);
  }
  public static void rotate(int[] a, int n) {

    for (int i = 0; i < n; i++) {
      int temp = a[a.length - 1];
      for (int j = a.length - 1; j >= 1; j--) {

        a[j] = a[j - 1];
      }

      a[0] = temp;
    }
    for (int val : a) {
      System.out.print(val + " ");
    }
  }
}
