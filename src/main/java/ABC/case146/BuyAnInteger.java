package ABC.case146;

import java.util.Scanner;

public class BuyAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        long left = 0;
        long right = (long) (Math.pow(10, 9) + 1);
        while (left + 1 < right) {
            long middle = (left + right) / 2;
            long target = a * middle + b * String.valueOf(middle).length();
            if (target <= x) {
                left = middle;
            } else {
                right = middle;
            }
        }
        System.out.println(left);
    }
}
