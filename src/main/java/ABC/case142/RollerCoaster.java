package ABC.case142;

import java.util.*;

public class RollerCoaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(sc.nextInt() >= k) {
                count++;
            }
        }

        System.out.println(count);
    }
}