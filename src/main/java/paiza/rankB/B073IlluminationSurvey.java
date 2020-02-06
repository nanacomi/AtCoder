package paiza.rankB;

import java.util.Arrays;
import java.util.Scanner;

public class B073IlluminationSurvey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] lights = new int[n];
        for (int i = 0; i < n; i++) lights[i] = sc.nextInt();

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int start = sc.nextInt()-1, end = sc.nextInt()-1;

            int sum = 0;
            for (int j = start; j <= end; j++) sum += lights[j];
            int ave = (int) Math.floor(sum / (end - start + 1));

            if (ave < m) {
                for (int j = start; j <= end; j++) lights[j] += m - ave;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == n-1) System.out.println(lights[i]);
            else System.out.print(lights[i] + " ");
        }
    }
}
