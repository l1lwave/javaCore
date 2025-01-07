package StreamAPI_Part8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, String> evenOddStrings = list.stream()
                .collect(Collectors.partitioningBy(
                        num -> num % 2 == 0,
                        Collectors.mapping(
                                String::valueOf,
                                Collectors.joining(";")
                        )
                ));

        String evenNumbers = evenOddStrings.get(true);
        String oddNumbers = evenOddStrings.get(false);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
