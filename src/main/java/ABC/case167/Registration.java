package ABC.case167;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (t.startsWith(s) && s.length() + 1 == t.length()) System.out.println("Yes");
        else System.out.println("No");
    }
}
