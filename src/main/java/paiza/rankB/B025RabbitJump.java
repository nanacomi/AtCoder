package paiza.rankB;

import java.util.Scanner;

public class B025RabbitJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int place = sc.nextInt(), rabbit = sc.nextInt(), jump = sc.nextInt();

        int[] now = new int[rabbit];
        boolean[] exist = new boolean[place];
        for (int i = 0; i < rabbit; i++) {
            int x = sc.nextInt() - 1;
            now[i] = x;
            exist[x] = true;
        }

        for (int i = 0; i < jump; i++) {
            for (int j = 0; j < rabbit; j++) {
                int next = next(exist, place, now[j]);
                exist[now[j]] = false;
                exist[next] = true;
                now[j] = next;
            }

        }

        for (int i = 0; i < rabbit; i++) System.out.println(now[i]+1);
    }

    private static int next(boolean[] exist, int n, int next) {
        if (n <= next) next = 0;
        if (!exist[next]) return next;
        return next(exist, n, next + 1);
    }
}
