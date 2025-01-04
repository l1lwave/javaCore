package lessonComparator_first;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tomy", 2);
        Cat cat2 = new Cat("Jerryng", 3);
        Cat cat3 = new Cat("Bob", 4);
        Cat cat4 = new Cat("Jack", 5);
        Cat cat5 = new Cat("Barry", 6);
        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};

        Comparator<Cat> comp = (a, b) -> a.getName().length() - b.getName().length();

        Arrays.sort(cats, comp);
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
    }
}
