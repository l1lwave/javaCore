package lessonPredicate_fifth;

import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        int number = 103;

        IntPredicate predicate = a -> {
            String numberStr = Integer.toString(a);
            int sum = 0;

            for (int i = 0; i < numberStr.length(); i++) {
                char digitChar = numberStr.charAt(i);
                int digit = Character.getNumericValue(digitChar);
                sum += digit;
            }

            return sum % 2 == 0;
        };

        System.out.println(predicate.test(number));
    }
}
