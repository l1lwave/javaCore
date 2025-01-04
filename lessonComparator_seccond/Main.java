package lessonComparator_seccond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(-5, 5, 6, -10, 3, 6, 8, -3));
        list.add(null);

        Comparator<Integer> comp1 = Comparator.nullsLast((a, b) -> Math.abs(a) - Math.abs(b));
        Comparator<Integer> comp2 = Comparator.nullsLast((a, b) -> b.compareTo(a));
        Comparator<Integer> compResult = comp1.thenComparing(comp2);
        System.out.println(Collections.min(list, compResult));
    }
}

