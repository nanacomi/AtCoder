import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();
    int D = sc.nextInt();
    int x = sc.nextInt();

    for (int i = 0; i < 10 ; i++ ) {
      int result = r * x - D;
      System.out.println(result);

      x = result;
    }
  }
}
