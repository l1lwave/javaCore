package lessonSupplier_first;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> supplier = new StringSupplier("Hello World Java");
        String string;
        for (; (string = supplier.get()) != null; ) {
            System.out.println(string);
        }
    }
}

class StringSupplier implements Supplier<String> {
    List<String> list;
    int count = 0;
    public StringSupplier(String input) {
        this.list = new ArrayList<>(List.of(input.split(" ")));
    }

    @Override
    public String get() {
        if (count < list.size()) {
            String result = list.get(count);
            count++;
            return result;
        }
        return null;
    }
}
