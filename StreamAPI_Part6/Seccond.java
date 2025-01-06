package StreamAPI_Part6;

import java.util.List;

public class Seccond {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = list.stream().reduce(1, (x, y) -> x * y);

        System.out.println(result);
    }
}
