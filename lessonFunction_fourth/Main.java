    package lessonFunction_fourth;

    import java.util.Arrays;
    import java.util.function.BiFunction;

    public class Main {
        public static void main(String[] args) {
            BiFunction<String, String, String[]> bifunc = (a, b) -> {
                String[] text1 = a.split("[\\s!,.]");
                String[] text2 = b.split("[\\s!,.]");
                String result = "";

                for (String word1 : text1){
                    for (String word2 : text2){
                        if (word1.equals(word2) && !word1.isEmpty()) result += word1 + " ";
                    }
                }

                return result.split(" ");
            };

            System.out.println(Arrays.toString(bifunc.apply("Hello World!", "Hello World and Java")));
        }
    }
