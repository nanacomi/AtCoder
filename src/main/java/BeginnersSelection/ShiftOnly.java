package BeginnersSelection;

import java.util.*;
public class ShiftOnly {
	public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      int count = sc.nextInt();

      int bit = 0;
      for (int i=0; i<count; i++) {
        bit |= sc.nextInt();
      }
      System.out.println(Integer.numberOfTrailingZeros(bit));

	}
}
