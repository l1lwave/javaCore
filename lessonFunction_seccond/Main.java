package lessonFunction_seccond;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> func = a -> {
            char[] chars = a.toCharArray();
            int count = 0;
            for (char c : chars) {
                if ("AEIOUaeiou".contains(String.valueOf(c))) count++;
            }
            return count;
        };

        System.out.println(func.apply("Hello World and JAVA!"));
    }
}
