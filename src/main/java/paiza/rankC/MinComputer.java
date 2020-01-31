package paiza.rankC;

import java.util.Scanner;

public class MinComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 0;
        for(int i = 0; i <= n; i++) {
            String[] s = sc.nextLine().split(" ");
            if (s[0].equals("SET")) {
                if (s[1].equals("1")) a = Integer.valueOf(s[2]);
                else b = Integer.valueOf(s[2]);
            }
            else if (s[0].equals("ADD")) b = a + Integer.valueOf(s[1]);
            else if (s[0].equals("SUB")) b = a - Integer.valueOf(s[1]);
        }
        System.out.println(a + " " + b);
    }
}
