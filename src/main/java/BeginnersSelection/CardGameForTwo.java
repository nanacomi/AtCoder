package BeginnersSelection;

import java.util.*;

public class CardGameForTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        Collections.reverse(list);

        int aliceSum = 0;
        int bobSum = 0;

        String turn = "a";

        for (int i = 0; i < count; i++) {
            if (turn == "a") {
                aliceSum = aliceSum + list.get(i);
                turn = "b";
            } else if (turn == "b") {
                bobSum = bobSum + list.get(i);
                turn = "a";
            }
        }

        System.out.println(aliceSum - bobSum);
    }
}
