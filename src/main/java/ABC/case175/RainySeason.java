package ABC.case175;

import java.util.Scanner;

public class RainySeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.contains("RRR")) System.out.println(3);
        else if (s.contains("RR")) System.out.println(2);
        else if (s.contains("R")) System.out.println(1);
        else System.out.println(0);
    }
}
