package ABC.case142;

import java.util.Scanner;

public class DisjointSetOfCommonDivisors {
    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = gcd(a, b);

        int count = 1;

        for(int i = 2; i <= Math.sqrt(gcd); i++) {
            if(gcd % i == 0) {
                count++;
            }
            while(gcd % i == 0) {
                gcd /= i;
            }
        }
        if (gcd > 1) {
            count++;
        }
        System.out.println(count);
    }

    private static long gcd(long m, long n) {
        if(n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}