package StreamAPI_Part4;

import java.util.Arrays;
import java.util.stream.Stream;


public class First {
    public static void main(String[] args) {
        String text = "I live in a house near the mountains.";

        Stream<String> wordsStream = Arrays.stream(text.split(" "))
                .filter(word -> countVowelLetters(word) > 0)
                .sorted((a, b) -> countVowelLetters(a) - countVowelLetters(b));

        wordsStream.forEach(System.out::println);
    }

    public static int countVowelLetters(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                if (vowels.contains(String.valueOf(word.charAt(i)))) {
                    count++;
                }
            }
        }
        return count;
    }
}
