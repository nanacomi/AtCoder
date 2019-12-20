package ABC.case147;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c >= 22) {
            System.out.println("bust");
            return;
        }
        System.out.println("win");
    }
}
