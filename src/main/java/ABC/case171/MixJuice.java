package ABC.case171;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MixJuice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> fruits = new ArrayList<>();
        for (int i = 0; i < n; i++) fruits.add(sc.nextInt());
        Collections.sort(fruits);

        int sum = 0;
        for (int i = 0; i < k; i++) sum += fruits.get(i);

        System.out.println(sum);
    }
}
