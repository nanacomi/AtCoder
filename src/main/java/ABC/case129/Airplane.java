package ABC.case129;

import java.util.*;

public class Airplane {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt();

    int min = Math.min(P+Q,Math.min(Q+R,R+P));

    System.out.println(min);
  }
}
