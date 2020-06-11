package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        Map<Integer, Long> grouping = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long pairs = grouping.values().stream().map(c -> toPairCount(c)).mapToLong(value -> Integer.toUnsignedLong(value)).sum();
        System.out.println(pairs);
    }

    private static Integer toPairCount(Long count) {
        if (count == 1) return 0;
        else return (int) Math.floor(count/2);
    }
}
