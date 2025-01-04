package lessonPredicate_seccond;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Hello", "World", "How", "Are", "You", "Fantastic", "Today"));
        char[] symbols = new char[]{'h', 'w', 'a'};

        Predicate<String> pr = a -> {
            for (char symbol : symbols) {
                if (a.toLowerCase().startsWith(String.valueOf(symbol))) {
                    return true;
                }
            }
            return false;
        };

        words.removeIf(pr);
        System.out.println(words);
    }
}
