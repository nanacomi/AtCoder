import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = 0;

    for (int i = 0; i < 2 ; i++ ) {
      if(a > b) {
        sum += a;
        a--;
      } else if (b > a) {
        sum += b;
        b--;
      } else {
        sum += a;
        a--;
      }
    }

    System.out.println(sum);
  }
}
