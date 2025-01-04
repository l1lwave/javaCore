package lessonConsumer_seccond;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        Consumer<String> consumer = a -> {
            for (String s : numbers){
                if(a.contains(s)){
                    list.add(a);
                    break;
                }
            }
        };

        consumer.accept("Hello World-12");
        consumer.accept("Hello Java");
        consumer.accept("Program w0rk");

        System.out.println(list);
    }
}
