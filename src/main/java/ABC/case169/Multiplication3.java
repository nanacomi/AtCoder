package ABC.case169;

import java.math.BigDecimal;
import java.util.Scanner;

public class Multiplication3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.next());
        BigDecimal b = new BigDecimal(sc.next());
        System.out.println(a.multiply(b).setScale(0, BigDecimal.ROUND_DOWN));
    }
}
