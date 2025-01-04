package lessonConsumer_third;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args){
        File file = new File("file1.txt");

        BiConsumer<String, File> biCons = (String s, File f) -> {
            try (var writer = new FileWriter(f, true)) {
                writer.write(s);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        };

        biCons.accept("Hello ", file);
        biCons.accept("Java ", file);
        biCons.accept("World ", file);
    }
}
