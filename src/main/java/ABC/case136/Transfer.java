package ABC.case136;

import java.util.*;

public class Transfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = a -b;

        if (c - n > 0) {
            System.out.println(c - n);
        } else {
            System.out.println(0);
        }
    
    }
}