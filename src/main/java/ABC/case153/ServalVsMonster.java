package ABC.case153;

import java.util.Scanner;

public class ServalVsMonster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();

        int count = 0;
        for (int i = 0; i < h; i+=a) count++;
        System.out.println(count);
    }
}
