package lessonFunction_third;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, char[]> func1 = String::toCharArray;
        Function<char[], Integer> func2 = a -> {
            int count = 0;
            for (char c : a) {
                count += c;
            }
            return count;
        };

        Function<String, Integer> func3 = func1.andThen(func2);
        System.out.println(func3.apply("Hello World and JAVA!"));
    }
}
