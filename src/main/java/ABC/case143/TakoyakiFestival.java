package ABC.case143;

import java.util.Scanner;

public class TakoyakiFestival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d[] = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    result += d[i] * d[j];
                }
            }
        }

        System.out.println(result / 2);
    }
}
