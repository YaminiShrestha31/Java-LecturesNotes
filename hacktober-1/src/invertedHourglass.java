import java.util.Scanner;

public class invertedHourglass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nst = 1;
    int nsp = 2 * n - 1;
    int count = 1;
    int row = 1;
    while (row <= 2 * n + 1) {
      count = n;
      int cst = 1;
      while (cst <= nst) {
        System.out.print(count + " ");
        cst++;
        count--;
      }
      int csp = 1;
      while (csp <= nsp) {
        System.out.print("  ");
        csp++;
      }
      cst = 1;
      while (cst <= nst) {
        count++;
        if (cst == 1 && row == n + 1) {
          count++;
          cst++;
        }
        System.out.print(count + " ");
        cst++;
      }
      System.out.println();
      if (row <= n) {
        nst++;
        nsp -= 2;
      } else {
        nst--;
        nsp += 2;
      }
      row++;
    }
  }
}
