package ABC.case171;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);

        if (Character.isUpperCase(x)) System.out.println("A");
        else System.out.println("a");
    }
}
