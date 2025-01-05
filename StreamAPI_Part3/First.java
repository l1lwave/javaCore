package StreamAPI_Part3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) throws IOException {
        createURLFile();

        List<URL> list = Files.lines(Path.of("urls.txt"))
                .map(line -> {
                    try {
                        return new URL(line);
                    } catch (MalformedURLException e) {
                        throw new RuntimeException(e);
                    }
                })
                .filter(Objects::nonNull)
                .filter(First::isUrlAvailable)
                .collect(Collectors.toList());

        list.forEach(System.out::println);

    }

    public static boolean isUrlAvailable(URL url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            int responseCode = connection.getResponseCode();
            return responseCode >= 200 && responseCode < 400;
        } catch (IOException e) {
            return false;
        }
    }

    public static void createURLFile(){
        List<String> urls = List.of(
                "https://www.youtube.com/watch?v=P_MZQhMsiDA&t=14s",
                "https://github.com/l1lwave/javaCore/tree/main/StreamAPI_Part1",
                "https://filmi.my",
                "https://exampl.ua"
        );

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("urls.txt"))) {
            for (String url : urls) {
                writer.write(url);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
