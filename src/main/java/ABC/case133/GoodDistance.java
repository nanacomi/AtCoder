package ABC.case133;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                list.add(sc.nextInt());
            }
        }
    }
}
