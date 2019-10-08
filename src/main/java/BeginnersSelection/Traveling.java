package BeginnersSelection;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();

    int t;
    int x;
    int y;

    int distance;

    String result = "Yes";

    for (int i = 0; i < count ; i++ ) {
      t = sc.nextInt();
      x = sc.nextInt();
      y = sc.nextInt();

      distance = x  + y;

      if (distance > t) {
        result = "No";
        break;
      } else if (t % 2 != distance % 2) {
        result = "No";
        break;
      }
    }

    System.out.println(result);
  }
}
