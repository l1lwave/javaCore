package StreamAPI_Part2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fourth {
    public static void main(String[] args) {
        try {
            List<String> words = Files.lines(Path.of("/Users/kirill/MyProgramFiles/Java/javaCore/JavaCore/xmlSample.txt"))
                    .collect(Collectors.toList());

            List<String> result = words.stream()
                    .filter(line -> line.contains("<groupld>"))
                    .map(line -> line.replaceAll("<.*?>", ""))
                    .collect(Collectors.toList());

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
