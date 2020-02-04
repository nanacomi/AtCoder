package paiza.rankB;

import java.util.Scanner;

public class AutomaticTableGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] table = new int[h][w];

        table[0][0] = sc.nextInt();
        table[0][1] = sc.nextInt();
        table[1][0] = sc.nextInt();
        table[1][1] = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 2; j < h; j++) {
                table[j][i] = table[j-1][i] + (table[1][i] - table[0][i]);
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 2; j < w; j++) {
                table[i][j] = table[i][j-1] + (table[i][1] - table[i][0]);
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (j == w-1) System.out.println(table[i][j]);
                else System.out.print(table[i][j] + " ");
            }
        }
    }
}
