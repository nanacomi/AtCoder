package ABC.case172;

import java.util.Scanner;

public class MinorChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        String[] t = sc.next().split("");

        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals(t[i])) count++;
        }
        System.out.println(count);
    }
}
