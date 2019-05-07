import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    String replaced = s.replace("eraser","").replace("erase","").replace("dreamer","").replace("dream","");

    if (replaced.isEmpty()) {
      System.out.println("YES");
    } else if (!replaced.isEmpty()) {
      System.out.println("NO");
    }
  }
}
