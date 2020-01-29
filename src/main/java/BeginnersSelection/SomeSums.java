package BeginnersSelection;

import java.util.*;

public class SomeSums {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int min = sc.nextInt();
    int max = sc.nextInt();

    int result = 0;
    for (int i = 1; i <= num ; i++) {
      int target = i;
      int sum = 0;
      while (target > 0) {
        sum = sum + target % 10;
        target = target / 10;
      }

      if (sum >= min && sum <= max ) {
        result = result + i;
      }
    }

    System.out.println(result);
  }
}
