package StreamAPI_Part5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class First {
    public static void main(String[] args) {
        createPathFile();

        Path pathToFile = Paths.get("path.txt");
        try {
            List<String> directories = Files.readAllLines(pathToFile);

            Optional<String> result = directories.stream()
                    .filter(dir -> {
                        try (Stream<Path> files = Files.list(Paths.get(dir))) {
                            return files.filter(p -> p.toString().endsWith(".txt")).count() > 3;
                        } catch (IOException e) {
                            return false;
                        }
                    })
                    .findFirst();

            result.ifPresentOrElse(
                    System.out::println,
                    () -> System.out.println("Не найдено каталогов с более чем 3 текстовыми файлами.")
            );
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void createPathFile(){
        List<String> urls = List.of(
                "/Users/kirill/MyProgramFiles/Java/javaCore",
                "/Users/kirill/MyProgramFiles/Java/javaCore/JavaCore",
                "/Users/kirill/MyProgramFiles/Java/JavaStart/lessons",
                "/Users/kirill/MyProgramFiles"
        );

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("path.txt"))) {
            for (String url : urls) {
                writer.write(url);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
