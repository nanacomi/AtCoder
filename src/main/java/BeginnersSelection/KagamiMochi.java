package BeginnersSelection;

import java.util.*;

public class KagamiMochi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();

    Set<Integer> mochis = new HashSet<>();
    for (int i = 0; i < count; i++) {
      mochis.add(sc.nextInt());
    }

    int layer = mochis.size();

    System.out.println(layer);
  }
}
