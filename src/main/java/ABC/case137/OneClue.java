package ABC.case137;

import java.util.*;

public class OneClue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int x = sc.nextInt();

        for (int i = x - (k - 1); i < x + k; i++) {
            System.out.print(i + " ");
        }
    }
}