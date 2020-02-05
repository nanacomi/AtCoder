package paiza.rankB;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ElectionSpeech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), k = sc.nextInt();
        int[] speechOrder = new int[k];
        for (int i = 0; i < k; i++) speechOrder[i] = sc.nextInt();

        int[] point = new int[m];

        for (int i = 0; i < k; i++) {
            if (n != 0) {
                point[speechOrder[i]-1]++;
                n--;
            }
            for (int j = 0; j < m; j++) {
                if (point[j] != 0 && speechOrder[i]-1 != j) {
                    point[j]--;
                    point[speechOrder[i]-1]++;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) result.add(point[i]);

        int maxPoint = result.stream().max(Comparator.naturalOrder()).get();

        for (int i = 0; i < m; i++) {
            if (result.get(i) == maxPoint) System.out.println(i+1);
        }
    }
}
