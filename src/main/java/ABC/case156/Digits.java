package ABC.case156;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();

        String map = Integer.toString(n, k);
        System.out.println(map.split("").length);
    }
}