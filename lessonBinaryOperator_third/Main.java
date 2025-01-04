package lessonBinaryOperator_third;

import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<List<Integer>> binOp = createOperator();
        List<Integer> list1 = List.of(5, 0, 3, 4);
        List<Integer> list2 = List.of(10, -2, 5);
        System.out.println(binOp.apply(list1, list2));

        BinaryOperator<List<String>> binOpStr = createOperator();
        List<String> list3 = List.of("Hello", "World");
        List<String> list4 = List.of("Aсhtung", "World");
        System.out.println(binOpStr.apply(list3, list4));
    }

    public static <T extends Comparable<T>> BinaryOperator<List<T>> createOperator() {
        return (list1, list2) -> {
            T min1 = Collections.min(list1);
            T min2 = Collections.min(list2);

            return (min1.compareTo(min2) <= 0) ? list1 : list2;
        };
    }
}
