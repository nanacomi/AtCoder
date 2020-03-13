package webdb;

import java.util.*;

public class L02DuplicateInspection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = sc.nextInt();

        int same = -1, no = -1;
        Arrays.sort(list);

        if (list[0] != 0) no = 0;
        for (int i = 1; i < n; i++) {
            if (list[i-1] == list[i]) same = list[i];
            if (list[i-1] == list[i]-2) no = list[i] - 1;
        }
        if (list[n-1] != n) no = n;
        if (same == -1) System.out.println("Correct");
        else System.out.println(same + " " + no);
    }
}
