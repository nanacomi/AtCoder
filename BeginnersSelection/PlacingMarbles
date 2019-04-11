import java.util.*;
public class Main {
	public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      String number = sc.next();

      List<String> array = Arrays.asList(number.split(""));

      long count = array.stream()
        .filter(a -> a.contains("1"))
        .count();

      System.out.println(count);
    }
}
