package ABC.case102;

import java.util.Scanner;

public class MultipleOf2AndN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%2 == 0) System.out.println(n);
        else System.out.println(2*n);
    }
}
