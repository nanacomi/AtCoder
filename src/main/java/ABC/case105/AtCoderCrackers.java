package ABC.case105;

import java.util.Scanner;

public class AtCoderCrackers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n%k == 0) System.out.println(0);
        else System.out.println(1);
    }
}
