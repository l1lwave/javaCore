package lessonPredicate_first;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Hello", "World", "How", "Are", "You", "Fantastic", "Today"));

        Predicate<String> pr = a -> a.startsWith("F");
        words.removeIf(pr);
        System.out.println(words);
    }
}
