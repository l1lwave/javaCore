package StreamAPI_Part1;

import java.io.File;
import java.util.Optional;
import java.util.stream.Stream;

public class Third {
    public static void main(String[] args) {
        String directoryPath = "/Users/kirill/MyProgramFiles/Java";
        File directory = new File(directoryPath);

        Optional<File> largestFile = Optional.ofNullable(directory.listFiles())
                .stream()
                .flatMap(file -> Stream.of(file))
                .filter(File::isFile)
                .max((f1, f2) -> Long.compare(f1.length(), f2.length()));

        largestFile.ifPresent(file -> System.out.println("Largest file: " + file.getAbsolutePath() + " (" + file.length() + " bytes)")
        );
    }
}
