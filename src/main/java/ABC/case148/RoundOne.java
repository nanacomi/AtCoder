package ABC.case148;

import java.util.Scanner;

public class RoundOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a!=1 && b!=1) {
            System.out.println(1);
        } else if (a!=2 && b!=2) {
            System.out.println(2);
        } else if (a!=3 && b!=3) {
            System.out.println(3);
        }
    }
}
