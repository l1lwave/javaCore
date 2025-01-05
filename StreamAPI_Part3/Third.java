package StreamAPI_Part3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Third {
    public static void main(String[] args) {
        Path directoryPath = Paths.get("/Users/kirill/MyProgramFiles/Java/javaCore/JavaCore");

        try (Stream<Path> fileStream = Files.list(directoryPath)) {
            List<String> txtFiles = fileStream
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".txt"))
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());

            System.out.println(".txt Files: " + txtFiles);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
