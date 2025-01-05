package StreamAPI_Part4;

import java.util.List;

public class Third {
    public static void main(String[] args) {
        List<Integer> list = List.of(8, 10, 28, 334, 32, 3, 7, 346137);

        list.stream()
                .filter(x -> x > 10)
                .sorted((a, b) -> getLastNumber(a) - getLastNumber(b))
                .forEach(System.out::println);
    }
    
    public static Integer getLastNumber(Integer num) {
        String str = String.valueOf(num);
        return Integer.parseInt(str.substring(str.length()-1));
    }
}
