package lessonFunction_first;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {5, 6, 7, 8, 9, 10};

        Function<Integer[], Integer> func = a -> {
            int primeNumber = 0;
            Predicate<Integer> pr = Main::isPrime;
            for (Integer integer : a) {
                if (pr.test(integer)) primeNumber++;
            }
            return primeNumber;
        };

        System.out.println(func.apply(numbers));
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
