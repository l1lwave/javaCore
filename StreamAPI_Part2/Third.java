package StreamAPI_Part2;

import java.util.List;
import java.util.stream.Collectors;

public class Third {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 5);
        Cat cat2 = new Cat("Amka", 7);
        Cat cat3 = new Cat("Barsic", 2);
        Cat cat4 = new Cat("Linny", 3);

        List<Cat> catList = List.of(cat1, cat2, cat3, cat4);

        List<Cat> resultList = catList.stream()
                .filter(cat -> cat.getWeight() > 3)
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .collect(Collectors.toList());

        System.out.println(resultList);
    }
}
