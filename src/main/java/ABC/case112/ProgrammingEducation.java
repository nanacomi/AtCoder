package ABC.case112;

import java.util.Scanner;

public class ProgrammingEducation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
            return;
        } else System.out.println(sc.nextInt() + sc.nextInt());
    }
}
