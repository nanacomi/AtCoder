package ABC.case134;

import java.util.*;
import java.util.stream.Collectors;

public class ExceptionHandling {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    Integer max = Collections.max(list);
    long maxCount = list.stream().filter(l -> l == max).count();

    list.forEach(l -> {
      if(l == max && maxCount == 1) {
        List<Integer> removedMaxList = list.stream()
          .filter(li -> li != l)
          .collect(Collectors.toList());
        System.out.println(Collections.max(list));
      } else {
        System.out.println(max);
      }
    });
  }
}
