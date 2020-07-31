package ABC.case104;

import java.util.Scanner;

public class RatedForMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        if (r < 1200) System.out.println("ABC");
        else if (r < 2800) System.out.println("ARC");
        else System.out.println("AGC");
    }
}
