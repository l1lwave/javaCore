package StreamAPI_Part7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collector;

public class Seccond {
    public static void main(String[] args) {
        Predicate<String> pred = Seccond::countVowelLetters;
        Collector<String, Map<String, Integer>, Map<String, Integer>> collector = new WordMap(pred);

        String text = "I live Ln a hrtgfs near th mountains.";
        Map<String, Integer> map = Arrays.stream(text.split(" ")).collect(collector);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public static boolean countVowelLetters(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                if (vowels.contains(String.valueOf(word.charAt(i)))) {
                    return true;
                }
            }
        }
        return false;
    }
}

class WordMap implements Collector<String, Map<String, Integer>, Map<String, Integer>> {
    Predicate<String> predicate;

    public WordMap(Predicate<String> predicate) {
        this.predicate = predicate;
    }

    @Override
    public Supplier<Map<String, Integer>> supplier() {
        return HashMap::new;
    }

    @Override
    public BiConsumer<Map<String, Integer>, String> accumulator() {
        return (map, word) -> {
            if (predicate.test(word)) {
                Integer count = map.getOrDefault(word, 0);
                map.put(word, count + 1);
            }
        };
    }

    @Override
    public BinaryOperator<Map<String, Integer>> combiner() {
        return (map1, map2) -> {
            Map<String, Integer> combined = new HashMap<>();
            map2.forEach((k, v) -> {
                Integer count = map2.getOrDefault(k, 0);
                combined.put(k, count + v);
            });
            return combined;
        };
    }

    @Override
    public Function<Map<String, Integer>, Map<String, Integer>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.UNORDERED, Characteristics.IDENTITY_FINISH);
    }
}
