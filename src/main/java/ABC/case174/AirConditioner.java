package ABC.case174;

import java.util.Scanner;

public class AirConditioner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 30) System.out.println("Yes");
        else System.out.println("No");
    }
}
