package lessonComparator_fourth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 3, 4, 12, 33, 11, 45, 8, 6, 9));

        Comparator<Integer> comp = (a, b) -> {
            if (isPrime(a) && isPrime(b)) {
                return Integer.compare(b, a);
            } else if (isPrime(a)) {
                return -1;
            } else if (isPrime(b)) {
                return 1;
            } else {
                return Integer.compare(a, b);
            }
        };

        list.sort(comp);
        Integer result = list.get(0);
        if (!isPrime(result)) result = Collections.min(list);

        System.out.println(result);
    }

    public static boolean isPrime(Integer number) {
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
