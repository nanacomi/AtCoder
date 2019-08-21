import java.util.*;
import java.util.stream.Collectors;

public class Main {
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

        long max = map.values().stream().max((a, b) -> a.compareTo(b)).get();

        System.out.println(max);
    }
}