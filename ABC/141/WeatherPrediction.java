import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if (s.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (s.equals("Cloudy")) {
            System.out.println("Rainy");
        } else if (s.equals("Rainy")) {
            System.out.println("Sunny");
        }
    }
}