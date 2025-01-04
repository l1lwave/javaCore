package lessonBinaryOperator_seccond;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<List<Integer>> binOp = (a, b) -> {
            List<Integer> list = new ArrayList<>(a);
            list.retainAll(b);
            return list;
        };

        List<Integer> listA = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> listB = new ArrayList<>(List.of(3, 5, 3));

        System.out.println(binOp.apply(listA, listB));
    }
}
