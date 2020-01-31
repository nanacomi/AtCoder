package paiza.rankB;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ConvertingToPlural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] list = new String[n];
        for (int i = 0; i < n; i++) list[i] = sc.next();

        for (int i = 0; i < n; i++) {
            List<String> word = new LinkedList(Arrays.asList(list[i].split("")));
            if (word.get(word.size()-1).equals("s")
                    || (word.get(word.size()-2) + word.get(word.size()-1)).equals("sh")
                    || (word.get(word.size()-2) + word.get(word.size()-1)).equals("ch")
                    || word.get(word.size()-1).equals("o")
                    || word.get(word.size()-1).equals("x")) {
                System.out.println(list[i]+"es");
            } else if (word.get(word.size()-1).equals("f")) {
                word.set(word.size()-1, "ves");
                System.out.println(String.join("", word));
            } else if ((word.get(word.size()-2) + word.get(word.size()-1)).equals("fe")) {
                word.set(word.size()-2, "ves");
                word.remove(word.size()-1);
                System.out.println(String.join("", word));
            } else if (word.get(word.size()-1).equals("y") &&
                    (!word.get(word.size()-2).equals("a")
                            &&!word.get(word.size()-2).equals("i")
                            &&!word.get(word.size()-2).equals("u")
                            &&!word.get(word.size()-2).equals("e")
                            &&!word.get(word.size()-2).equals("o"))) {
                word.set(word.size()-1, "ies");
                System.out.println(String.join("", word));
            } else {
                System.out.println(String.join("", word) +"s");
            }
        }
    }
}
