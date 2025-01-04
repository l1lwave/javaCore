package lessonBinaryOperator_first;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Comparator<String> comp = (a, b) -> Integer.compare(a.length(), b.length());
        BinaryOperator<String> binOp = BinaryOperator.maxBy(comp);
        String s = binOp.apply("Hola", "World");
        System.out.println(s);
    }
}
