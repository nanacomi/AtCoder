package ABC.sumitomo2019;

import java.util.Scanner;

public class TaxRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            float tmp = (float) (i * 1.08);
            if (Math.floor(tmp) == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }
}
