package paiza.rankB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B051DirtyMagicCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] magicCircle = new int[n][n];
        List<Integer> dirty = new ArrayList<>();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                magicCircle[i][j] = x;
                sum += x;
                if (x == 0) {
                    dirty.add(i);
                    dirty.add(j);
                }
            }
            a[i] = sum;
            if (max < sum) max = sum;
        }

        if (dirty.get(0) == dirty.get(2)) {
            for (int i = 1; i < 4; i+=2) {
                int notSum = 0;
                for (int j = 0; j < n; j++) {
                    notSum += magicCircle[j][dirty.get(i)];
                }

                for (int j = 0; j < n; j++) {
                    if (magicCircle[j][dirty.get(i)] == 0) magicCircle[j][dirty.get(i)] = max - notSum;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (dirty.get(0) == i || dirty.get(2) == i) {
                    for (int j = 0; j < n; j++) {
                        if (magicCircle[i][j] == 0) magicCircle[i][j] = max - a[i];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n-1) System.out.println(magicCircle[i][j]);
                else System.out.print(magicCircle[i][j] + " ");
            }
        }

    }
}
