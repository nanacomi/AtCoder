package paiza.rankB;

import java.util.Scanner;

public class B024CutWithCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double SQUARED_R = r * r;
        double R_DEVIDED_BY_SQRT2 = r / Math.sqrt(2);
        double LARGEST_SQUARE = R_DEVIDED_BY_SQRT2 * R_DEVIDED_BY_SQRT2;


        double temp = 0;
        for (double x = R_DEVIDED_BY_SQRT2 + 1; x < r; x++) {
            double y = Math.sqrt(SQUARED_R - x * x);
            temp += y;
        }

        double result = 4 * (2 * temp + LARGEST_SQUARE) + 4 * r + 1;

        System.out.println(result);

        Math.sqrt(r * r - 1);



        System.out.println((int) Math.ceil(count(r)));
    }

    public static double count(double m) {
        int check = 0;
        for (int k = 1; k < m; k++) {
            for (int l = 0; l < m; l++) {
                if(k*k+l*l<=m*m){
                    check++;
                }
            }

        }
        return ((check*4+m*4+1)/(m*m));
    }
}
