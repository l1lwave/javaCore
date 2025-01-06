package StreamAPI_Part6;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Third {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 2, 6, 13, 9, 55);

        BinaryOperator<Integer> bOp = (a, b) -> a > b ? a : b;

        Optional<Integer> max = list.stream().reduce(bOp);

        max.ifPresent(System.out::println);
    }
}
