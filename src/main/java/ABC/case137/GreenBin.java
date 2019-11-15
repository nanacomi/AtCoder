package ABC.case137;

import java.util.*;
import java.util.stream.Collectors;

public class GreenBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> texts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = sc.next().split("");
            Arrays.sort(s);
            texts.add(s.toString());
        }

        Map<String, Long> map = texts.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        Long sum = map.values().stream().filter(count -> count > 1).reduce(Long::sum).get();

        System.out.println(sum);
    }
}