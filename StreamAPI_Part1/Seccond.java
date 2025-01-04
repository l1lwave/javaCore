package StreamAPI_Part1;

import java.util.List;
import java.util.stream.Collectors;

public class Seccond {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 5, 1, 2, 7, 6);

        List<Integer> list2 = list.stream().filter(x -> x % 2 != 0).sorted().collect(Collectors.toList());
        System.out.println(list2);
    }
}
