import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int W = sc.nextInt();
    int H = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

    double whole = (double)W * (double)H / 2;
    int way = 0;
    if(2 * x == W && 2 * y == H) {
      way = 1;
    }

    System.out.println(whole + " " + way);

  }
}
