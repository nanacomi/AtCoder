package paiza.rankB;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class B055TaxiPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();

        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int firstX = sc.nextInt(), firstPrice = sc.nextInt();
            int addX = sc.nextInt(), addPrice = sc.nextInt();

            int price = firstPrice;
            if (firstX <= x) {
                for (int j = firstX; j <= x; j += addX) {
                    price += addPrice;
                }
            }
            prices.add(price);
        }

        System.out.print(prices.stream().min(Comparator.naturalOrder()).get() + " ");
        System.out.println(prices.stream().max(Comparator.naturalOrder()).get());
    }
}
