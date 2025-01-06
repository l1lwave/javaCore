package StreamAPI_Part6;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        String text = "I live in a house near the mountains.";

        int wordsCount = Arrays.stream(text.split(" "))
                .filter(a -> a.length() > 4)
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println(wordsCount);
    }
}
