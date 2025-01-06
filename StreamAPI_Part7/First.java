package StreamAPI_Part7;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class First {
    public static void main(String[] args) {
        Set<String> set = Set.of("a", "b", "c", "hello", "world");
        Collector<String, Set<String>, Set<String>> collector = new toSetClass<>();

        Set<String> collect = set.stream().collect(collector);
        System.out.println(collect);
    }
}

class toSetClass<T> implements Collector<T, Set<T>, Set<T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        return Set::add;
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        return (a, b) -> {
            a.addAll(b);
            return a;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.UNORDERED, Characteristics.IDENTITY_FINISH);
    }
}
