package lessonUnaryOperator_seccond;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<String> unOp = s -> s.replaceAll("[^\\d]", "");

        System.out.println(unOp.apply("Hello World 123"));
    }
}
