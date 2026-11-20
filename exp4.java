import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world Hello Hadoop";
        String[] words = text.split(" ");

        Map<String, Integer> count = new HashMap<>();

        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        System.out.println(count);
    }
}