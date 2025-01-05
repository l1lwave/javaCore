package StreamAPI_Part2;
import java.util.stream.Collectors;

public class Seccond {
    public static void main(String[] args) {
        String s = "Heлlo МиR JavaГor0 700Привет";
        String result = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == ' '))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
