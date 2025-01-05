package StreamAPI_Part3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Seccond {
    public static void main(String[] args) {
        Singer singer1 = new Singer ("David Bowie",
                new String[] { "Space Oddity", "Let Me Sleep Beside You", "Suffragette City", "Starman", "Heroes"});
        Singer singer2 = new Singer ("James Paul McCartney",
                new String[] { "Can't Buy Me Love", "Another Girl", "Coming Up", "On the Way", "Nobody Knows" });
        Singer[] rockStars = new Singer[] { singer1, singer2 };

        List<String> song = Arrays.stream(rockStars)
                .flatMap(n-> Arrays.stream(n.getSongs()))
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(song);
    }
}

class Singer {
    private String name;
    private String[] songs;
    public Singer (String name, String[] songs) {
        super();
        this.name = name;
        this.songs = songs;
    }
    public String[] getSongs() {
        return songs;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Singer [name=" + name + ", songs=" + Arrays.toString(songs) + "]";
    }
}