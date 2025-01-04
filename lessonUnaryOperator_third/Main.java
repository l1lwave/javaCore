package lessonUnaryOperator_third;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>(List.of("Hello", "Java", "Hi", "Autumn"));

        UnaryOperator<List<String>> unOp = list -> {
          list.removeIf(str -> str.length() < 5);
          return list;
        };

        System.out.println(unOp.apply(listStr));
    }
}
