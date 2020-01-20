package ABC.case151;

import java.util.Scanner;

public class AchieveTheGoal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n-1; i++) sum += sc.nextInt();

        int ans = n * m - sum;

        if (ans > k) System.out.println(-1);
        else if (ans <= 0) System.out.println(0);
        else System.out.println(ans);
    }
}
