package BeginnersSelection;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();
    int fakeTotal = sc.nextInt();

    for (int i = 0; i < count + 1 ; i++ ) {
      for (int j = 0; j < count - i + 1 ; j++) {

        int k = count - i - j;

        int total = i * 10000 + j * 5000 + k * 1000;

        if (total == fakeTotal) {
          System.out.println(i + " " + j + " " + k);
          return;
        }
      }
    }

    System.out.println("-1 -1 -1");
  }
}
