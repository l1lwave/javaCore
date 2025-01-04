package lessonPredicate_third;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 2);
        Cat cat2 = new Cat("Jerry", 3);
        Cat cat3 = new Cat("Bob", 4);
        Cat cat4 = new Cat("Jack", 5);
        Cat cat5 = new Cat("Barry", 6);
        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));

        filterCats(cats, 'B', 4);

        System.out.println(cats);
    }

    public static List<Cat> filterCats(List<Cat> cats, char symbol, int age) {
        Predicate<Cat> pr1 = cat -> {
            char firstLetter = cat.getName().toUpperCase().charAt(0); // Беремо першу літеру імені
            return firstLetter > Character.toUpperCase(symbol);
        };
        Predicate<Cat> pr2 = cat -> cat.getAge() < age;
        cats.removeIf(pr1.and(pr2));
        return cats;
    }
}
