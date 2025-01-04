package lessonConsumer_first;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(List.of(2, 4, 12, 53, 3, 6, 7, 11));

        Consumer<Integer> cons = a -> {
            if (a % 2 != 0) System.out.println(a);
        };
        list.forEach(cons);
    }
}
