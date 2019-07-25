import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    Integer max = Collections.max(list);
    System.out.println(max);
    long maxCount = list.stream().filter(l -> l == max).count();

    list.forEach(l -> {
      if(l == max && maxCount == 1) {
        Integer nextMax = Collections.max(list.remove(l));
        System.out.println(nextMax);
      } else {
        System.out.println(max);
      }
    });
  }
}
