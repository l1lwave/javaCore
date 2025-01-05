package StreamAPI_Part2;

import java.util.Arrays;
import java.util.List;

public class First {
    public static void main(String[] args) {
        String s = "Hello World JavaCore Privet";
        List<String> list = Arrays.asList(s.split(" "));

        List<String> resultList = list.stream()
                .filter(x -> x.length() > 5)
                .toList();

        String result = String.join(" ", resultList);
        System.out.println(result);
    }
}
