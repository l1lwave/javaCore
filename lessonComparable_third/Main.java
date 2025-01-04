package lessonComparable_third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Tom", 2));
        cats.add(new Cat("Jerry", 3));
        cats.add(new Cat("Alexander", 1));
        cats.add(new Cat("Bob", 4));
        Collections.sort(cats);

        System.out.println(cats);
    }
}
