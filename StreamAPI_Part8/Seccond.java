package StreamAPI_Part8;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Seccond {
    public static void main(String[] args) {
        Map<String, String> fileSizeType = Map.of(
                "Small", "<10 KB",
                "Medium", "10 KB - 1 MB",
                "Large", ">1 MB");

        Function<File, String> getFileSizeCategory = file -> {
            long size = file.length();
            if (size < 10 * 1024) {
                return "Small";
            } else if (size < 1 * 1024 * 1024) {
                return "Medium";
            } else {
                return "Large";
            }
        };

        Map<String, List<String>> groupedFiles = Arrays.stream(new File("JavaCore").listFiles())
                .filter(File::isFile)
                .collect(Collectors.groupingBy(
                        getFileSizeCategory,
                        Collectors.mapping(File::getName, Collectors.toList())
                ));

        groupedFiles.forEach((category, files) -> {
            System.out.println(category);
            System.out.println("\t" + fileSizeType.get(category) + ":");
            files.forEach(file -> System.out.println("\t\t" + file));
        });
    }
}
