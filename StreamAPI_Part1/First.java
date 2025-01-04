package StreamAPI_Part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class First {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 5);
        Cat cat2 = new Cat("Umka", 7);
        Cat cat3 = new Cat("Barsic", 2);
        Cat cat4 = new Cat("Linny", 3);

        List<Cat> catList = List.of(cat1, cat2, cat3, cat4);

        try{
            Optional<Cat> catMaxName = catList.stream().max((a, b) -> a.getName().length() - b.getName().length());
            System.out.println(catMaxName.get().getName());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception for cat");
        }

    }
}
