package ABC.case143;

import java.util.Scanner;

public class Curtain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b+b) {
            System.out.println(a - (b+b));
        } else {
            System.out.println(0);
        }
    }
}
