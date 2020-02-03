package paiza.rankB;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LatestArrivalTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int n = sc.nextInt();
        List<LocalTime> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            times.add(LocalTime.of(sc.nextInt(), sc.nextInt()));
        }

        for (int i = n-1; 0 <= i; i--) {
            if (times.get(i).isBefore(LocalTime.of(9,0).minusMinutes(c).minusMinutes(b))) {
                LocalTime result = times.get(i).minusMinutes(a);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                System.out.println(result.format(formatter));
                return;
            }
        }

    }
}
