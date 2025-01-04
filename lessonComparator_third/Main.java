package lessonComparator_third;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(62, 2000, 306, 55));
        System.out.println(list);
        Comparator<Integer> comp = (a, b) -> {
          String strA = String.valueOf(Math.abs(a));
          String strB = String.valueOf(Math.abs(b));
          Integer sumA = Integer.parseInt(strA.substring(0, 1)) + Integer.parseInt(strA.substring(strA.length() - 1));
          Integer sumB = Integer.parseInt(strB.substring(0, 1)) + Integer.parseInt(strB.substring(strB.length() - 1));
          return sumA.compareTo(sumB);
        };

        list.sort(Comparator.nullsLast(comp));
        System.out.println(list);
    }
}
