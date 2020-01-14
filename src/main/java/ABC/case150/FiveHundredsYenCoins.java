package ABC.case150;

import java.util.Scanner;

public class FiveHundredsYenCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        if (500 * k >= x) System.out.println("Yes");
        else System.out.println("No");
    }
}
