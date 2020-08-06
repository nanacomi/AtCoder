package ABC.case103;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sList = sc.next().split("");
        String t = sc.next();

        String s = "";
        for (int i = sList.length-1; i >= 0; i--) s += sList[i];

        if (t.equals(s)) System.out.println("Yes");
        else System.out.println("No");
    }
}
