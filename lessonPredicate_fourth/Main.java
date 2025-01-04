package lessonPredicate_fourth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "To");
        map.put(3, "World");
        map.put(4, "Java");

        BiPredicate<Integer, String> predicate = (key, value) -> key != value.length();

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (predicate.test(entry.getKey(), entry.getValue())) {
                iterator.remove();
            }
        }

        System.out.println("Map contents: " + map);
    }
}
