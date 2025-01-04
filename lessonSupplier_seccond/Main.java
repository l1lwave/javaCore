package lessonSupplier_seccond;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Hello", "world", "Java"));
        Predicate<String> pr = s -> Character.isUpperCase(s.charAt(0));
        Supplier<String> supp = new SupplierString(list, pr);
        String string;
        for (; (string = supp.get()) != null; ) {
            System.out.println(string);
        }
    }
}

class SupplierString implements Supplier<String> {
    private final List<String> list;
    private final Predicate<String> pr;
    private int counter = 0;
    public SupplierString(List<String> list, Predicate<String> pr) {
        this.list = list;
        this.pr = pr;
    }

    @Override
    public String get() {
        while (counter < list.size()) {
            String current = list.get(counter++);
            if (pr.test(current)) {
                return current;
            }
        }
        return null;
    };
}

