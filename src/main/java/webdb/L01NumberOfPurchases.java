package webdb;

import java.util.Scanner;

public class L01NumberOfPurchases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        double result = (double) b / a;
        System.out.println((int) Math.ceil(result));
    }
}
