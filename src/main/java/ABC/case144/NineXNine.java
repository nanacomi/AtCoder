package ABC.case144;

import java.util.Scanner;

public class NineXNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < 10 && b < 10) {
            System.out.println(a*b);
            return;
        }

        System.out.println(-1);
    }
}
