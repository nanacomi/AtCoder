package ABC.case139;

import java.util.*;

public class Tenki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("");
        String[] t = sc.next().split("");

        int count = 0;

        for (int i = 0; i < 3; i++) {
            if (s[i].equals(t[i])) {
                count++;
            }
        }

        System.out.println(count);
    }
}