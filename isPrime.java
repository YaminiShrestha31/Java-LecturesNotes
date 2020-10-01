import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

class Prime {
  static boolean check(int i) {
    if (i % 2 == 0) {
      return false;
    } else {
      for (int j = 3; j <= Math.sqrt(i); j += 2) {
        if (i % j == 0)
          return false;
      }
      return true;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number to check: ");
    int n = Integer.parseInt(br.readLine());
    if (check(n))
      System.out.println(n + " is prime");

    else
      System.out.println(n + " is NOT prime");
  }
}
